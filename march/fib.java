class Mj
{
 public static void main(String []args)
 {
 int a=0,b=1,c=0;
 int start=1,end=11;
 System.out.print(a+" "+b);
 while(start<=end)
  { 
  c=a+b;
  System.out.print(" "+c);
  a=b;
  b=c;
  start++;
  }
  
 }
}