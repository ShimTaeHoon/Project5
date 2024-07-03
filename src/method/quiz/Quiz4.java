package method.quiz;

public class Quiz4 {

	public static int minus(int num1, int num2) {
		
		// 두 수를 입력받아 첫번째 수에서 두번째 수를 뺀 후
		if(num1 < num2) {
			return -999;
		// 단, 첫번째 수가 두번째 수보다 작으면 -999를 반환하고 함수를 종료하세요.
			}
		int bbae = num1 - num2;
		return bbae; // return : 함수를 반환한다 / 종료한다(빠져나간다)
		// 그 결과를 반환하세요.
	}
	
	public static void main(String[] args) {
		int result1 = minus(20, 10);
		int result2 = minus(10, 20);
		
		System.out.println(result1);
		System.out.println(result2);
		// 빼기 메소드를 만들고 호출하세요.
		// 두 수를 입력받아 첫번째 수에서 두번째 수를 뺀 후 그 결과를 반환하세요.
		// 단, 첫번째 수가 두번째 수보다 작으면 -999를 반환하고 함수를 종료하세요.
		// 예시) 20, 10 => 10
		//      5, 1 => 4
		// 10, 20 => -999
		
		

	}

}
