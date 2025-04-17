import java.util.Scanner;
class Ar
{
 public static void main(String []args)
  {
   Scanner s=new Scanner(System.in);
   //int arr[]=new int[5];
   Ar a=new Ar();
   a.main((short)10);
  }
  void main()
  {
    System.out.println(" default");
  }

  void main(int x)
  {
    System.out.println(" int");
   
 }

  void main(short x)
  {
   System.out.println(" short");
  }
  
  void main(byte x)
  {
   System.out.println(" short");
  }

}