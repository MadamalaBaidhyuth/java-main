class Inter extends Aimpl
{
public static void main(String args[])
{
 A i=new Aimpl();
  i.m1();
  i.m2();

}
}
class Aimpl implements A
{
  public void m1()
  {
  System.out.println(" m1 in Aimpl");
  }
  public void m2()
   {
   System.out.println(" m2 in Aimpl"); 
   }
}
interface A
{

       void m1();
public void m2();

}