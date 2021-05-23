package operations; 

import models.*;

public class FacultyOperations extends University {
    
    public static int maxFaculty = 20;
    public static int fc = 0;
    public static Faculty[] facultyArray = new Faculty[maxFaculty]; 
  // Scanner sc = new Scanner(System.in);
    
//	void setFaculty(Faculty e)  
//	{
//		
//	}
//	void getFaculty(String fid) 
//	{
//		
//	}
	public static void insertFaculty(Faculty faculty) 
	{
		
       if(fc<=maxFaculty)
          {
           facultyArray[fc]=faculty;
           
            System.out.print("\n\n*** "+faculty.getName()+" inserted successfully as a Faculty.");
           fc++;
           
          }
       else
          {
              System.out.print("\n\n*** Sorry!!! Maximum "+maxFaculty+" faculties can be added.");
          }
        
	}
    
//	public void removeFaculty(Faculty e) 
//	{
//        //facultyArray = new Faculty[maxFaculty];
//        //fc = 0;
//        
//        int elem = e.getFid();
//        
//        for(int i = 0; i < facultyArray.length; i++){
//            if(facultyArray[i].getFid() == elem){
//                // shifting elements
//                for(int j = i; j < facultyArray.length - 1; j++){
//                    facultyArray[j] = facultyArray[j+1];
//                }
//                
//                break;
//            }
//        }
//        fc--;
//		System.out.println("\n\n*** Existing Faculties Removed ***");
//	}
	public static void removeFaculty() 
	{
        facultyArray = new Faculty[maxFaculty];
        fc = 0;
		System.out.println("\n\n*** Existing Faculties Removed ***");
	}
	public static void showAllFaculty() 
	{
		System.out.println("\n__________________________ All Faculty __________________________");
		System.out.println("\n\n\tName\t\t\tFID\t\t\tSalary");
        System.out.println("_____________________________________________________________________");
         if(fc>0)
         {
             for (int i = 0; i < fc; i++) {
                 int se = i+1;
            System.out.print("\n "+se+" "+facultyArray[i].getName());
            System.out.print("\t\t\t "+facultyArray[i].getFid());
            System.out.print("\t\t\t "+facultyArray[i].getSalary());
                 System.out.print("\n_____________________________________________________________________");
                        
            } 
         }
         else{
             System.out.println("\n*** No Faculty Found ***");
         }
	}
 

}