class Main
{
public static void main(String args[])
{
 int a[]={90,20,10,10,20,40,20,10,20,20,20,30};
 Main main=new Main();
  //main.Duplicate(a);
 //main.FristDup(a);
 //main.LastDup(a);
 //main.MaxDup(a);
   //main.RepDup(a);
     main.LRepDup(a);
}

void Duplicate(int a[])
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
  if(count>1)
   System.out.println(a[i]+" "+count);
 }
}
void FristDup(int a[])
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
  if(count>1)
   System.out.println(a[i]);
   break;
 }
}
   void LastDup(int a[])
    {
    int b[]=new int[a.length];
    int ld=0;
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
     if(count>1)
      ld=a[i];
     }
     System.out.println(ld);
    }
     

    void MaxDup(int a[])
    {
    int b[]=new int[a.length];
    int ld=0,max=0;
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
     if(count>1)
       if(a[i]>max)
        max=a[i];
     }
     System.out.println(max);
    }
   

    void RepDup(int a[])
    {
    int b[]=new int[a.length];
    int ld=0,max=0,index=0;
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
     if(count>1)
       if(count>max)
        {
         index=i;
         max=count;
     } }
     System.out.println("most repeated "+a[index]);
    }



    void LRepDup(int a[])
    {
    int b[]=new int[a.length];
    int ec=0,d=0;
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
     if(count>1)
     {
     if(count%2==0)
      {
      ec=a[i];
      System.out.println(ec);
       }
     }

 
   }
  
    
   }
    

}