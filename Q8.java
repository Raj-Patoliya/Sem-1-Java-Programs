  class Vehicle
{
		private String vehicle_type;
		private String vehicle_color ;
		private String c_name;
		private String f_type;
	public Vehicle(String vehicle_type,String vehicle_color,String c_name,String f_type)
	{
		this.vehicle_type=vehicle_type;	
		this.vehicle_color = vehicle_color;
		this.c_name = c_name;
		this.f_type = f_type;
	}
	public void display()
	{
		System.out.print("\n\tVehicle type is : "+ vehicle_type);
		System.out.print("\n\tVehicle Color is : "+ vehicle_color);
		System.out.print("\n\tVehicle Company is : "+ c_name);
		System.out.print("\n\tFuel type : "+ f_type);
	}
	
}
class Car extends Vehicle
{
		private String model_type ;
		private String company_name ;
		private String color;	
		private String fuel_type;
	public Car(String model_type,String company_name,String color,String fuel_type,String vehicle_type,String vehicle_color,String c_name,String f_type)
	{	
		super(vehicle_type,vehicle_color,c_name,f_type);
		this.model_type = model_type ;
		this.company_name = company_name ;
		this.color = color;	
		this.fuel_type = fuel_type;
		
				
	}
	public void display()
	{
		super.display();
		System.out.print("\n\n\tCar's Model is : "+ model_type);
		System.out.print("\n\tCar's Company is : "+ company_name);
		System.out.print("\n\tCar's Color is : "+ color);	
		System.out.print("\n\tFuel type : "+ fuel_type+"\n");	
		
	}
	
}
public class Q8
{
	public static void main(String args[])
	{
		Car cr = new Car("CUV","BMW","Z Black","Diesel","E-Bike","White","Hero","Electric");
		cr.display();
		 
	}
}
