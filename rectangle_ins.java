// W A P to find the area of rectangle using instance variable
class rectangle_ins  
 {  
   double l=10,b=8,area; //instance variable
   public static void main (String[] x)  
    {   
        rectangle_ins s=new rectangle_ins();
        s.area=s.l*s.b;     
        System.out.println("Area of Rectangle is : "+s.area);  
    }
}  


/*
output
Area of Rectangle is : 80
*/  