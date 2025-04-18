class Gen{
 public static void main(String []agrs){
	String gender="male";
	int fee=50000;
	if(gender=="male"){
	int sp=15000;
	fee=fee-sp;
	System.out.println("\n Total Fee for Male is "+fee);
	}
	else{	
	int sp=25000;
	fee=fee-sp;
	System.out.println("\n Total Fee for female is"+fee);
	}	
}
}