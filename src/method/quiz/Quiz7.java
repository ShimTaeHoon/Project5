package method.quiz;

public class Quiz7 {

	public static void three(int n1) {
		int sum = 0;
		 sum += (n1 / 100);
		 sum += (n1 % 100 / 10); 
		 sum += (n1 % 10);
		
		System.out.print(n1+ ":" );
		System.out.println(sum);
	}
	
//	public static void hap(int num) {
//	int sum = 0; // 합계
//	// 1의 자리
//	sum = sum + (num%10);
//	// 10의 자리
//	num = num/10;
//	sum = sum + (num%10);
//	// 100의 자리
//	num = num/10;
//	sum = sum + num;
//	
//	System.out.println(sum);
//	
//	}
	
	public static void main(String[] args) {
		// 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
		// 예시) 932 => 14( = 9 + 3 + 2 = 14)
		
		three(932);
//		hap(932);
		
		

	}

}
