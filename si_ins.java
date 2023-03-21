// W A P to find the simple interest using instance variable
class si_ins  
 {  
   float p=12000,r=12,t=2,si; // instance variable 
   public static void main (String[] x)  
    {
        si_ins s=new si_ins();    
        s.si  = (s.p*s.r*s.t)/100;   
        System.out.println("Simple Interest is: " +s.si);  
    }
}  
/*
output
Simple Interest is : 2880.0
*/