class Bs
 {
 public static void main(String []args)
  {
   int a[]={12,3,43,91,10};
   int f=0,l=a.length, x=0,y=0,b=0;
   int search=10;
   
    for(x=0;x<a.length-2;x++)
    {
     for(y=x+1;y<=a.length-1;y++)
      {
       if(a[x]>a[y])
       {
         int temp=a[x];
         a[x]=a[y];
         a[y]=temp;
       }
      }
    }   
    int m=(f+l)/2;

    while(f<=l)
     {
      if(a[m]==search)
       {
       System.out.println("element found at"+m);
       
       }
       else if(search<a[m])
        {
        l=m-1;
         b=m;
        }
        else if(search>a[m])
        {
        f=m+1;
         b=m;
        }
     }
     System.out.println(a);
  }
 }