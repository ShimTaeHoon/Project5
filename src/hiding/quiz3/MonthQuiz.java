package hiding.quiz3;

public class MonthQuiz {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		date.month = 13;
		date.day = 31;
		System.out.println("현재 날짜: " + date.month
							+ "월 " + date.day + "일");
		
		date.setMonth(13);
		date.setMonth(12);
		
		System.out.println(date.getMonth());
		// public변수는 잘못된 값(논리적으로)이 저장되는 것을 막을 수 없음 = 문법상은 맞기에
		// ex) 2월 31일

	}

}

class MyDate{
	public int month; // 월 // 프로퍼티
	public int day; // 일
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 월입니다");
			return; // 1. 값을 반환
					// 2. 함수 종료
		}
		
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}