package method.quiz;

public class Quiz7 {

	public static void three(int n1) {
		int sum1 = n1 / 100;
		int sum2 = n1 % 100 / 10;
		int sum3 = n1 % 10;
		int sum4 = (sum1 + sum2 + sum3);
		System.out.print(n1+ ":" );
		System.out.println(sum4);
	}
	
	public static void main(String[] args) {
		three(123);
		// 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
		// 예시) 932 => 14( = 9 + 3 + 2 = 14) 

	}

}
