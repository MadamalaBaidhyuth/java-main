class Mj
{
public static void main(String []args)
 {
  int start=1,end=10,num=8;
  while(start<=end)
   { 
     int m=start*num;
     int square=(int)Math.sqrt(m);
     if(square*square==m)
	System.out.println(num+"*"+start+"="+m+"is perfect square");
    start++;
   }
  }
}