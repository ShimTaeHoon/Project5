package instance;

public class Ex3 {

	public static void main(String[] args) {

		Car car = new Car(); // 객체 생성
		car.setStatus(true); // 현재상태 변경
		car.showStatus(); // 현재상태 출력
		
	}

}

// 자동차를 정의하는 클래스
class Car {
	
	boolean status; // 현재상태 // 주행 or 정지 // 속성1
	
	// 현재상태를 변경하는 메소드 선언
	// set는 return값은 없고 매개변수는 있음.
	public void setStatus(boolean stt) { // set 수정
		status = stt;
	}
	
	// 현재 상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}
	
}

