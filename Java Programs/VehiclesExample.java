class VehiclesExample
{

int year;
String model;

static String vehicles="Hundai";

public static void main(String args[])
{
 VehiclesExample ob1=new VehiclesExample();
 ob1.year=2000;
 ob1.model="abab";
 ob1.displaydetails();
 
 VehiclesExample ob2=new VehiclesExample();
 ob2.year=2001;
 ob2.model="bhbh";
 ob2.displaydetails();
 
 VehiclesExample.changeVehicles();
 
 VehiclesExample ob3=new VehiclesExample();
 ob3.year=2002;
 ob3.model="bcbc";
 ob3.displaydetails();
 
}


public void displaydetails()
{

 System.out.println("Year is  " + year);
 System.out.println("Model is  " + model);
 System.out.println("Vehicles " + vehicles);
}


public static void changeVehicles()
{
	String newVehicle="Honda";
	VehiclesExample.vehicles=newVehicle;
	System.out.println("New Vehicle is   " + newVehicle);
	
}

 
}