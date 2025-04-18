class Mj
{
public static void main(String []args)
	{
	int rank=1234;
	int castrank=3;
	String cast="oc";
	String college="klu";
	String branch="ece";
	int m=34,p=56,c=30;
	
	if(m>=30 && p>=30 && c>=30)
	{										
	System.out.println("your are eligible");
	if(cast=="oc")
	{
		if(college=="kru" )
		{
			int cse_seats=3;
			int ece_seats=7;

			if(castrank>0 && castrank<=10 && branch=="cse")
				System.out.println("cse seat in Kru is allocated");	
			else if(castrank>0 && castrank<=20 && branch=="ece")
				System.out.println("ece seat in Kru is allocated");
			else
				System.out.println("your rank is not saficient");
			
		}
		else if(college=="klu")
		{
		
			int cse_seats=10;
			int ece_seats=25;
			if(castrank>0 && castrank<=30 && branch=="cse")
				System.out.println("cse seat in klu is allocated");	
			else if(castrank>0 && castrank<=40 && branch=="ece")
				System.out.println("ece seat in klu is allocated");
			else
				System.out.println("your rank is not saficient");
		}


		
	}
	else if(cast=="bc")
	{
		
	
		if(college=="kru" )
		{
			int cse_seats=3;
			int ece_seats=7;

			if(castrank>0 && castrank<=20 && branch=="cse")
				System.out.println("cse seat in Kru is allocated");	
			else if(castrank>0 && castrank<=30 && branch=="ece")
				System.out.println("ece seat in Kru is allocated");
			else
				System.out.println("your rank is not saficient");
			
		}
		else if(college=="klu")
		{
		
			int cse_seats=10;
			int ece_seats=25;
			if(castrank>0 && castrank<=40 && branch=="cse")
				System.out.println("cse seat in klu is allocated");	
			else if(castrank>0 && castrank<=50 && branch=="ece")
				System.out.println("ece seat in klu is allocated");
			else
				System.out.println("your rank is not saficient");
		}


	}

	}
	else
	{
	System.out.println("you are not qualified");
	}
	


	}
}