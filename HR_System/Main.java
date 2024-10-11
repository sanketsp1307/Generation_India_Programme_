package HR_System;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sanket", "Pargharmor", 56, 023, 29, 5, 50.230, 5);
        e1.calculateBonus(50000);
        System.out.println("Salary is "+e1.calculateBonus(000));
        SalesRep s1 = new SalesRep("Vishal", "Patil", 0, 0, 0, 0, 0, 0);
        s1.calculateBonus(50000);
       SalesRep sale1 = new SalesRep("Vishal", "Patil", 562, 23, 61, 0, 0, 0);
     
        SalesManager SM=new SalesManager("Rutwiz", "D", 21, 45, 70, 05, 30000, 2, 30000,s1.getSalesMade()+s1.getSalesMade()+sale1.getSalesMade());
        SM.calculateComission();
    }
}
