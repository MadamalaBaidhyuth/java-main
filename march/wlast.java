class Mj
{
public static void main(String []args)
 {
  int start=1,end=100,sum=0,pro=1;
  while(start<=end)
   {
     int last=start%10; //1,2,3.........0,1,2,3,4.....
     System.out.println(start+" last value is"+last);
     start++;
   }

 }
}