class Method
{
public static void main(String args[])
{
int r1=Method.sum(12, 2);
int r2=Method.sum(5, 6, 8);
double r3=Method.sum(12.4, 5.2);
System.out.println(r1);
System.out.println(r2);
System.out.println(r3);

}
public static int sum(int a, int b)
{
int s= a+b;
return s;

}
public static int sum(int a, int b, int c)
{
int s=a+b+c;
return s;
}

public static double sum(double a, double b)
{
double s=a+b;
return s;
}
}
