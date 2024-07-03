package method.quiz;

public class Quiz2 {

	public static int hap(int n1, int n2) {
		
		int result = 0; // 합계를 저장할 변수
		
		for (int i = n1; i <= n2; i++) {
			result = result + i;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int sum = hap(5, 10); // 함수 호출
		System.out.println("5부터 10까지의 합은 " + sum);
		
		// 합을 구하는 함수를 만들고 호출하세요.
		// 두 수를 입력받아 n1부터 n2까지의 합을 반환(리턴타입)하세요.
		// 예시 5,10 => 5+6+7+8+9+10
		//     3,7  => 3+4+5+6+7

	}

}
