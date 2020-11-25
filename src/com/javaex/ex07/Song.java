package com.javaex.ex07;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	public Song() {
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, track);
		
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;

	}

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	/*
	 * 생성자가 중복되서 사용 x public Song(String title, String album) { super(); this.title
	 * = title; 
	 * this.album = album; 
	 * }
	 */

	//파라미터의 자료형이 달라서 사용 가능
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
		if(track < 1) {
			this.track = 0;
		}else {
			this.track = track;
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void showInfo() {
		System.out.println(
				artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track" + composer + " 작곡");
	}

}
