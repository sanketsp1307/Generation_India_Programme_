package MultiplicationTable;
import java.util.*;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int temp, count = 1;

        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();  

        System.out.print(num1 + " "); 

        do {
            System.out.print(num2 + " ");  // Print the current Fibonacci number
            
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            
            count++; 
        } while (count < n); 

        sc.close();  
    }
}
