package constructor.quiz2;

public class Car {

	public static void main(String[] args) {
		
		// new 하고 ctrl + space로 생성자 호출
		// 호출 후 초기화를 따로 해줘야함
		Car car1 = new Car();
		car1.color = "레드";
		car1.company = "현대";
		car1.maxSpeed = 100;
		car1.modelNo = 123;
		
		// 생성 하자마자 초기화 바로 할 수 있음
		Car car2 = new Car("기아", 123, "blue", 123);
		
	}
	
	// company(파란색) 멤버변수 : 클래스의 속성
	String company;
	int modelNo;
	String color;
	int maxSpeed;
	
	public Car() {
		super();
	}
	
	public Car(String company, int modelNo, String color, int maxSpeed) {
		super();
		// company(갈색) 매개변수는 지역변수(안에서만 사용)
		this.company = company;
		this.modelNo = modelNo;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		System.out.println("제조사 : " + company 
				+ "색상 : " + color 
				+ "최고속도 : " + maxSpeed
				+ "모델명 : " + modelNo);
	}
	
}
