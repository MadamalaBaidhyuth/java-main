class Age{
	public static void main(String []args)
		{
		int age=9;
		if(age>100)
			{
			System.out.println("age do not exits");
			}
		else if(age>60 && age<100)
			{
			System.out.println("senior citizen");
			}
		else if(age>18 && age<60)
			{
			System.out.println("major");
			}
		else if(age>10 && age<18)
			{
			System.out.println("minor");
			}
		else if(age>0 && age<10)
			{
			System.out.println("kid");
			}
		else{
			System.out.println("invalid");
		    }
		}
	}