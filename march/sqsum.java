class Mj
{
 public static void main(String []args)
 {
 int num=500;
 int start=1,end=num,sum=0;
 while(start<=end)
  { 
   int s=(int)Math.sqrt(start);
   if(s*s==start)
    {
     sum+=start;
     }
   start++;
  }
  System.out.println(sum);

 }
}