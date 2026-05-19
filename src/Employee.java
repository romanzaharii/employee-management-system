import java.io.Serializable;

public class Employee implements Serializable {
    private String surname;
    private String position;
    private int numberHoursWorked;
    private int hourlyWage;
    public Employee(String surname, String position, int numberHoursWorked, int hourlyWage) {
        this.surname = surname;
        this.position = position;
        this.numberHoursWorked = numberHoursWorked;
        this.hourlyWage = hourlyWage;
    }
    public String getSurname() {
        return surname;
    }
    public String getPosition() {
        return position;
    }
    public int getNumberHoursWorked() {
        return numberHoursWorked;
    }
    public int getHourlyWage() {
        return hourlyWage;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setNumberHoursWorked(int numberHoursWorked) {
        this.numberHoursWorked = numberHoursWorked;
    }
    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public int calculateMonthlySalary() {
        return hourlyWage * numberHoursWorked;
    }
    public int calculatePremium() {
        int premium = 0;
        if (numberHoursWorked >= 180)
            premium = (int) (calculateMonthlySalary() * 0.15);
        else if (numberHoursWorked >= 120) {
            premium = (int) (calculateMonthlySalary() * 0.1);
        }
        return premium;
    }
    public int calculateTux() {
        return (int) (calculateMonthlySalary() * 0.18);
    }

    public int calculateNetSalary() {
        return calculateMonthlySalary() + calculatePremium() - calculateTux();
    }
}
