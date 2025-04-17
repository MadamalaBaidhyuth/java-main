class Mj
{
public static void main(String []args)
 {
  int sum=0,pro=1,i=1,j=1;
  for(i=1;i<10;i++)
  {
   for(j=1;j<=i;j++)
   {
    if(i%j==0)
    {
     if(j%2==0)
     { 
      sum=sum+j; 
      System.out.println(j+" sum is "+sum);
      }
     else
      pro=pro*j; 
      System.out.println(j+" pro is "+pro);

     }
    }
   } 
 }
}