package instance.quiz;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.name = "심태훈";
		person.age = "33세";
		person.isMarried = false;
		person.child = 0;
		
		person.showPersonInfo();
		
		// 한 클래스 내에 public 접근제어자는 클래스명(PersonTest)에만 쓸수있음
		// 2개 쓰면 에러남
	}

}
