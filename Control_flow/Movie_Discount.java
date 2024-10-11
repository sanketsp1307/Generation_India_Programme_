package ghost;
import java.util.Scanner;
public class Movie_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        double normalPrice = 7.0;
        double finalPrice;
        int discount = 0;

        if (age < 5) {
            System.out.println("You are applicable for 60% Discount");
            discount = 60;
            finalPrice = Calc_Discount(normalPrice, discount);
            System.out.println("Your ticket price is: $" + finalPrice);
        } else if (age >= 6 && age <= 59) {
            System.out.println("You need to pay the full ticket price");
            System.out.println("Your ticket price is: $" + normalPrice);
        } else if (age > 60) {
            System.out.println("You are applicable for 55% Discount");
            discount = 55;
            finalPrice = Calc_Discount(normalPrice, discount);
            System.out.println("Your ticket price is: $" + finalPrice);
        }

        sc.close();
    }

    // Correct discount calculation method
    public static double Calc_Discount(double price, int discountPercentage)
     {
        return price - (price * discountPercentage / 100);
    }


    }


