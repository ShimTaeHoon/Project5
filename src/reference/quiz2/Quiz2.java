package reference.quiz2;

public class Quiz2 {

	//부서 객체를 생성하고, 부서원들을 추가하세요
	Employee em = new Employee("심태훈", 33, 1, 1);
	Employee em2 = new Employee("심태훈2", 66, 2, 2);
	Employee em3 = new Employee("심태훈3", 99, 3, 3);
	
	Department dp = new Department(em, em2, em);
	
}

// 직원
class Employee{
	String name;
	int age;
	int pay;
	int workYear;
	
	public Employee(String name, int age, int pay, int workYear) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.workYear = workYear;
	}
}

// 부서
class Department{
	Employee booSeo;
	Employee sooSeok;
	Employee bookYeon;
	
	public Department(Employee booSeo, Employee sooSeok, Employee bookYeon) {
		super();
		this.booSeo = booSeo;
		this.sooSeok = sooSeok;
		this.bookYeon = bookYeon;
	}
}



