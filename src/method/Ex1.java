package method;

public class Ex1 {

	// void = 리턴타입 / method1 = 함수이름 / () = 매개변수
	// () <- 아무것도 없으면 필요한 값이 없다는 뜻
	public static void method1() {
		System.out.println("매개변수와 리턴타입이 둘 다 없는 메소드 입니다");
		return; // void일때는 return생략 가능(리턴값이 없어서)
	}
	
	// 리턴 타입 일치 시켜줘야 함
	// 함수를 실행할때 필요한 값은 없지만 문자열을 반환하겠다
	public static String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드";
	}
	
	// 매개변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
	}
	
	// 매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) { // 선언부
		return num1 + num2; // 구현부
	}
	
	public static void main(String[] args) {
		
		method1();
		
		String str = method2();
		System.out.println(str);
		
		method3(1, 2);
		
		int i = method4(1, 2);
		System.out.println(i);
		
	}

}
