class Mj
{
public static void main(String []args)
 {
 int n=123,rem=0,sum=1,count=0,temp=n,m=0,s=0,p=0;
 for(;n!=0;)
  {
   n=n/10;
  count++;
   }
 n=temp;
for(;count!=0;)//3
   {
   rem=n%10;
   m=(int)Math.pow(10,count-1);
   p=p+rem*m;
   count--;
   n=n/10;
   }
   System.out.println(p);
 

 }
}