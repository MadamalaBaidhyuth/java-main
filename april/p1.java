class Mj
{
 public static void main(String []args)
 {
 int n=120000,rem=0 ,count=0,temp=n,v=0;
while(n!=0)
{
count++;
n=n/10;
}
 n=temp;
 while(n!=0)
  {
   count=count-1;
   v=(int)Math.pow(10,count);
   rem=n%v;
  System.out.println(rem);
   switch(rem)
   {
    case 0:
      System.out.print("Zero ");
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
   count=count-1;
   n=n/10;

  }
 }

}