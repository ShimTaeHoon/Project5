package hiding.test2;

import hiding.test1.A;

public class Test {

	public static void main(String[] args) {
		
		A a = new A(); // 외부 패키지에서 사용가능 (A클래스는 public임)
//		B b = new B(); // 외부 패키지에서 사용불가 (B클래스는 접근제어자 default라서)
		
	}
	
}
