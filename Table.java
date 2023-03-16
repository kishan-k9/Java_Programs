// program to print a table as (n) given input and (n+1) its reverse table using one loop


import java.util.Scanner;
public class Table{
    public static void main(String[] args) throws Exception{
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=x.nextInt();
        int i,j;
        for(i=1,j=10;i<=10 || j>=1;i++,j--){
           System.out.println(n+" * "+i+" = "+(n*i)+" || "+(n+1)+" * "+j+" = "+(n+1)*j);
        }
    }
}
