class Recursion
{
public static void main(String args[])
{
 int a[]={13,14,12,33,11,153,145};
 Recursion r=new Recursion();

    for(int i=0;i<a.length;i++)
    r.Prime(0,a[i],1);

     System.out.println("\n");
    for(int i=0;i<a.length;i++)
     r.Plaindrom(a[i],a[i],0);

      System.out.println("\n");
    for(int i=0;i<a.length;i++)
     r.Amstrong(a[i],a[i],0,0,a[i]);

}


       void Prime(int count,int num,int start)
        {  
         if(start>num)
          {
             System.out.println(count==2?"prime "+num:"not prime "+num);
          }
         else
          {
           if(num%start==0)
            {
             count++;
            }
           Prime(count,num,start+1);
          }
         }

       

        void Plaindrom(int temp,int num,int s)
        {  

         if(num==0)
          {
             System.out.println(temp==s?"palindrom "+temp:"not a palindrom "+temp);
          }
         else
          {
           int rem=num%10;
           s=s*10+rem;
  
          Plaindrom(temp,num/10,s);
          }
         }
       void Amstrong(int num,int n,int count,int s,int temp)
        { 
         int rem=0;
         while(n!=0)
         {
          n=n/10;
          count++;
          
         }
  
         if(num==0)
          {
           if(temp==s)
             System.out.println(temp==s?"Amstrong "+temp:"not aAmstrong "+s);
          }
         else
          {
           
           rem=num%10;
           int p=(int)Math.pow(rem,count);
           s=p+s;
  
          Amstrong(num/10,n,count,s,temp);
          }
         }


         





}