// program to check whether the given number is prime or not 

import java.util.Scanner;
public class prime_or_not{
  public static void main(String [] args){
    Scanner x= new Scanner(System.in);
    System.out.println("Enter The num : ");
    int n=x.nextInt();
    int c=0;
    for(int i=1;i<=n;i++){
    if(n%i==0){
     c++;
     }
   }
   if(c==2)
     System.out.println("prime");
   else
     System.out.println(" not prime");
 }
}

/*  output
Enter The num :
5
prime
and... 
Enter The num :
4
 not prime
*/