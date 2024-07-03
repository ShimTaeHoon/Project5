package method.quiz;

public class Quiz5 {

	// 두 수를 입력받아 첫번째수에서 두번째수를 나눈 몫을 출력하세요.
	public static void nanu(int n1, int n2) {
		// 나누기 함수를 만들고 호출하세요.
		
		if(n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return; // 함수를 종료한다.(void이지만 함수종료하기위해) // 아래에서 값을 계산할 필요 없음
		}

		int result = n1/n2;
		System.out.println(n1 + "/" + n2 + " = " + result);
		
	}
		
	public static void main(String[] args) {
		// 단, 두번째 수가 0이면 "나누는 수는 0이 될 수 없습니다"
		// 를 출력하고 함수를 종료하세요
		// 예시) 10, 2 =>5 / 15, 5 => 3 / 10, 0 => 나누는 수는 0이 될 수 없습니다
		nanu(10, 5);
	}

}
