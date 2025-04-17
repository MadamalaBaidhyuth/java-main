class Mj
{
 public static void main(String []args)
 {
  int n=1289,rem=0 ,count=0,temp=n,rev=0,c=0,d=0;
   while(n!=0)
  {
  count++;
  n=n/10;
  }
n=temp;
while(count!=0)
   {
   count=count-1;
   d=(int)Math.pow(10,count);
   rem=n%d;
   n=n/d;
   System.out.println(n); 
   n=rem;

   } 
   
  

 }

}
