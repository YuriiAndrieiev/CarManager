package ua.com.foxminded.carmanager;

public enum MotorcycleColor {

	BLACK("Black"),
	ORANGE("Orange"),
	WHITE("White"),
	YELLOW("Yellow"),
	BLUE("Blue"),
	GREEN("Green");
	
	public final String name;
	
	
    MotorcycleColor(String name) { this.name = name; }
	
	public String getColor() { return name; }
	
   public String toString ()   { return name; }
	
}
