class Mj
{
 public static void main(String []args)
 { 
  int start=1600,end=2000,num=0;
  while(start<=end)//1600/1601//1602/1603/1604/1605/1606/1607/1608......
   {
    if((start%4==0 && start%100!=0)||start%400==0)
     {
	
       if(start%6==0)   //1600%6==0f/1601%6==0f/1602%6==0f/1603%6==0f/1604%6==0f/1605%6==0f/1606%6==0f/1607%6==0f/1608%6==0t
	System.out.println(start+" leap year");
      }
   start++;
    }
 }
}