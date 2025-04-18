class Mj
{
	public static void main(String []args)
	{
	int n=36;
	double sr=Math.sqrt(n);
	double f=(int)(sr);
	int g=n%10;
	System.out.println(n%2==0?(sr==f?"perfect squre":"not aperfect square"):(g%5==0?"odd and divisible by 5":"odd not divisible by 5"));
}
}