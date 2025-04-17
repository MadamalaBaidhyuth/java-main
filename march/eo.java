class Mj
 {
  public static void main(String []args)
   {
    int count=0,n=123465,rem=0,sum=0,v=0,temp=n;
    while(n!=0)
    {
     count++;
     n/=10;
    }
    n=temp;
     if(count%2==0)
     {
      count=count/2;
      v=(int)Math.pow(10,count);
      rem=n%v;
      n/=v;
      sum=rem+n;
      System.out.println(temp+"is even the sum is "+sum);
     }
     else
     {
      rem=n%10;
      n/=10;
      sum=rem+n;
      System.out.println(temp+"is odd the sum is "+sum);

     }
 
   }
 }