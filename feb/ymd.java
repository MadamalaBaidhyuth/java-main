class Mj
{
 public static void main(String []args)
	{
	int num=5000;
	int year=num/365;
	int sub=num-year*365;
	int months=sub/31;
	int days=sub%31;
	System.out.println(year+" year " +months+" month "+days+" days");
	
	}
}