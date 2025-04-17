class Ar
{ 
 
public static void main(String []args)
 { 
   int a[]={2,3,4,5,6,7,8};
    int l=a.length;
    int b[]=new int[l];
  for(int x=0,y=0;x<l;x++)
  {
   if(x%2==0)
   {
    System.out.println("b["+y+"]"+a[x]);
    y++;
    }
   }

   System.out.println(" ");
   for(int x=0,y=0;x<l;x++)
     {
     if(x%2!=0)
     {
      System.out.println("b["+y+"]"+a[x]);
      y++;
     } 
    } 
 
  }
}