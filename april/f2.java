import java.util.Scanner;
class Mj
{
public static void main(String []args)
 {
 int a=0,b=1,c=0;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter an integer: ");
  int v= s.nextInt();
  for(int start=1;start<=v;start++)
  {
  c=a+b;
  a=b;
  b=c;
  
   }
 System.out.println(a);
 }
}