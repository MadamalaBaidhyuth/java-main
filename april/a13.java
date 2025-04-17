class Mj
{
public static void main(String arg[])
{ 
A a=new B();
a.add(10);
}
}
class A
{
final void add()
{
 System.out.print("parent");
}
}
class B extends A
{
 void add(int b)
{
 System.out.print("child"+b);
}
}