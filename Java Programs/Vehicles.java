class Vehicles
{

int year;
String model;

static String VehicleType="Hundai";

public static void main(String args[])
{
Vehicles v1=new Vehicles();
v1.display();

Vehicles v2=new Vehicles(2000, "abcd");
v2.display();

Vehicles v3=new Vehicles(2002, "bdfg");
v3.display();

}

Vehicles() //default
{

System.out.println("Default Constructor");

}

Vehicles(int year1, String model1) //parameterized
{

System.out.println("Parameterized Constructor");
year=year1;
model=model1;
}


public void display()
{

System.out.println(year);
System.out.println(model);
System.out.println(VehicleType);
}


}