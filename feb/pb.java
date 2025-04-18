class Pb{
	public static void main(String []args)
	{
	 int bprice=1000;
	 String p="btech";
	 int days=45;

	 if(p=="btech"||p=="pg")
	  {
	   if(days<15)
		{
		System.out.println("\n book is free to read"+"\n");
		}
	    else if(days<30)
		{
		 days=days-15;
		 int tax=days*10;
	        System.out.println("\n per day 10rs extra money should be paid total "+tax+"\n");
		}
	    else if(days>=30)
		{ 
		System.out.println("\n money should paid after mouth is "+bprice+"\n");
		}
	  }

	 else if(p=="inter")
		{
		 if(days<20)
			{
			System.out.println("\n book is free to read"+"\n");
			}
	    	else if(days<60)
			{
		 	days=days-5;
		 	int tax=days*10;
	        	System.out.println("\n per day 5rs extra money should be paid total"+tax+"\n");
			}
	    	else if(days>=60){ 
			System.out.println("\n money should paidafter mouth is"+bprice+"\n");
			}
		}
	}
      }