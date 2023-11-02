class Stud
{

int id;
String name;

static String college= "ABC";

public static void main(String args[])
{
Stud s1=new Stud();

Stud s2=new Stud(1, "Anjali");
s2.display();

Stud s3=new Stud(2, "Irfana");
s3.display();

}

Stud() //default
{

System.out.println("Default Constructor");

}

Stud(int id1, String name1) //parameterized
{

System.out.println("Parameterized Constructor");
id=id1;
name=name1;
}


public void display()
{

System.out.println(id);
System.out.println(name);
System.out.println(college);
}


}