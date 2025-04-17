class Mj
{
public static void main(String []args)
 {
  int start=1,end=10,num=8;
  System.out.println("\n even");
  while(start<=end)
   { 
      if(start%2==0)
      {
        int m=start*num;
	System.out.println(num+"*"+start+"="+m);
       }

    start++;
   }
   int start1=1,end1=10;
   System.out.println("\n odd");
   while(start1<=end1)
   { 
      if(start1%2!=0)
      {
        int d=start*num;
	System.out.println(num+"*"+start1+"="+d);
       }

    start1++;
   }
  }
}