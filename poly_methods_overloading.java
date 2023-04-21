public class poly_methods_overloading {
    void fun1(int x){
        System.out.println(x);
    }
    int fun1(int x,int y){
        return(x+y);
    }
    double fun1(double x,double y,double z){
        return(x+y+z);
    }
    public static void main(String[] args) {
        poly_methods_overloading obj=new poly_methods_overloading();
        obj.fun1(7);
        System.out.println(obj.fun1(3, 5));
        System.out.println(obj.fun1(3, 5,8));
    }
}
