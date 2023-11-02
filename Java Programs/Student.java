class Student
{

int id;
String name;
static String College= "ABC";

Student()
{
System.out.println("Default Constructor");
}

Student(int id1, String name1)
{

System.out.println("Parameterized Constructor");
id=id1;
name=name1;
}


public static void main(String args[])
{
Student s1= new Student();
s1.display();
Student s2= new Student(1,"Anjali");
s2.display();
Student s3= new Student(2,"Irfana");
s3.display();
}

void display()
{
System.out.println(id);
System.out.println(name);
System.out.println(College);

}

}