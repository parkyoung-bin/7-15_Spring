package ex04.quiz;

public class AirPlane {
	private IBattery battery;
	//생성자 주입

	
	public AirPlane(IBattery battery) {
		this.battery=battery;
	}

	public IBattery getBattey() {
		return battery;
	}
	
}
