
package course;


public class Course {
    
   private String[] students = new String[3];
    private int numberOfStudents;
    
    
    public int getNumberOfStudents(){
        return  numberOfStudents;
    }
    
     
    
   public String[] getStudents(){
        
        String[] yeniDizi=new String[numberOfStudents];
        
     System.arraycopy(students,0, yeniDizi, 0, numberOfStudents);
        
       return yeniDizi; 
    }
    
    public void addStudent(String student) {
    if (numberOfStudents >= students.length) {
        String[] yeniDizi = new String[students.length * 2];
        System.arraycopy(students, 0, yeniDizi, 0, students.length);
        students = yeniDizi; 
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
}
    
    public String[] dropStudent(String student){
        for(int i=0; i<numberOfStudents;i++){
            if(students[i].equals(student)){
               for (int j = i; j < numberOfStudents - 1; j++) {
                students[j] = students[j + 1];
            }
               students[numberOfStudents - 1] = null;
               numberOfStudents--;
            }
            
           
        
            }
        return students ;
             
    }
    
    public void clear(){
         numberOfStudents = 0;
    }

   
    
    
}
         
                
            
        
    

   
    
    

