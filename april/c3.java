class Mj
{
public static void main(String []args)
  {
  Parent parent;
  parent=new Child(); //upcasting
  parent.m1();
  }
}
class Parent
{
public void m1()
{
System.out.println("parent");
}
}
class Child extends Parent
{
public void m1()
{
System.out.println("child");
}
}