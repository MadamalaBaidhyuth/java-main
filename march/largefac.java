class Mj
{
 public static void main(String []args)
 {
 int num=18;
 int start=1,end=num/2,f=0;
 while(start<=end)
  {
   if(num%start==0)
    {
     f=start;
     }
   start++;
  }
  System.out.println("largest factor of "+num+" is "+f);

 }
}