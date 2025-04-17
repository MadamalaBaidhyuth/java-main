class Main
{
public static void main(String args[])
{
 int a[]={10,30,10,20,40,50,20,10,30};
 Main main=new Main();
 //main.unique(a);
 //main.FristUni(a);
   main.LastUni(a);
}

void unique(int a[])
{
int b[]=new int[a.length];
for(int i=0;i<a.length;i++)
{
  int count=1;
  if(b[i]==1) continue;

  for(int j=i+1;j<a.length;j++)
  {
  if(a[i]==a[j])
  {
  count++;
  b[j]=1;
  }
  }
  if(count==1)
   System.out.println(a[i]);
 }
}
void FristUni(int a[])
{
int b[]=new int[a.length];
for(int i=0;i<a.length;i++)
{
  int count=1;
  if(b[i]==1) continue;

  for(int j=i+1;j<a.length;j++)
  {
  if(a[i]==a[j])
  {
  count++;
  b[j]=1;
  }
  }
  if(count==1)
  {
   System.out.println(a[i]); 
   break;
   }
 }
}
   void LastUni(int a[])
    {
    int b[]=new int[a.length];
    int lu=0;
    for(int i=0;i<a.length;i++) 
    {
     int count=1;
     if(b[i]==1) continue;
     for(int j=i+1;j<a.length;j++)
     {
      if(a[i]==a[j])
      {
      count++;
      b[j]=1;
      }
      }
     if(count==1)
      lu=a[i];
     }
     System.out.println(lu);
    }

}