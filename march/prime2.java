class Mj
{
 public static void main(String []args)
 {
 int num=2;
 int start=1,end=num/2,count=0;
 if(num>1){
 while(start<=end)
  {
   if(num%start==0)
    {
   count++;
     }
   start++;
  }
  System.out.println(count==1?num+" prime":num+" not prime");
}

 }
}