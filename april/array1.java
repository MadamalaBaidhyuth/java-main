class Ar
{
public static void main(String []args)
 {
  int a[]={1,-1,2,-3,4,5,-2};
  int size=a.length;
  int b[]=new int[size];
  for(int x=0;x<size;x++)
   {
   System.out.println("a["+x+"]="+a[x]);
   }
   System.out.println(" ");
   for(int x=size-1,y=0;x>0;x--)
    {
    if(a[x]<0)
    {
    b[y]=a[x];
    System.out.println("b["+y+"]="+b[y]);
    y++;
    }
    }
  }
}
