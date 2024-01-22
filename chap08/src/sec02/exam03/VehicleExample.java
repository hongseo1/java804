package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 다양성을 위해
		//Bus bus = new Bus();
		vehicle.run();
		//vehicle.checkFare(); Bus class에서만 선언됨 / Bus로 자동 형변환 했기때문(Override제외 사용 못함)
		Bus bus = (Bus) vehicle; // 강제 형변환 (재정의 되지 않은, Bus에만 있는 checkFare를 사용하기 위해서)
		
		bus.run();
		bus.checkFare();
	}

}
