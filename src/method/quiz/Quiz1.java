package method.quiz;

public class Quiz1 {
	// 사칙연산을 수행하는 함수를 만들고 호출하세요.
	// 두 숫자를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력하세요.
	// 예시) 10, 5 => 15, 5, 50, 2, 0
	
	public static void math(int num1, int num2) {
		int plus = num1 + num2;
		int minus = num1 - num2;
		int gob = num1 * num2;
		int na = num1 / num2;
		int mo = num1 % num2;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(gob);
		System.out.println(na);
		System.out.println(mo);
		
	}
		
	public static void main(String[] args) {
		math(10, 5);
	
	}

}
