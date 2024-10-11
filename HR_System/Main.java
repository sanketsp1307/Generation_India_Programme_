package HR_System;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sanket", "Pargharmor", 56, 023, 29, 5, 50.230, 5);
        e1.calculateBonus(50000);
        System.out.println("Salary is "+e1.calculateBonus(000));

    }
}
