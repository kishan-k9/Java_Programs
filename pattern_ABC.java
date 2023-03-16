//print This Pattern using one loop...
//   ADA
//   BCB
//   CBC
//   DAD


public class pattern_ABC{   
  public static void main(String[] args){
    char a[]={'A','B','C','D'}; // initialization of given variable as character 
    int i,j;
    for(i=0,j=3;i<=3 && j>=0;i++,j--){  // loop for executing given condition
     System.out.println(a[i]+""+a[j]+""+a[i]);  //print the result
   }
 }
}

/*
output..

ADA
BCB
CBC
DAD
*/
