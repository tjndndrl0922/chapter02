package com.javaex.ex03;

public class SongApp {
	
	public static void main(String[] args) {
		/*
		//아이유
		Song iu = new Song();
		iu.setTitle("좋은날");
		String iuTitle = iu.getTitle();
		
		iu.setArtist("아이유");
		String iuArtist = iu.getArtist();
		
		iu.setAlbum("Real");
		String iuAlbum = iu.getAlbum();
		
		iu.setComposer("이민수 작곡");
		String iuComposer = iu.getComposer();
		
		iu.setYear(2010);
		int iuYear = iu.getYear();
		
		iu.setTrack("3번 track");
		String iuTrack = iu.getTrack();
		iu.showInfo();
		
		//빅뱅
		Song bigbang = new Song();
		bigbang.setTitle("거짓말");
		String bigbangTitle = bigbang.getTitle();
		
		bigbang.setArtist("BIGBANG");
		String bigbangArtist = bigbang.getArtist();
		
		bigbang.setAlbum("Always");
		String bigbangAlbum = bigbang.getAlbum();
		
		bigbang.setComposer("G-Dragon 작곡");
		String bigbangComposer = bigbang.getComposer();
		
		bigbang.setYear(2007);
		int bigbangYear = bigbang.getYear();
		
		bigbang.setTrack("4번 track");
		String bigbangTrack = bigbang.getTrack();
		bigbang.showInfo();
		
		//버스커버스커
		Song busker = new Song();
		busker.setTitle("벚꽃엔딩");
		String buskerTitle = busker.getTitle();
		
		busker.setArtist("버스커버스커");
		String buskerArtist = busker.getArtist();
		
		busker.setAlbum("버스커버스커1집");
		String buskerAlbum = busker.getAlbum();
		
		busker.setComposer("장범준 작곡");
		String buskerComposer = busker.getComposer();
		
		busker.setYear(2012);
		int buskerYear = busker.getYear();
		
		busker.setTrack("4번 track");
		String buskerTrack = busker.getTrack();
		busker.showInfo();
		*/
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수 작곡");
		s01.setYear(2010);
		s01.setTrack("3번 track");
		s01.showInfo();
		
		Song s02 = new Song("거짓말", "BIGBANG","Always","G-Dragon 작곡", 2007, "4번 Track" );
		s02.showInfo();
		
		Song s03 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준 작곡", 2012, "4번 track");
		s03.showInfo();
		
		
		
		
		
		
	}
	
	

}
