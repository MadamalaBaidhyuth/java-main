class Ar
{
public static void main(String []args)
 {
 int a[]={1,2,3,10,4,5};
  int l=a.length,temp=0;
 for(int i=l-1;i>0;i--)
  {
       temp=a[i];
       a[i]=a[0];
       a[0]=temp;   
   }
  for(int i=0;i<l;i++)
  {
  System.out.println(a[i]);
   }

  }
}