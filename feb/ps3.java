class Ps
{
 public static void main(String []args)
{
	int n=25;
	int i;
	for(i=2;i<=9;i++){

	if(n%i==0 && n/i==i){
	System.out.println(n+" perfect squre");
        break;
	}
	else{
	System.out.println(n+" not a perfect squre");
}
}	
}
}