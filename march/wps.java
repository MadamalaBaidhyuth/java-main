class Mj
{
public static void main(String []args)
 {
  int start=1,end=10,sum=0,pro=1;
  while(start<=end)
   {
     int square=(int)Math.sqrt(start);
     if(square*square==start) //1*1=1f//2*2=2f//3*3=3f...
      {
	System.out.println(start+"is perfect square");
      }
     else  
      {
       System.out.println(start+"is not a perfect square");
      }
     start++;
    }
}