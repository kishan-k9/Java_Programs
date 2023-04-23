public class reverse_a_number{
    public static void main(String[] args) {
        int i=4,j=0;
        int a[]={2,3,4,5,6};
        System.out.print("Original no. is  : ");
        while(j!=i+1){
            System.out.print(a[j]);
            j++;
        }
        System.out.print("\nReverse is  : ");
        while(i>=0){
            System.out.print(a[i]);
            i--;
        }
    }
}
/*
   output
   Original no. is  : 23456
   Reverse is  : 65432 
 */