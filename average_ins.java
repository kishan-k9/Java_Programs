// W A P to find the average using instance variable
class average_ins  
 {  
    float n1=4,n2=5,n3=8,avg; //instance variable
     public static void main (String[] x)  
     {   
        average_ins s=new average_ins();
        s.avg=(s.n1+s.n2+s.n3)/3;     
        System.out.println("The Average is : "+s.avg);  
     }
}  

/*
output
The Average is : 5.6666665
*/  