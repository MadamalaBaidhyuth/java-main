class Max
{
public static void main(String []args)
{
int a[]={10,12,20,30,18};
int max=0;
int min=0;
for(int i=0;i<a.length-1;i++)
{
 if(a[i]>max)
  { 
  max=a[i];
  }
  if(max>min)
   {
    int t=min;
        min=max;
        max=t;
   }
  }
 System.out.println(max);
}
}