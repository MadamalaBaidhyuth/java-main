class Main
{
 public static void main(String args[])
{
 Child c=new Child();
System.out.println(c.sub()+" "+c.mul()+" "+c.div()+" "+c.mod());
 
}
}
abstract class Parent
{ int a,b;
  Parent()
  {   a=20;
      b=30;
   }
  
  public int sub()
  {
  return a-b;
  }
public int mul()
  {
  return a*b;
  }
} 
class Child extends Parent
{ int x,y;
 Child()
  { x=10;
    y=20;
   }
public  int div()
{
return x/y;
}
public  int mod()
{
return x%y;
}
}