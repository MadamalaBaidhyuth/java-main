class T_array
{
public static void main(String args[])
{
int a[][]=new int[][]{{1,2,3},{4,5,6},{1,3,5}};
T_array b=new T_array();
b.m1(a);
}
void m1(int a[][])
{
 for(int r=0;r<=a.length-1;r++)
 {
  for(int c=0;c<=a.length-1;c++)
   {
    System.out.print(a[r][c]);
   }
  System.out.println(" ");
}

 for(int t[]:a)
      {
      for(int t2:t)
       System.out.print(t2+" ");
      System.out.println(" ");
       }
     

}
}