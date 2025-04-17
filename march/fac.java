class Mj
{
public static void main(String []args)
 {
  int start=1,n=5,r=3,p=1,q=1;
  while(start<=n)
   {
     p*=start; 
     start++;
    }
    System.out.println(p);
    int nmf=n-r;
    start=1;

    while(start<=nmf) 
   {
     q*=start;
     start++;
    }
    System.out.println(q);

  }
}