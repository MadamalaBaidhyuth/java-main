import java.util.Scanner;
class Sum
 {
  public static void main(String []args)
   {
  Scanner s2=new Scanner(System.in);
    Prime s1=new Prime();
    s1.num=s2.nextInt  
    s1.calfac();
    s1.display();
    }
}
class Prime
{
int num,fac;
 void calfac()
  {
   int x=2;
   for(x=2;x<=num/2;x++)
    {
     if(num%x==0)
     {
      fac++;
      }
     }
    }
   void display()
    {
     if(fac==2)
     System.out.println(num+" is prime");
     else
     System.out.println(num+"is not prime");
     
     }
}
