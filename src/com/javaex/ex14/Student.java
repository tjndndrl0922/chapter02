package com.javaex.ex14;

public class Student extends Person {

	// 필드
	private String schoolName;

	// 생성자
	public Student() {
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String SchoolName) {
		// 1. 자신의 생성자 시작--> 완료x
		// 2. 부모의 생성자 호출
		// -부모의 생성자를 선택할 수 있다.
		// -선택하지 않으면 디폴트 생성자가 실행된다.
		// 3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료한다.

		// 부모생성자 호출방법
		// 표기 없으면 디폴트 생성자 호출
		// 선택을 하면선택한 생성자 호출
		// ex)super(파라미터)

		// 메모리올리는 작업
		// Person(); 부모쪽 생성자 실행 - super();
		super(name, age);
		this.schoolName = SchoolName;
		System.out.println("Student(3)");
	}

	// 메소드 -g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 - 일반
	public void showInfo() {
		System.out.println(super.getName()); //자식에 Name Age 파라미터가 없다면 super. 생략 가능
		System.out.println(getAge());
		System.out.println(schoolName);
		
		System.out.println("이름:"+getName()+" 나이:"+getAge()+" 학교:"+schoolName);
		System.out.println("이름:"+name+" 나이:"+age+" 학교:"+schoolName); //protected 접근제한자로 변환시에 가능
		
	}
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}

}
