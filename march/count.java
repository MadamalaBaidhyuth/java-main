class Mj
{
 public static void main(String []args)
 {
 int num=18;
 int start=1,end=num/2,count=0;
 while(start<=end)
  {
   if(num%start==0)
    {
     System.out.println(start);

     count++;
     }
   start++;
  }
  System.out.println("count is "+count);

 }
}