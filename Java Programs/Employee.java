class Employee
{

int empid;
String address;

static String company="ABC";
public static void main(String args[])
{
 Employee e1=new Employee();
 e1.empid=101;
 e1.address= "abcd";
 Employee e2=new Employee();
 e2.empid=102;
 e2.address= "efgh";
 System.out.println("Empid" + e1.empid);
 System.out.println("Address" + e1.address);
 System.out.println("Empid" + e2.empid);
 System.out.println("Address" + e2.address);
}


}