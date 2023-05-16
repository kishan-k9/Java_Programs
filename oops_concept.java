class father{                    // Encapsulation
    public void Add(int a, int b) {
        int c = a + b;
        System.out.println("The int sum a & b : " + c);
    }
    public void Add(float a, float b){// Overload
        float c = a + b;
        System.out.println("The float sum a & b : " + c);
    }
}
class child extends father {     // child class inherit from father class
    public void Add(int a, int b){// Override
        int c = a * b;
        System.out.println("This is multiplication Override a & b : " + c);
    }
}

interface abs1{// Abstraction
    // these are abstract methods (does not have a body)
    void run();
    void walk();
}
class abs2 implements abs1 {
    // The body of run() is provided here
    public void run() {
        System.out.println("run() - the system is running ");
    }
    // The body of walk() is provided here
    public void walk() {
        System.out.println("walk() - the system is walking ");
    }
}

public class oops_concept {
    public static void main(String[] args) {
        father v = new father();  //creating object v of father class

        System.out.println("For father class");
        v.Add(2, 3); // addition of two integers
        v.Add(2.3f, 2.7f); // addition of two floats

        father m = new child();   //upcasting 
        
        System.out.println("For child which is inherited from father class");
        m.Add(2, 3); // multiplication of two integers
        System.out.println("The abstraction is perform....both function");
        abs2 p = new abs2();// constructor created, object Instantiation
        p.run();
        p.walk();
    }
}

/*
  output
For father class
The int sum a & b : 5
The float sum a & b : 5.0
For child which is inherited from father class
This is multiplication Override a & b : 6
The abstraction is perform....both function
run() - the system is running 
walk() - the system is walking
 */