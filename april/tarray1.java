class T_array
{
public static void main(String args[])
{
int a[][]=new int[][]{{1,2,3},{4,5,6},{1,3,5}};
int b[][]=new int[][]{{1,2,3},{4,5,6},{1,3,5}};
T_array t=new T_array();
t.m1(a,b);
}
void m1(int a[][],int b[][])
{
 int  d[][]=new int[a.length][a.length];
 for(int r=0;r<=a.length-1;r++)
 {
  for(int c=0;c<=a.length-1;c++)
   {
    d[r][c]=a[r][c]+b[r][c];
    System.out.print(d[r][c]+" ");
   }
  System.out.println(" ");
}

     

}
}