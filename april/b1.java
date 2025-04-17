class Mj
{
public static void main(String []args)
 {
 int n=120000,rem=0 ,count=0,temp=n,v=0,d=0,count1=0;
 while(n!=0)
 {
  count++;
  n=n/10;
 }
 n=temp;
   while(n>=0)
   {
    count1=5;
    v=(int)Math.pow(10,count1);
    d=
    n=n-v;
    System.out.println(n);
    count1--;
   }
 }
}