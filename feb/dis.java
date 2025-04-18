class Mn{

	public static void main(String []args){
	   int product,price=15000,q=2,fprice;
       int dis;
       int tax;
       product=price*q;
       dis=q*(product/100*10);
       tax=q*(product/100*5);
       fprice=product-dis+tax;
       System.out.println(fprice);}}