class Ar
{
  public static void main(String []args)
  {
   int a[]={10,20,30,40,50};
   int l=a.length;
   int b[]=new int[l];
   for(int i=0,j=0;i<l;i++)
   {
   
   if(i>=0 && i<l-1)
   {
   b[j]=a[i+1];
   System.out.println("b["+j+"] "+b[j]);
   j++; 
   }
    if(i==l-1)
   {
    b[j]=a[0];
    System.out.println("b["+j+"] "+b[j]);
    j++; 
   } 
 
   }
  }
}