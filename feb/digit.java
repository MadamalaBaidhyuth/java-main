class Mj
{
 public static void main(String []args)
 {
	int n=12;
	if(n>=0 && n<10)
	{
	System.out.println(n+"single digit");
	}
	else if(n>=10 && n<100)
	{
	System.out.println(n+" double digit");
	n=n%10;
	System.out.println(n+" is last digit");
	
	}
	else if(n>=100 && n<1000)
	{
	System.out.println(n+" single digit");
	n=n%100;
	System.out.println(n+" are last two digits");
	}
	else
	{
	System.out.println("invalid");
	}
  }
}