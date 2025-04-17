class Ar
{
public static void main(String []args)
{
  int max=0,smax=0;
  int a[]={ 100,58,67,67,32};
  int l=a.length;
  for(int i=0;i<l;i++)
  {
  if(a[i]>smax&&a[i]!=smax)
   {
    smax=a[i];
	if(max<smax)
	{
		max=max^smax;
		smax=max^smax;
		max=max^smax;	
	}
   }
  }
  System.out.println(smax);
  System.out.println(max);

}
}