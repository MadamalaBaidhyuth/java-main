class Delete
 {
public static void main(String args[])
  {
   int a[]={10,20,30,44,40,60,20};
   int search=44;
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
   for(int i=0;i<=a.length-2;i++)
    {
    if(search==a[i]||a[i]>search)
       a[i]=a[i+1];
    
     System.out.println(a[i]);
    }  
   } 
 }