class Ps{
 public static void main(String []args){
	int n=25;
	double res=Math.sqrt(n);
	int n2=(int)res;
	double f=res%n2;
	if(f==0.0){
	System.out.println(n+" perfect squre");
	}else{
	System.out.println(n+" not a perfect squre");}
	
}
}