class Max
{
public static void main(String []args)
{
int a[]={90,90,30,39,39};
int max=Integer.MIN_VALUE;
int max1=max;
for( int i=0;i<a.length;i++)
{
 if(a[i]>max)
  {
  max1=max;
  max=a[i];
  }
  else if(max>a[i] && max1<a[i])
   max1=a[i];
}
System.out.println(max1);

}
}