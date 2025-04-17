class Ar
{
public static void main(String []args)
  { 
  int a[]={10,20,30,40,50,60,70};
  int size=a.length;
  int b[]=new int[size];
  for(int x=0,y=0;x<size;x++)
   {
    if(x==0)
    {
     b[y]=a[x]+a[x+1];
     System.out.println(""+b[y]);
     y++;
    } 
    if(x>0 && x<size-1)
     {
     b[y]=a[x-1]+a[x+1];
     System.out.println(b[y]);
     y++;
     }
     if(x==size-1)
     {
      b[y]=a[x-1]+a[x];
      System.out.println(b[y]);
     }
    }
  }
}