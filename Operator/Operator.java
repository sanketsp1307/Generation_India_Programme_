package Loops.Operator;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Grade");
        int grade =sc.nextInt();
        if(grade<=3){
            System.out.println("you failded in the subject");
        }
        else if(grade > 3 && grade <= 5)
        {
            System.out.println("Insufficient");
        }
        else if(grade > 5 && grade <= 9)
        {
            System.out.println("Good");
        }
        else if(grade == 10){
            System.out.println("Excellent");
        }
        else {
            System.out.println("Invalid grade");
        }
    }
}
