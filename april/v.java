class Mj
{
public static void main(String []args)
 {
  int n=12000,count=0,rem=0,d=0,temp=n,rev=0;
  while(n!=0)
  { 
   count++;
   n=n/10;
  }
  n=temp;
  while(count!=0)
{ 
   count=count-1;
   d=(int)Math.pow(10,count);
   rem=n%d;
   n=n/d;
   switch(n)
   {
    case 0:
      System.out.print(" Zero ");
      break;
    case 1:
      System.out.print("One ");
      break;
    case 2:
      System.out.print("Two ");
      break;
   case 3:
      System.out.print("Three ");
      break;
   case 4:
      System.out.println("Four ");
      break;
   }
   n=rem; 

   }

  }
}