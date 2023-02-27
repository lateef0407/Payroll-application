/**
 * Mohammed Lateef
 * 1 December, 2022
 * A subclass of Employee
 */

public class Worker extends Employee{
    public int shift;
    public double rate;
    public double hours;

    /**
    * 0-arg constructor
    */
   public Worker(){
        super();
        this.shift = 1;
        this.rate = 0.0;
        this.hours = 0.0;
    }

    /**
     * @param level String
     * @param firstName String
     * @param lastName String
     * @param hireDate String
     * @param birthdate String
     * @param shift int
     * @param rate double
     * @param hours double
     */
    public Worker(String level, String firstName, String lastName, String hireDate, String birthdate, int shift, double rate, double hours) {
        super(level, firstName, lastName, hireDate, birthdate);
        this.shift = shift;
        this.rate = rate;
        this.hours = hours;
    }

    
    /** 
     * @return int
     */
    public int getShift() {
        return shift;
    }

    
    /** 
     * @param shift
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    
    /** 
     * @return double
     */
    public double getRate() {
        return rate;
    }

    
    /** 
     * @param rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    
    /** 
     * @return double
     */
    public double getHours() {
        return hours;
    }

    
    /** 
     * @param hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    
    /** 
     * @return double
     */
    public double calculatePay() {
        return (rate * hours) + (shift == 1 ? 0 : (rate * hours * 3) / 100);
    }
    
    /** 
     * @return String
     */
    public String toString() {
        String output = String.format("%-20s%s\n", "Employee Level:", level);
        output += String.format("%-20s%s\n", "First Name:", firstName);
        output += String.format("%-20s%s\n", "Last Name:", lastName);
        output += String.format("%-20s%s\n", "Hire Date:", hireDate);
        output += String.format("%-20s%s\n", "Birth Date:", birthdate);
        output = String.format("%-20s%s\n", "Shift:", shift);
        output += String.format("%-20s%s\n", "Hourly Pay Rate:", rate);
        output += String.format("%-20s%s\n", "Hours Worked:", hours);
        return output;
    }
}
