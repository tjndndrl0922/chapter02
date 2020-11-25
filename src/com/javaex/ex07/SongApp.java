package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {

		Song s00 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		System.out.println(s00.toString());

		Song s01 = new Song();
		s01.setTitle("거짓말");
		s01.setArtist("BIGBANG");
		s01.setAlbum("Always");
		s01.setComposer("G-DRAGON");
		s01.setYear("2007");
		s01.setTrack(2);
		System.out.println(s01.toString());
		
		Song s02 = new Song("벚꽃엔딩","버스커버스커");
		s02.setAlbum("버스커버스커1집");
		s02.setComposer("장범준");
		s02.setYear("2012");
		s02.setTrack(4);
		System.out.println(s02.toString());
	}	

}
