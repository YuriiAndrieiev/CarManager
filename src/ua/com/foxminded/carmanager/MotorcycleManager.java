package ua.com.foxminded.carmanager;

import java.util.ArrayList;
import java.util.List;

public  class MotorcycleManager {

	

	public static void main(String[] args) {
		Motorcycle suzuki = new SportMotorcycle("Suzuki GRX-R1000", 2021, 16000, 600,  "Black"  + " ", "diesel", true);
  
		
		
		Motorcycle yamaha = new DeliveryMotorcycle("Yamaha FZ1", 2007, 9000, 700, "Orange", "gas", false);
	
		 List<Motorcycle> motorcycles =new ArrayList <> ();
		 motorcycles.add(suzuki) ;
		 motorcycles.add(yamaha) ;
		 
		 System.out.println (motorcycles) ;
		suzuki.addDistance(250000) ;
		 
		suzuki.addDistance(11.5f) ;
		yamaha.addDistance(250000) ;
		yamaha.addDistance(-11.5f) ;
	
yamaha.TryDestroyEngine();  
		   
 suzuki.TryDestroyEngine();
	     
	       
  yamaha.Repaint (Color.BLACK) ;
 yamaha.Repair ();
  suzuki.Repair () ;
	       
	        
  yamaha.isReadyToService();
  suzuki.isReadyToService();
  System.out.println (suzuki) ;
  System.out.println (yamaha) ;
	
  
System.out.println (suzuki.equals(yamaha)) ;
System.out.println (suzuki.equals(yamaha)) ;
      
 ;
 System.out.println(yamaha.isReadyToService());
System.out.println(suzuki.isReadyToService());
	}

	
	}


