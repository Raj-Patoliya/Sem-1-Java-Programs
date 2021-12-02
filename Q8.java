  class Vehicle
{
	
	public Vehicle()
	{
		String vehicle_type;
		String vehicle_color ;
		String c_name;
		String fuel_type;
	}
	public void display(String vehicle_type,String vehicle_color,String c_name,String fuel_type)
	{
		System.out.println("Vehicle type is : "+ vehicle_type);
		System.out.println("Vehicle Color is : "+ vehicle_color);
		System.out.println("Vehicle Company is : "+ c_name);
		System.out.println("Fuel type : "+ fuel_type);
	}
	
}
class Car extends Vehicle
{
	public Car()
	{	
		String model_type ;
		String company_name ;
		String color;	
		String fuel_type;		
	}
	public void display(String model_type,String company_name,String color,String fuel_type)
	{
		System.out.println("Car's Model is : "+ model_type);
		System.out.println("Car's Company is : "+ company_name);
		System.out.println("Car's Color is : "+ color);	
		System.out.println("Fuel type : "+ fuel_type);	
	
	}
	
}
public class Q8
{
	public static void main(String args[])
	{
		Car cr = new Car();
		cr.display("CUV","BMW","Z Black","Diesel");
	}
}
