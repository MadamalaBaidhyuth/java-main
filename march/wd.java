class Mj
{
public static void main(String []args)
 {
  int start=1,end=20;
  while(start<=end)
   {
     if(start%3==0 && start%5==0) 	//1%3==0f&&1%5==0f/(2%3==0f&&2%5==0f)...15%3==0t &&1 5%5==0T
	System.out.println(start+" fizzBuzz");
	else if(start%3==0) 	//1%3==0f/2%3==0f/3%3==0T....10%3==0f
	System.out.println(start+" fizz");
	else if(start%5==0)   //1%5==0f/2%5==0f/3%5==0f/4%5==0f/5%5==0t....10%5==0t
	System.out.println(start+" Buzz");
	else
	System.out.println(start);
     start++;
   }
 }
}