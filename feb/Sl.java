class Sl{
   public static void main(String []args)
   {
	char a='Z';
	int k=a;
	char b='z';
	int j=b;

  	if(k>=j)
	{
		if(k==j)
		{	
			System.out.println(a+" and "+b+"they are same");
		}
		else
		{
			k=k-32;
       			if(k==j)
			{
  				System.out.println(a+" and "+b+" they are same ");
   			}
   			else
			{
  				System.out.println(a+" and "+b+" they are not same ");
			}
  		}
	}
 	else
	{
 		if(k==j)
 		{	
			System.out.println(a+" and "+b+" they are same");
 		} 
		else
		{
    			k=k+32;
			if(k==j)
			{
  				System.out.println(a+" and "+b+" they are same ");
   			}
   			else
			{
  				System.out.println(a+" and "+b+"they are not same ");
  			}
		}
	}
   }
}