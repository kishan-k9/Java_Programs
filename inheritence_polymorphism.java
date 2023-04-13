class Animal{
    protected String name;
    protected int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void sound(){
        System.out.println("The Animal Makes Sound");
    }
    void showinfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Dog extends Animal{
    private String breed;
    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed=breed;
    }
    void sound(){
        System.out.println("Dog make barks");
    }
    void showinfo(){
        super.showinfo();
        System.out.println("Breed : "+breed);
    }
}
class Cat extends Animal{
    private boolean indoor;
    public Cat(String name,int age,boolean indoor){
        super(name,age);
        this.indoor=indoor;
    }
    void sound(){
        System.out.println("Cat make meows");
    }
    void showinfo(){
        super.showinfo();
        System.out.println("Indoor : "+(indoor ? "Yes" : "No"));
    }
}
public class inheritence_polymorphism{
    public static void main(String[] args) {
        Animal a=new Animal("unknown",0);
        a.sound();
        a.showinfo();
        System.out.println("--------------------------");
        Dog d=new Dog("Shero", 3, "Poodle");
        d.sound();
        d.showinfo();
        System.out.println("--------------------------");
        Cat c=new Cat("Kitty", 2, true);
        c.sound();
        c.showinfo();
    }
}

/*
 output...
 The Animal Makes Sound
Name : unknown
Age : 0
--------------------------
Dog make barks
Name : Shero
Age : 3
Breed : Poodle
--------------------------
Cat make meows
Name : Kitty
Age : 2
Indoor : Yes
 */