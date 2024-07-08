package hiding;

public class Ex2 {

	public static void main(String[] args) {

	MyDate2 date = new MyDate2();
//	date.   << 프로퍼티가 private여서 . 찍어도 안나옴
	date.setMonth(2);
	date.setDay(30);
	date.getMonth();
	date.getDay();
	System.out.println("현재 날짜는 " + date.getMonth()
					+ "월 " + date.getDay() + "일 입니다");
	
	date.setDay(10);
	System.out.println("현재 날짜는 " + date.getMonth()
	+ "월 " + date.getDay() + "일 입니다");

	}

}

class MyDate2{
	
	private int month;
	private int day;
	
	// 월을 가져오는 메소드
	public int getMonth() { // 리턴 o 매개변수 x
		return month;
	}
	
	// 월을 변경하는 메소드
	public void setMonth(int month) { // 리턴 x 매개변수 o
		this.month = month;
	}
	// 일을 가져오는 메소드
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		// 새로들어온 값이 올바른인자인지 확인하고 저장(논리적으로 맞는 값인지 확인)
		if (month == 2) {
			if (day < 1 || day > 28) {    
				System.out.println("2월에는 " + day + " 일이 없습니다!!");
				return;
				// 만약 28일이 입력되어 잘못된 값이 들어오면
				// return으로 빠져나간다(함수종료)
				// 아래 this.day로 내려가지않음
			}
				
		}
		
		this.day = day;
	}
	
}
