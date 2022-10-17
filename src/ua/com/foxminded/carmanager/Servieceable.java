package ua.com.foxminded.carmanager;

public interface Servieceable {
	
	public  boolean isReadyToService() ;
	
	public int getDistanceOnService () ;
	
	public void addDistance(int additionalDistance) ;
	
	public void addDistance(double additionalDistance) ;
	
	
	
	
}

