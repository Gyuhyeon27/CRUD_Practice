package com.marvel.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/marvelMovie")
public class MarvelMovieController {
	
	@Autowired
	MarvelMovieService marvelMovieService;
	
	//전체조회
	@GetMapping("/allList")
	public String marvelMovieList(Model model) {
		// 서비스를 통해 데이터를 가져옴
		List<MarvelMovie> allList = marvelMovieService.AllMarvelMovieList();
		
		//모델을 통해 데이터를 담음
		model.addAttribute("allList", allList);
		
		// 결과 화면으로 데이터 전송
		return "allList";
	}
	@GetMapping("/movieList")
	public String movieList(Model model, int id) {
		MarvelMovie movie = marvelMovieService.MarvelMovieList(id);
		
		model.addAttribute("movie",movie);
		
		return "movieList";
	}
	
	// 등록하기
	@GetMapping("/insert")
	public String showInsertMarvelMovie() {
		return "movieInsert";
	}
	
	@PostMapping("/insert")
	public String InsertMarvelMovie(Model model, MarvelMovie marvelMovie) {
		
		MarvelMovie resultMovie = marvelMovieService.insertMarvelMovie(marvelMovie);
		
		model.addAttribute("resultMovie", resultMovie);
		
		return "result";
	}
	
	//수정하기
	@GetMapping("/update")
	public String showUpdateMarvelMovie(Model model, int id) {
		MarvelMovie movieList = marvelMovieService.MarvelMovieList(id);
		
		model.addAttribute("movieList",movieList);
		
		return "movieUpdate";
	}
	
	@PostMapping("/update")
	public String updateMarvelMovie(Model model, MarvelMovie marvelMovie) {
		MarvelMovie resultMovie = marvelMovieService.updateMarvelMovie(marvelMovie);
		
		model.addAttribute("resultMovie", resultMovie);
		
		return "result";
	}
	
	//삭제하기
	@GetMapping("/delete")
	public String deleteMarvelMovie(Model model, int id) {
		int marvelMovie = marvelMovieService.deleteMarvelMovie(id);
		
		model.addAttribute("marvelMovie",marvelMovie);
		
		return "movieDelete";
	}
}
