package com.marvel.movie;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarvelMovieService {

	@Autowired
	MarvelMovieMapper marvelMovieMapper;

	// 리스트 조회하기
	public List<MarvelMovie> AllMarvelMovieList() {
		return marvelMovieMapper.selectMarvel();
	}

	public MarvelMovie MarvelMovieList(int id) {
		return marvelMovieMapper.selectMovie(id);
	}

	// 등록하기
	public MarvelMovie insertMarvelMovie(MarvelMovie marvelMovie) {
		marvelMovie.setRegistrationTime(LocalDateTime.now());
		int row = marvelMovieMapper.insertMarvel(marvelMovie);

		if (row == 1) {
			return new MarvelMovie(marvelMovie.getId(), marvelMovie.getTitleKor(), marvelMovie.getTitleEng(), marvelMovie.getReleaseDate(), 
					marvelMovie.getDirector(), marvelMovie.getActor(), marvelMovie.getRegistrationTime(), marvelMovie.getModificationTime());
		} else {
			return null;
		}
	}

	// 수정하기
	public MarvelMovie updateMarvelMovie(MarvelMovie marvelMovie) {
		marvelMovie.setModificationTime(LocalDateTime.now());
		int row = marvelMovieMapper.updateMarvelMovie(marvelMovie);

		if (row == 1) {
			return new MarvelMovie(marvelMovie.getId(), marvelMovie.getTitleKor(), marvelMovie.getTitleEng(), marvelMovie.getReleaseDate(), 
					marvelMovie.getDirector(), marvelMovie.getActor(), marvelMovie.getRegistrationTime(), marvelMovie.getModificationTime());
		} else {
			return null;
		}
	}

	// 삭제하기
	public int deleteMarvelMovie(int mavelId) {
		return marvelMovieMapper.deleteMarvelMovie(mavelId);
	}
}
