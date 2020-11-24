package com.javaex.ex03;

public class Song {
	
	private String title; //노래제목
	private String artist; //가수
	private String album; //앨범제목
	private String composer; //작곡가
	private int year; //연도
	private String track; //앨범트랙번호
	
	//생성자
	//메소드 유사하다 이름은 클래스명 리턴형이 없다
	public Song() {
		//메모리에 올린다
	}
	
	public Song(String title, String artist, String album, String composer, int year, String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	//노래제목
	public void setTitle(String title) {
		this.title = title;
	} 
	
	public String getTitle() {
		return title;
	}
	
	//가수
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	//앨범제목
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}
	
	//작곡가
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}
	
	//연도
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	//트랙번호
	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getTrack() {
		return track;
	}
	
	//showInfo
	public void showInfo() {
		System.out.println(artist+", "+title+"( "+album+", "+year+", "+track+", "+composer+" )");
	}

}
