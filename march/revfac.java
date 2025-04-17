class Mj
{
 public static void main(String []args)
 {
 int num=18;
 int start=num/2,end=1,f=0;
 while(start>=end)
  {
   if(num%start==0)
    {
     System.out.println("largest factor of "+num+" is "+start);
     break;
     }
   start--;
  }
 }
}