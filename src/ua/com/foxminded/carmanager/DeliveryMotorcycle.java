package ua.com.foxminded.carmanager;

public class DeliveryMotorcycle extends Motorcycle {

	public DeliveryMotorcycle(String name, int yearOfProdaction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		super(name, yearOfProdaction, price, weight, color, engineType, isReadyToDrive);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 20000) {
			return true;
		}
			return false;
		}   
	

}
