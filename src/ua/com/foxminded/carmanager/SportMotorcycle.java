package ua.com.foxminded.carmanager;

public class SportMotorcycle extends Motorcycle {

	public SportMotorcycle(String name, int yearOfProdaction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		super(name, yearOfProdaction, price, weight, color, engineType, isReadyToDrive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		
		return super.isReadyToService();
	}

}