class InstanceMethod
{
public static void main(String args[])
{
InstanceMethod obj=new InstanceMethod();
int result=obj.sum(10,5);
System.out.println(result);


}
public static int sum(int a, int b)
{
int s= a+b;
return s;

}
}
