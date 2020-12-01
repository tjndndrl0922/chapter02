package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {

		/*
		 * //test -->섞어쓰기 //자료형을 통일하기위해 Person s01 = new Student("유재석",44,"양지고등학교");
		 * //자식쪽 Student의 정보를 사용할 수 없다 //s01.getSchoolName(); 사용 할 수 없다. s01.showInfo();
		 * //자식쪽의 showInfo()가 실행됨. 덮어쓴다. 오버라이딩 //부모쪽의 showInfo() X
		 * System.out.println(s01.toString()); //Student의 toString() 이 작동.
		 */

		Person[] psArray = new Person[6];
		Person p01 = new Person("둘리", 1205);
		Person p02 = new Person("도우너", 1100);
		Person p03 = new Person("마이콜", 300);

		Person s01 = new Student("유재석", 44, "서울고등학교");
		Person s02 = new Student("강호동", 47, "환일고등학교");
		Person s03 = new Student("서웅기", 28, "양지고등학교");

		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;

		psArray[3] = s01;
		psArray[4] = s02;
		psArray[5] = s03;
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}

		System.out.println(((Student)psArray[3]).getSchoolName());
		((Student)psArray[4]).setSchoolName("마산고등학교");
		
		for(int i=0; i<psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		//케스팅 테스트
		Person t01 = psArray[4]; 
		Student t02 = (Student)psArray[4];
	}

}
