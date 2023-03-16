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
/*
output..

Enter the number : 
2
2 * 1 = 2 || 3 * 10 = 30
2 * 2 = 4 || 3 * 9 = 27
2 * 3 = 6 || 3 * 8 = 24
2 * 4 = 8 || 3 * 7 = 21
2 * 5 = 10 || 3 * 6 = 18
2 * 6 = 12 || 3 * 5 = 15
2 * 7 = 14 || 3 * 4 = 12
2 * 8 = 16 || 3 * 3 = 9
2 * 9 = 18 || 3 * 2 = 6
2 * 10 = 20 || 3 * 1 = 3
*/
