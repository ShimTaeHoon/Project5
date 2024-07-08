package hiding.quiz2;

public class CarQuiz {

	public static void main(String[] args) {
		Car car = new Car();
		car.setCompany("현대");
		car.setModelName("소나타");
		car.setColor("흰색");
		car.setMaxSpeed(200);
		
		System.out.println("제조사 : " + car.getCompany() + 
						" 모델명 : " + car.getModelName() + 
						" 색 : " + car.getColor() +
						" 최고속도 : " + car.getMaxSpeed() + "km");
	}

}

class Car{
	private String company;
	private String modelName;
	private String color;
	private int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
