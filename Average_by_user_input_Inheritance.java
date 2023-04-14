import java.util.Scanner;

class Par {
    Scanner sc = new Scanner(System.in);
    int n,i;
    int a[];

    void getd() {
        System.out.println("How many numbers there are : ");
        n = sc.nextInt();
        a=new int[n];
        System.out.println("Enter the numbers...");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
}

class ch1 extends Par {
    int sum=0;
    float av;

    void avg() {
        for(i=0;i<n;i++){
            sum=sum+a[i];
        }
        av=(float)sum/n;
    }
}

class ch2 extends ch1 {
    void show() {
        System.out.println("The avg is : "+av);
    }
}

public class Average_by_user_input_Inheritance {
    public static void main(String[] args) {
        ch2 o = new ch2();
        o.getd();
        o.avg();
        o.show();
    }
}


/*
output
How many numbers are there: 
4
Enter the numbers...
1 2 3 4
The average is: 2.50
*/
