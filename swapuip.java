//Program to swap two number by user input the value as instance variable
import java.util.Scanner;
class swapuip{
  int a,b,temp;  // instance variable
  public static void main(String[] s){
   Scanner n=new Scanner(System.in);
   swapuip x=new swapuip();
   System.out.println("Enter Two number : ");
   x.a=n.nextInt();
   x.b=n.nextInt();
   System.out.println("Before Swaping a = "+x.a+" and b = "+x.b);
   x.temp=x.a;
   x.a=x.b;
   x.b=x.temp;
   System.out.println("After Swaping a = "+x.a+" and b = "+x.b);
  }
}

/*  output...
Enter Two number :
3
5
Before Swaping a = 3 and b = 5
After Swaping a = 5 and b = 3
*/