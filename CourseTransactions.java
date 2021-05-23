package operations; 
import models.*;
import operations.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

import java.util.*;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CourseTransactions extends Course  {

     
        
	
	public static void adding(int quantity)  
	{
          String history="";
        Scanner sc = new Scanner(System.in);
	      System.out.print("\n______________ Adding Course ______________ ");
           //  new Student();
        
           
             for(int i = 1; i <= quantity; i++){
                 System.out.print("\nSid: ");
                int sid = sc.nextInt();
                System.out.print("\nCourse Number: ");
                int cn = sc.nextInt();
                System.out.print("\nCourse Credit: ");
                int cc = sc.nextInt();
               String timeStamp = new SimpleDateFormat("yyyy.MM.dd - HH.mm.ss").format(new Date());
                
            history = "Adding Course (" +i+") => Sid: "+sid+", Course Number: "+cn+",Course Credit: "+cc+", Adding Time: "+timeStamp;
            System.out.print("\nSaved Successfully: "+history);
            saveHistory(history);
            
             }
          
    }
	
	public static void dropping(int quantity)   
	{
         String history="";
         Scanner sc = new Scanner(System.in);
	      System.out.print("\n______________ Withdrawing Course ______________ ");
           //  new Student();
        
           
             for(int i = 1; i <= quantity; i++){
                 System.out.print("\nSid: ");
                int sid = sc.nextInt();
                System.out.print("\nCourse Number: ");
                int cn = sc.nextInt();
//                System.out.print("\nCourse Credit: ");
//                int cc = sc.nextInt();
               String timeStamp = new SimpleDateFormat("yyyy.MM.dd - HH.mm.ss").format(new Date());
                
            history = "Withdrawing Course (" +i+") => Sid: "+sid+", Course Number: "+cn+", Withdrawing Time: "+timeStamp;
            System.out.print("\nSaved Successfully: "+history);
            saveHistory(history);
             
            }
	}
	
	public static void saveHistory(String s)
    {
        try {
          File myObj = new File("History.txt");
          if (myObj.createNewFile()) {
          //  System.out.println("File created: " + myObj.getName());
               FileWriter myWriter = new FileWriter("History.txt",true);
                      myWriter.write("\n"+s);
                      myWriter.close();
          } else {
         //   System.out.println("File already exists.");
              
              try {
                    FileWriter myWriter = new FileWriter("History.txt",true);
                      myWriter.write("\n"+s);
                      myWriter.close();
                    //  System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                     // System.out.println("An error occurred when writing transaction.");
                      e.printStackTrace();
                    }
          }
        } catch (IOException e) {
          System.out.println("An error occurred when creating History.");
          e.printStackTrace();
        }
    }
	
}