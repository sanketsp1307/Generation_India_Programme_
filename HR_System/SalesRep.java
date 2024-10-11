package HR_System;

public class SalesRep extends Employee {
    private double salesMade;
    public double getSalesMade() {
        return salesMade;
    }
    
    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }
     public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaystaken,
            double salary, int yearsWorked) {
                super(firstName, lastName, registration, age, daysWorked, vacationDaystaken, salary, yearsWorked);

    }
}
