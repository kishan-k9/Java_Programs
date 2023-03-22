// Program to swap two number without temp variable using instance variable by user input..
import java.util.Scanner;
class swapwiu{
  int a,b;  //instance variable
  public static void main(String[] as){
    swapwiu x=new swapwiu();
    Scanner n=new Scanner(System.in);
    System.out.println("Enter two number : ");
    x.a=n.nextInt();
    x.b=n.nextInt();
    System.out.println("Before swaping : a = "+x.a+" and b = "+x.b);
    //swaping perform
    x.a=x.a+x.b;   
    x.b=x.a-x.b;
    x.a=x.a-x.b;
    System.out.println("After swaping : a = "+x.a+" and b = "+x.b);
  }
}
/* output
Enter two number :
3
34
Before swaping : a = 3 and b = 34
After swaping : a = 34 and b = 3
*/