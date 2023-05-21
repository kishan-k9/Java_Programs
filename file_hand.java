import java.io.*;
import java.util.Scanner;

class file_hand {
    void Create() throws IOException{
        File myFile = new File("file_1.txt");     
            boolean value = myFile.createNewFile();
            if(value){
                System.out.println("New file is created..");
            }else{
                System.out.println("the file is all ready exist");
            }
    }
    void Write() throws IOException{
        FileWriter filew1 = new FileWriter("file_1.txt");
        filew1.write("this is java cool");
        filew1.close();
    }
    void wc() throws IOException{
        Scanner s= new Scanner(System.in);  
        System.out.print("Enter a String: ");  
        String str= s.nextLine(); 
		FileWriter fw=new FileWriter("file_1.txt");
		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));

		System.out.println("Writing successful");
		fw.close();
    }
    void Read() throws IOException{
        File myFile = new File("file_1.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line=sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
    }
    void Delete() throws IOException{
        File myFile = new File("file_1.txt");
        if(myFile.delete()){
            System.out.println("i have deleted : "+myFile.getName());
        }
        else{
            System.out.println("Some problem is error...");
        }
    }
    public static void main(String[] args) throws IOException {
        file_hand obj = new file_hand();
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("File Handling Operations");
        do {
            System.out.println("1. Create file\n2. Write into File\n3. Write from console\n4. Read from file\n5. Delete File\n6. Exit");
            System.out.println("Choose option : ");
            n=x.nextInt();
            switch(n){
                case 1:
                    obj.Create();
                break;
                case 2:
                    obj.Write();
                break;
                case 3:
                    obj.wc();
                    break;
                case 4:
                    obj.Read();
                    break;
                case 5:
                    obj.Delete();  
                break;
                default:
                    System.out.println("Good_Bye");
                break;
            }
        } while (n!=6);
        x.close();
    }
}
