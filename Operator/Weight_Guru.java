package Operator;
import java.util.Scanner;
public class Weight_Guru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in meters");
        double height = sc.nextDouble();
        double bmi= bmi(height, weight);
        
        if (bmi < 18.5) {
            System.out.println("You are underweight. It might be better to gain some weight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Your weight is normal. Keep up the good work!");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight. It could be better to lose some weight.");
        } else if (bmi >= 30) {
            System.out.println("You are in the obese category. Consider taking steps to reduce your weight for better health.");
        } else {
            System.out.println("Invalid BMI value.");
        }
    }
    public static double bmi(double height, double weight){
        double bmi= (height * height) /weight;
        return bmi;
    }
    
}
