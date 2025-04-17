class Ar
{
public static void main(String []args)
 {
  int a[]={12,23,100,39,1,22,49,320};
   int size=a.length,min=0,max=0;
   for(int x=size-1;x>0;x--)
   { min=a[x];
    if(min>max)
     {
     max=a[x];
     }
     else
      {
       min=max;
       }
   }
   System.out.println(min);
  }
}