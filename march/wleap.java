class Mj
{
 public static void main(String []args)
 { 
  int start=1800,end=2000,num=0;
  while(start<=2000)
   {
    if((start%4==0 && start%100!=0)||start%400==0)
	System.out.println(start+" leap year");
    else
	System.out.println(start);
    }
 }
}