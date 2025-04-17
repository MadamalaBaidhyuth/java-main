class Mj
{
public static void main(String []args)
 {
  int start=1,end=10,sum=0,pro=1;
  while(start<=end)
   {
     if(start%2==0) //1%2==0f/2%2==0t/3%2==0f//4%2==0t
      {
	sum+=start; //s=0+2 //s=2+4.....//s=20+10/s=30
	
      }
     else
      {
	pro*=start; //p=1*1 //s=1*3.....//p=945
	
      }
     start++;
   }
	System.out.println("sum is even "+sum);
	System.out.println("product is odd "+pro);
 }
}