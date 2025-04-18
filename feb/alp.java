class Mj
	{
	public static void main(String []args)
	 {
	  char c='a';
	  if(c>='A' && c<='Z')
	  {
	   int d=c+32;
           char f=(char)(d);
	   System.out.println(f);
	  }
	  else if(c>='a' && c<='z')
	  {
	   int d=c-32;
	   char f=(char)(d);
	   System.out.println(f);
	  }
          else
	  {
	   System.out.print("not alphabets they are may be symbols or digits");
	  }
	 }
	}		
	   
