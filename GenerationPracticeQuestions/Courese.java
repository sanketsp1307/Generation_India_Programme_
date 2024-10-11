package GenerationPracticeQuestions;
import java.util.List;
import java.util.ArrayList;

public class Courese {
    String courseName; 
    String professorName;
    int year;

  private List<Student> enrolledStudents;

  public Courese(String courseName, String professorName, int year) {
      this.courseName =  courseName;
      this.professorName = professorName;
      this.year = year;
      //enrolledStudents = new ArrayList<>();
  }

  public void enroll(Student student) 
{
      enrolledStudents.add(student);
  }

 
  

 public void unEnroll(Student student){
 }

 public int countStudents(){
     return 0;
 }
 
 public int bestGrade(){
     return 0;
 }
 
  }
