package GenerationPracticeQuestions;

public class Main {
    public static void main(String [] args)
    {
        Student s1 = new Student("Sanket","Pargharmor",70);
        Student  s2= new Student("Prasad","Kharche",50);
        Student  s3= new Student("Vishal","Patil",80);
        Courese c1= new Courese("Java", "Ambika Mam", 2);
        s1.printFullName();
        s2.printFullName();
        s3.printFullName();
        s1.changeYearIfApproved();
        s2.changeYearIfApproved();
        c1.enroll(s1);


    }
    
}
