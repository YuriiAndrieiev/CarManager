package ua.com.foxminded.carmanager;

import java.util.Objects;

public abstract class Motorcycle  {
	  
	String name ;
	int yearOfProdaction ;
	int price ;
	int weight ;
	Color color ;
	String engineType ;
	boolean isReadyToDrive ;
	private int distance = 0 ;
	protected int distanceOnService = 0;
	

	
	public Motorcycle(String name, int yearOfProdaction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProdaction = yearOfProdaction;
		this.price = price;
		this.weight = weight ;
		this.color = Color.valueOf(color.toUpperCase().replace(" ", ""));
		this.engineType = engineType; 
		this.isReadyToDrive = isReadyToDrive ;
	}
		
public void repair () { 
 this.isReadyToDrive = true ;
		
}public void tryDestroyEngine (boolean isReadytoDrive) {
	if (distance > 200000)
		 isReadytoDrive = false; 	
	

}


	
public void  addDistance (int additionalDistance) {
	distance += additionalDistance ;
	distanceOnService += additionalDistance;
} 

protected int getDistanceOnService() {
	return distanceOnService;
}

protected void setDistanceOnService(int distanceOnService) {
	this.distanceOnService = distanceOnService;
}

public void  addDistance (float additionalDistance) {
	this.distance += roundDistance (additionalDistance);
	distanceOnService += additionalDistance;
}  

private int roundDistance (float additionalDistance) {

return Math.round (additionalDistance) ;
}
 

public  boolean isReadyToService() {
	if (distanceOnService > 8000) {
		service ();
	}
		return false;
	}   
 
 public  void service () { 
 this.distanceOnService = 0 ;
 }
 
 
 
public int getDistance() {
    return distance;
}


   
    @Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, distance, isReadyToDrive);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && distance == other.distance && isReadyToDrive == other.isReadyToDrive;
	}
	  
	

	public void TryDestroyEngine() {
		if (distance >200000)
			isReadyToDrive = false  ;
		
	}

	public void Repaint(Color color) {
		this.color = color ;
		
	}

	public void Repair() {
		this.isReadyToDrive = true ;
		
	}

	
}

	
		

	
		
	
	

	
		
	
	
	
	
	
	

