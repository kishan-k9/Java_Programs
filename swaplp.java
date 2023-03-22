// Program to swap two number by initialize the value as local variable
class swaplp{
  public static void main(String[] s){
   int a=4,b=3,temp;
   System.out.println("Before Swaping a = "+a+" and b = "+b);
   temp=a;
   a=b;
   b=temp;
   System.out.println("After Swaping a = "+a+" and b = "+b);
  }
}

/*  output...
Before Swaping a = 4 and b = 3
After Swaping a = 3 and b = 4
*/