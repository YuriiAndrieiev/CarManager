package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		PassengerCar prius = new PassengerCar("Toyota Prius", 2008, 1200, 15000, Color.GREEN); 
		 
		 
	    Bus renualt = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
	    
	    Car renualt2 = new Bus ("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
	    
	    List<Car> cars = new ArrayList<>();
	    cars.add(prius) ;
	    cars.add(renualt) ;
	    cars.add(renualt2) ;
	    
	    System.out.println(cars);
	    prius.addDistance(1000);
	    prius.addDistance(2000);
	    prius.addDistance(20.9);
	    renualt.addDistance(15000);
	    prius.addDistance(15000);
	   
		
	    System.out.println (prius) ; 
		System.out.println (renualt) ;
		
        System.out.println(prius.isReadyToService()) ;
		System.out.println(renualt.isReadyToService()) ;
		
		
        System.out.println (prius.equals(renualt2)) ;
		System.out.println (renualt.equals(renualt2)) ;
		
	}

}
