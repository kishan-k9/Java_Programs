//Program to swap two number by user input the value as local variable
import java.util.Scanner;
class swapulp{
  public static void main(String[] s){
   Scanner n=new Scanner(System.in);
   int a,b,temp;  // local variable
   System.out.println("Enter Two number : ");
   a=n.nextInt();
   b=n.nextInt();
   System.out.println("Before Swaping a = "+a+" and b = "+b);
   temp=a;
   a=b;
   b=temp;
   System.out.println("After Swaping a = "+a+" and b = "+b);
  }
}

/*  output...
Enter Two number :
3
5
Before Swaping a = 3 and b = 5
After Swaping a = 5 and b = 3
*/