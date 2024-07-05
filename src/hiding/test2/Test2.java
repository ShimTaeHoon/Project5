package hiding.test2;

public class Test2 {

	public static void main(String[] args) {

		Person person = new Person();
		person.name = "둘리"; // 외부 패키지 가능
		person.height = 170; // 같은 패키지 ok
//		person.weight = 111; -> private타입이라 같은 클래스가 아니라 호출 불가
	}

}

class Person {
	public String name; //이름
	int height; // 키
	private double weight; // 몸무게
	
	public void showInfo() {
		System.out.println("이름 : " + name
							+ "키 : " + height + "몸무게 : " + weight);
	}
}
