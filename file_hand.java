import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class file_hand {
    public static void main(String[] args) throws IOException {
        /*        
          File myFile = new File("file_1.txt");     // creating a txt file
          try {
          boolean value = myFile.createNewFile();
          if(value){
          System.out.println("New file is created..");
          }else{
          System.out.println("the file is all ready exist");
          }
          } catch (IOException e) {
          System.out.println("unable to create this file");
          e.getStackTrace();
          }
         
        try {    // writing to a file..
            FileWriter filew = new FileWriter("file_1.txt");
            filew.write("this is java cool\nbaby");
            filew.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // reading to a file
        File myFile = new File("file_1.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line=sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
        
        //deleting a file
        File myFile = new File("New Text Document.txt");
        if(myFile.delete()){
            System.out.println("i have deleted : "+myFile.getName());
        }
        else{
            System.out.println("Some problem is error...");
        }
        */
    }
}
/*
 * You can see the file_1.txt in your saved java programs..
 * output
 * New file is created..
 * 
 */