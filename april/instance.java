class Mj
{ 
int i,j;
public static void main(String [] args)
 {
  Mj s=new Mj();
  Ht s1=new Ht();
  s.i=10;
  s.j=20;
  s1.c=s1.a+s1.b;
 System.out.println(s.i+s.j+" "+s1.c);
 } 
}
class Ht
{
 int a=20; 
 int b=30;
 int c;
 
}