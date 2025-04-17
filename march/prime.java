class Mj
{
 public static void main(String []args)
 {
 int num=7;
 int start=1,end=num,count=0;
 while(start<=end)
  {
   if(num%start==0)
    {
   count++;
     }
   start++;
  }
  System.out.println(count==2?num+" prime":num+" not prime");

 }
}