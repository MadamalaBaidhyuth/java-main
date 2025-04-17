class Insert
 {
public static void main(String args[])
  {
   int a[]={10,20,30,44,40,60};
   int search=46;
   int index=3;
   for(int x=0;x<a.length;x++)
   for(int y=0;y<a.length;y++)
   {
    if(a[x]<a[y])
    {
    int temp=a[x];
        a[x]=a[y];
        a[y]=temp; 
    }
   }
   for(int i=0;i<=a.length-1;i++)
    {
      if(i==index )
      {
           if(i>index)
           {
            a[i]=a[i+1];
            }
            a[i]=search;
      }
      System.out.println(a[i]);
     }
    
   } 
 }