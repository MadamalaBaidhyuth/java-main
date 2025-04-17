class Mj
{
public static void main(String []args)
 {
  int n=123,count=0,temp=n, m=0,rem=0,s=0,sum=0,r=0;
  while(n!=0)
  {
   count++;
   rem=n%10;
   sum=sum+rem;
   n=n/10;
  }
  n=temp;
  while(count!=0)
   {
   rem=n%10;
   m=(int)Math.pow(10,count);
   s=sum/rem;
   r=r+s*m;
   count--;
   n=n/10;
   }
  System.out.println(r);
  }

}