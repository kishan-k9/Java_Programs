// Program to swap two number without temp variable using local variable by user input..
import java.util.Scanner;
class swapwlu{
  public static void main(String[] as){
   
    Scanner n=new Scanner(System.in);
    System.out.println("Enter two number : ");
    int a=n.nextInt();
    int b=n.nextInt();
    System.out.println("Before swaping : a = "+a+" and b = "+b);
    //swaping perform
    a=a+b;   
    b=a-b;
    a=a-b;
    System.out.println("After swaping : a = "+a+" and b = "+b);
  }
}
/* output
Enter two number :
3
45
Before swaping : a = 3 and b = 45
After swaping : a = 45 and b = 3
*/