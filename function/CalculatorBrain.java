import java.util.Scanner;

public class CalculatorBrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 =scanner.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();
        addition(num1, num2);
    }
    public static void addition(int num1,int num2)
    {
        int sum = num1 + num2;
        System.out.println("Addition of two Numbers are "+sum);
    }
    public static void substraction(int num1,int num2)
    {
        int sum = num1 - num2;
        System.out.println("Substraction of two Numbers are "+sum);
    }
    public static void multiplication(int num1,int num2)
    {
        int sum = num1 * num2;
        System.out.println("Multiplication of two Numbers are "+sum);
    }
    public static void Division(int num1,int num2)
    {
        int sum = num1 / num2;
        System.out.println("Division of two Numbers are "+sum);
    }
}
