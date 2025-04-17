import java.util.Scanner;
class Ar
{
 public static void main(String []args)
  {
   Scanner s=new Scanner(System.in);
   int arr[]=new int[5];
   System.out.println("enter the numbers");
   for(int x=0;x<arr.length-1;x++)
   {
    arr[x]=s.nextInt();
   }
   System.out.println("entered numbers are :");
   for(int x=0;x<arr.length-1;x++)
   {
    System.out.println(arr[x]);
   }
  }
  

}
