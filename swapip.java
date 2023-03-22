// Program to swap two number by initialize the value as instance variable
class swapip{
  int a=4,b=3,temp; // instance variable
  public static void main(String[] s){
   swapip x=new swapip();
   System.out.println("Before Swaping a = "+x.a+" and b = "+x.b);
   x.temp=x.a;
   x.a=x.b;
   x.b=x.temp;
   System.out.println("After Swaping a = "+x.a+" and b = "+x.b);
  }
}

/*  output...
Before Swaping a = 4 and b = 3
After Swaping a = 3 and b = 4
*/