package instance.quiz;

public class Person {

	// 다음과 같이 사람클래스(Person)을 정의하세요.
	// 속성 : 이름, 나이, 결혼여부, 자식수
	
	String name; // 이름
	String age; // 나이
	boolean isMarried; // 결혼여부
	int child; // 자식수
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("결혼여부 : " + isMarried);
		System.out.println("자식수: " + child);
	}
	
}

