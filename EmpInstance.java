class EmpInstance
{

int empid;
String address;
static String company="ABC";

public static void main(String args[])
{
 EmpInstance obj1=new EmpInstance();
 obj1.empid=101;
 obj1.address= "abcd";
 obj1.display();
 EmpInstance obj2=new EmpInstance();
 obj2.empid=102;
 obj2.address= "efgh";
 obj2.display();
 EmpInstance.changeCompany();
 EmpInstance obj3= new EmpInstance();
 obj3.empid=103;
 obj3.address="ijkl";
 obj3.display();
 EmpInstance obj4= new EmpInstance();
 obj4.empid=104;
 obj4.address="mnop";
 obj4.display();

 
}



public void display()
{

 System.out.println("Empid " + empid);
 System.out.println("Address " + address);
 System.out.println("Company " + company);
}

public static void changeCompany()
{
	String newCompany="Obsqure";
	EmpInstance.company=newCompany;
	System.out.println("New Company " + newCompany);
	
}
 
public static void changeCompany()
{
	company="Obsqure";

	System.out.println("New Company " + company);
	
}
}