// Program to swap two number without temp variable using local variable by initialization...
class swapwlp{
  public static void main(String[] as){
    int a=4,b=5;
    System.out.println("Before swaping : a = "+a+" and b = "+b);
    //swaping perform
    a=a+b;   
    b=a-b;
    a=a-b;
    System.out.println("After swaping : a = "+a+" and b = "+b);
  }
}
/* output
Before swaping : a = 4 and b = 5
After swaping : a = 5 and b = 4
*/