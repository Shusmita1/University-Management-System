package operations;

import models.*;
public class CourseOperations extends Student{
    void insertCourse(Course c) 
	{
		 
	}
	void removeCourse(Course c)  
	{
		
	}
//	Course getCourse(int CourseNumber)  
//	{
//		return null;
//	}
	void showAllCourse( )  
	{
		
	}
 
    private void saveHistory()
    {
        try {
          File myObj = new File("History.txt");
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
         //   System.out.println("File already exists.");
              
              try {
                    FileWriter myWriter = new FileWriter("History.txt");
                      myWriter.write("Files in Java might be tricky, but it is fun enough!");
                      myWriter.close();
                      System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                      System.out.println("An error occurred when writing transaction.");
                      e.printStackTrace();
                    }
          }
        } catch (IOException e) {
          System.out.println("An error occurred when creating History.");
          e.printStackTrace();
        }
    }
 

}