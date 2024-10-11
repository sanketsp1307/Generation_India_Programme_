package GenerationPracticeQuestions;

public class Student {
    String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       public Student(String firstName, String lastName, int grade)
       {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
       }

       public Student(String lastName, int registration)
       {
        
        this.lastName = lastName;
        this.registration = registration;
        //this.firstName = "Unknown";
       }
       public Student(String lastName, int year )
       {
        
        this.lastName = lastName;
        this.year = year;
       }
      
       public void printFullName()
       {
         System.err.println(firstName +" "+lastName +" "+ grade);
       }
       public boolean isApproved()
       {
              System.out.println("Your admission is approved");
              return grade >60; 
              
       }
       public int changeYearIfApproved()
       {
        if(grade >= 60)
        {
         System.out.println("Result Passed");
        }
        else{
              System.out.println("Result Failed");
        }
        return year;
       }
}
