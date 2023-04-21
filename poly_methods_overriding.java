class A{
    void show(){
        System.out.println("Hai");
    }
}
class B extends A{
    void show(){
        System.out.println("Bay");
    }
}
class C extends B{
    void show(){
        System.out.println("Good_Bay");
    }
}
public class poly_methods_overriding extends C {
    public static void main(String[] args) {
        A obj1=new A();  
        A obj2=new B();     //upcasting
        A obj3=new C();     //upcasting
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
