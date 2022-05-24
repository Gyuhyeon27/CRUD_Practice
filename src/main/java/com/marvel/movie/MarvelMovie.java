package com.marvel.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class MarvelMovie {
	
	private int id;
	private String titleKor;
	private String titleEng;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate releaseDate;
	private String director;
	private String actor;
	private LocalDateTime registrationTime;
	private LocalDateTime modificationTime;
	
	public MarvelMovie(int id, String titleKor, String titleEng, LocalDate releaseDate, String director, String actor,
			LocalDateTime registrationTime, LocalDateTime modificationTime) {
		super();
		this.id = id;
		this.titleKor = titleKor;
		this.titleEng = titleEng;
		this.releaseDate = releaseDate;
		this.director = director;
		this.actor = actor;
		this.registrationTime = registrationTime;
		this.modificationTime = modificationTime;
	}

	public MarvelMovie() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitleKor() {
		return titleKor;
	}

	public void setTitleKor(String titleKor) {
		this.titleKor = titleKor;
	}

	public String getTitleEng() {
		return titleEng;
	}

	public void setTitleEng(String titleEng) {
		this.titleEng = titleEng;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public LocalDateTime getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(LocalDateTime registrationTime) {
		this.registrationTime = registrationTime;
	}

	public LocalDateTime getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(LocalDateTime modificationTime) {
		this.modificationTime = modificationTime;
	}

	@Override
	public String toString() {
		return "MarvelMovie [id=" + id + ", titleKor=" + titleKor + ", titleEng=" + titleEng + ", releaseDate="
				+ releaseDate + ", director=" + director + ", actor=" + actor + ", registrationTime=" + registrationTime
				+ ", modificationTime=" + modificationTime + "]";
	}
}
