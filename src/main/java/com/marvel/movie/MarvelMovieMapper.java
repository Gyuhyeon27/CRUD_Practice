package com.marvel.movie;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MarvelMovieMapper {

	// 전체 리스트 조회
	@Select("select * from marvel_movie")
	public List<MarvelMovie> selectMarvel();

	@Select("select * from marvel_movie where id=#{id}")
	public MarvelMovie selectMovie(int id);

	// 등록하기
	@Insert("insert into marvel_movie(id, title_kor, title_eng, release_date, director, actor, registration_time, modification_time)"
			+ " values(#{id}, #{titleKor}, #{titleEng}, #{releaseDate}, #{director}, #{actor}, #{registrationTime}, #{modificationTime})")
	public int insertMarvel(MarvelMovie marvelMovie);

	// 수정하기
	@Update("update marvel_movie set title_kor=#{titleKor}, title_eng=#{titleEng}, release_date=#{releaseDate}, "
			+ "director=#{director}, actor= #{actor}, registration_time=#{registrationTime}, modification_time=#{modificationTime} where id=#{id}")
	public int updateMarvelMovie(MarvelMovie marvelMovie);

	// 삭제하기
	@Delete("delete from marvel_movie where id = #{id}")
	public int deleteMarvelMovie(int id);
}
