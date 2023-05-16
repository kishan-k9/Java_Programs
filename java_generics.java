import java.util.ArrayList;
// generic is used to reduce bug in java programs

class mygen<G1>{
    int val;
    private G1 g1;

    public mygen(int val, G1 g1){
        this.val = val;
        this.g1 = g1;
    }
    public int getval(){
        return val;
    }
    public void setval(int val){
        this.val = val;
    }
    public G1 getG1(){
        return g1;
    }
    public void setg1(G1 g1){
        this.g1 = g1;
    }
}
public class java_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.add("str1");        
        arrayList.add(54);        
        arrayList.add(643);
        //arrayList.add(new Scanner(System.in));
        
        int a = arrayList.get(0);
        mygen<String> s1 = new mygen(23, "hello_generics");
        String str = s1.getG1();
        System.out.println(str);
    }
}
/*
 output
 hello_generics
 */