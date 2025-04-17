class Ar
{ 
 
 public static void main(String args[])
 {
  A ar=new B();
  ar.add(10);
 
  
  }
}
/*
class A
 { 
  
  void add(final int a){
    final int c=20;
  
  System.out.println(a);
  
  }
  }
class B extends A
  { 
  void add(final int b) 
  { 
  final int c=20;
  System.out.println(c);
  System.out.println("child "+b);
   }
  }*/
 

class A
 { 
   void add(int a)
   {
  System.out.println(a);
    }
  }

 class B extends A
  { 
   void add(int b) 
  { 
  System.out.println("child "+b);
   }
  }
