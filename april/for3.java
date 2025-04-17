class Mj
{
public static void main(String []args)
{
int i=0,j=0,k=0;
for(i=1;i<=10;i++)
 { 
   for(k=10;k>=i;k--)
     {
      System.out.print(' ');
     }
   for(j=i;j>=1;j--)
    {
     System.out.print('*');
    }
    System.out.println();
  }
}

}