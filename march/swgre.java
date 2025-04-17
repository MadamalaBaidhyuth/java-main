class Mj
{
 public static void main(String []args)
	{
	  int a=10,b=20;
	  String n="-";
	  switch(n){
		case ">":
		   System.out.println(a>b?a:b+" gteater");
		   break;
		case "/":
		   System.out.println("division "+"a/b is "+(a/b));
		  break;
		case "<":
		   System.out.println(a<b?a:b+"lesser");
		   break;
		case "+":
		   System.out.println("addtion "+"a+b is "+(a+b));
		   break;
		case "-":
		   System.out.println("subtraction "+"a-b is "+(a-b));
		  break;
		case "*":
		   System.out.println("multilication "+"a*b is "+(a*b));
		   break;
		case "%":
		   System.out.println("reminder "+"a-b is "+(a%b));
		   break;
		default:
		   System.out.println("invalid");

		  }

	}
}