package constructor;

public class Ex2 {

	public static void main(String[] args) {
		
		// 첫번째 생성자 사용
		Person person1 = new Person();
		person1.name = "둘리";
		person1.weight = 80;
		person1.height = 180;
		// 두번째 생성자 사용
		Person person2 = new Person("또치");
		person2.weight = 50;
		person2.height = 160;
		// 세번째 생성자 사용
		Person person3 = new Person("도우너", 170, 60);

	}

}

// 사람을 정의하는 클래스 // 정의 클래스를 만들때 main메서드보다 먼저 작성 이후 main
class Person {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	
	// 원래 한 클래스 안에서 person() 함수는 중복이 되지 않음
	// 가능한 이유는 *오버 로딩*
	// 함수 이름이 똑같아도 매개변수가 다르면 오버로딩이 되서 중복되도 괜찮음
	// (매개변수까지 똑같은 함수는 안됨)
	// 디폴트 생성자: 객체만 생성
	public Person() {
		
	}
	
	// 이름을 받아서 초기화하는 생성자
	public Person(String nm) {
		name = nm;
	}
	
	// 이름, 키, 몸무게를 받아서 초기화하는 생성자
	public Person(String nm, int he, int we) {
		name = nm;
		height = he;
		weight = we;
	}
}

