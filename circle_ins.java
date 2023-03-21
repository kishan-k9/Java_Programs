// W A P to find area of circle using instance variable
class circle_ins  
 {  
   double r=7, pi=3.14 ,area; //instance variable
   public static void main (String[] x)  
    {   
        circle_ins s=new circle_ins();
        s.area=s.pi*s.r*s.r;     
        System.out.println("Area of circle is : "+s.area);  
    }
}  

/*
output
Area of circle is : 153.86
*/