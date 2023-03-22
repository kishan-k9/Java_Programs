// Program to swap two number without temp variable using instance variable by user input..
import java.util.Scanner;
class swapwip{
  int a=4,b=6;  //instance variable
  public static void main(String[] as){
    swapwip x=new swapwip();
    System.out.println("Before swaping : a = "+x.a+" and b = "+x.b);
    //swaping perform
    x.a=x.a+x.b;   
    x.b=x.a-x.b;
    x.a=x.a-x.b;
    System.out.println("After swaping : a = "+x.a+" and b = "+x.b);
  }
}
/* output
Before swaping : a = 4 and b = 6
After swaping : a = 6 and b = 4
*/