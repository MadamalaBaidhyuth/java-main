class Mj
{
 public static void main(String []args)
 {
 int n1=12,n2=50;
 int start=1,end=n1;
 while(start<=end)
  {
   if(n1%start==0)
    {
     if(n2%start==0)
     {
      System.out.println(start);
      }
     }
   start++;
  }

 }
}