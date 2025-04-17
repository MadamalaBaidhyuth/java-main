class Pr
{
 public static void main(String []args)
  {
  String pname="HP Laptop";
  String pcode="1A4C";
  double  pprice=12340;
  int pquantity=2;
  double ptotal=pprice*pquantity;

  if(ptotal>=10000 && ptotal<20000)
   {
    double discount=ptotal/100*10;
    double tax=pprice/100*18;
    double total=ptotal-discount+tax;
    
    System.out.println("product name     : "+pname);
    System.out.println("product quantity : "+pquantity);
    System.out.println("product code     : "+pcode);
    System.out.println("product total price : "+ptotal);
    System.out.println("product discount    :- "+discount);
    System.out.println("product discount    :+ "+tax);
    System.out.println("product final price is "+total);
   }
   else if(ptotal>=20000 && ptotal<30000)
   {
    double discount=(ptotal/100*13);
    double tax=pprice/100*18;
    double total=(ptotal-discount)+tax;

    System.out.println("product name     : "+pname);
    System.out.println("product quantity : "+pquantity);
    System.out.println("product code     : "+pcode);
    System.out.println("product total price : "+ptotal);
    System.out.println("product discount    :- "+discount);
    System.out.println("product discount    :+ "+tax);
    System.out.println("product final price is "+total);

   }
   else if(ptotal>=30000 && ptotal<40000)
   {
    double discount=ptotal/100*20;
    double tax=pprice/100*18;
    double total=ptotal-discount+tax;
    System.out.println("product name     : "+pname);
    System.out.println("product quantity : "+pquantity);
    System.out.println("product code     : "+pcode);
    System.out.println("product total price : "+ptotal);
    System.out.println("product discount    :- "+discount);
    System.out.println("product discount    :+ "+tax);
    System.out.println("procuct final price is "+total);

   }
   else if(ptotal>=40000)
   {
    double discount=ptotal/100*30;
    double tax=pprice/100*18;
    double total=ptotal-discount+tax;

    System.out.println("product name     : "+pname);
    System.out.println("product quantity : "+pquantity);
    System.out.println("product code     : "+pcode);
    System.out.println("product total price : "+ptotal);
    System.out.println("product discount    :- "+discount);
    System.out.println("product discount    :+ "+tax);
    System.out.println("procuct final price is : "+total);

   }
   
  }

}