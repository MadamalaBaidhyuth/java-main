class Sl{
public static void main(String []args){
char a='g';
int k=a;
char b='G';
int j=b;
	
	if(k==j)
	{
	System.out.println(a+" and "+b+"they are same");
 	}

	else if(k>j)
	{
		k=k-32;
       		if(k==j){
  		System.out.println(a+" and "+b+" they are same ");	
			}
   		else{
  			System.out.println(a+" and "+b+" they are not same "); 
		    }
  	}
 	else
	{	
		k=k+32;
		if(k==j){
  			System.out.println(a+" and "+b+" they are same ");
   			}
   		else{
  			System.out.println(a+" and "+b+"they are not same ");
  			}
	}
}
}