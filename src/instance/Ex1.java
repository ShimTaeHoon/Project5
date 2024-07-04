package instance;

public class Ex1 {

	public static void main(String[] args) {
		
		// 객체 생성
		Student student = new Student(); // 첫번째 학생 생성
		
		// 객체의 멤버변수를 사용하여 학번 수정
		student.studentID = 1101; 
		student.studentName = "태훈";
		student.grade = 3;
		student.address = "인천 부평구";	
		System.out.println("학생의 모든 정보를 출력합니다.");
		student.showStudentInfo();
		System.out.println("객체의 주소:" + student); // ctrl + space로 변수 선택
		// 대입연산자는 = <왼쪽으로<-값 초기화
		// 참조변수는 주소값 가르치면서 오른쪽으로 -> new 생성자쪽?
		
		Student student2 = new Student(); // 두번째 학생 생성
		student2.studentID = 1110;
		student2.studentName = "태훈2";
		student2.grade = 4;
		student2.address = "인천 부평구";
		student2.showStudentInfo();
		System.out.println("객체의 주소는 " + student2 + "입니다.");
		
	}

}
