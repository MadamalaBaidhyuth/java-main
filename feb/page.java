class Page{
	public static void main(String []args)
	{
		int m=40,t=50,h=60,e=90;
		int total=m+t+h+e;
		System.out.println(total);
		if(m<30||t<30||h<30||e<30)
		{
		 System.out.println("fail");
		}
		else if(total>100)
		{
		System.out.println("C GRADE");
		}
		else if(total>250)
		{	
		System.out.println("B GRADE");
		}
		else if(total>350)
		{
		System.out.println("A GRADE");	
		}
		else if(total==400)
		{
		System.out.println("A+ GRADE");
		}
	}
	  }