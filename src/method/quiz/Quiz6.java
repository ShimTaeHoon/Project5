package method.quiz;

public class Quiz6 {

//	public static void cal(int n1, int n2, char n3) {
//		int plus = n1 + n2;
//		int minus = n1 - n2;
//		int gob = n1 * n2;
//		int na = n1 / n2;
//		char value = n3;
//		
//		switch(value) {
//		case '+':
//			System.out.println(plus);
//			break;
//		case '-':
//			System.out.println(minus);
//			break;
//		case '*':
//			System.out.println(gob);
//			break;
//		case '/':
//			System.out.println(na);
//			break;
//		}
//		
//	}
	
	public static void cal2(int n1, int n2, char n3) {
		int plus = n1 + n2;
		int minus = n1 - n2;
		int gob = n1 * n2;
		int na = n1 / n2;
		char value = n3;
		
		if(value == '+') {
			System.out.println(n1 + "+" + n2 + "=" + plus);
		} else if(value == '-'){
			System.out.println(n1 + "-" + n2 + "=" + minus);
		} else if(value == '*') {
			System.out.println(n1 + "*" + n2 + "=" + gob);
		} else {
			System.out.println(n1 + "/" + n2 + "=" + na);
		}
	}
	
	public static void main(String[] args) {
		cal2(1, 2, '+');
		cal2(3, 1, '-');
		cal2(2, 5, '*');
		cal2(6, 6, '/');
		// 계산기 메소드를 만들고 호출하세요.
		// 두 수와 연산자(+ - * /) 중에 하나를 입력받아,
		// 연산을 수행하고 결과를 출력하세요.
		// 예시) 1, 5, + => 6

	}

}
