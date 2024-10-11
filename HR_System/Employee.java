package HR_System;

public class Employee {
     String firstName;
     
    String lastName;
     int registration;
     int age;
     int daysWorked;
     int vacationDaystaken;
     double salary;
     int yearsWorked;
     public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaystaken,
            double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaystaken = vacationDaystaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }
     public int timeToRetirement(int age, int yearsWorked){
        return math.min(60 - age, 40 - yearsWorked);

     }
     public int vacationtimeleft(int daysWorked, int vacationDaysTaken){
       
        return (daysWorked/360)*(30 - vacationDaysTaken);
     }
     public double calculateBonus(int salary){
        double bonus = 2.2 * salary;
        return bonus;
     }
}
