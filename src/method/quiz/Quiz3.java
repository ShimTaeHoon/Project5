package method.quiz;

public class Quiz3 {
	
	public static void math(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num2);
			//작으면 num2반환한다
		} else {
			System.out.println(num1);
			//num1을 반환한다
		}
		
	}
	
	public static int bi(int num3, int num4) {
		if(num3 < num4) {
			System.out.println(num4);
			return num4;
		} else {
			System.out.println(num3);
			return num3;
		}
		
	}
	
	public static int max(int n1, int n2) {
		if (n1 > n2) {
			return n1; // 값을 반환, 함수종료
		} else {
			return n2;
		}
	}
	
	public static void main(String[] args) {
		math(7, 6);
		int bigyo = bi(5,4);
		int result1 = max(10, 50);
		
		System.out.println(result1);
		// 조건문
		// 두 수를 비교하는 함수를 만들고 호출하세요.
		// 둘 중에 더 큰 수를 구하고 반환하세요.
		// 예시) 10, 5 => 10
		//       2, 3 => 3

	}

}
