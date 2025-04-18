class Mn{

	public static void main(String []args){
       int product,price=25000,q=2,fprice;
       String pname="laptop";
       String brand="macboook";
       System.out.println("\n PRODUCT: "+pname+"\n BRAND: "+brand+"\n ORGINAL PRICE: "+price);
       int dis;
       int tax;
       String name="student";
       product=price*q;

       if(name =="student")
{
       dis=product/100*30;
       tax=product/100*3;
       fprice=price-dis+tax;
       System.out.println(" STUDENT OFFER:30% OFF = "+dis);
       System.out.println(" Tax: "+tax);
       System.out.println(" FINAL PRICE: "+fprice);
}
       else{

       dis=q*(product/100*10);
       tax=q*(product/100*5);
       fprice=product-dis+tax;
       System.out.println(fprice);
}
}	
}