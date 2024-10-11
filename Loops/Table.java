package MultiplicationTable;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number till which you want to print tables: ");
 int till = sc.nextInt();  

 int multiplier = 1;  

 while (multiplier <= till) {
     System.out.println("Multiplication Table for " + multiplier + ":");
     
     int multiplication = 1;  
     
     while (multiplication <= 10) {
         int product = multiplier * multiplication; 
         System.out.println();  
 
         System.out.println(multiplier + " * " + multiplication + " = " + product);
         multiplication++;
     }

     System.out.println();  
     multiplier++;  
 }
 }

}