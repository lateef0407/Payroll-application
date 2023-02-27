/**
 * Mohammed Lateef
 * 1 December, 2022
 * A subclass of Employee
 */
public class Supervisor extends Employee {
    private double salary;
    private int productionRate;

    /**
     * 0-arg constructor
     */
    public Supervisor(){
        super();
        this.salary=0.0;
        this.productionRate=1;
    }

    /**
     * 7-arg constructor
     * @param level String
     * @param firstName String
     * @param lastName String
     * @param hireDate String
     * @param birthdate String
     * @param salary double
     * @param productionRate int
     */
    public Supervisor(String level, String firstName, String lastName, String hireDate, String birthdate, double salary, int productionRate) {
       super(level,firstName,lastName, hireDate, birthdate);
        this.salary = salary;
        this.productionRate = productionRate;
    }
    
    /** 
     * @return double
     */
    public double getSalary() {
        return salary;
    }

    
    /** 
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    /** 
     * @return int
     */
    public int getProductionRate() {
        return productionRate;
    }

    
    /** 
     * @param productionRate
     */
    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }
    
    /** 
     * @return double
     */
    private double calculateBonus(){
        // return productionRate;
        if (productionRate > 100 && productionRate < 120)
            return 15;
        else if (productionRate > 75 && productionRate < 100)
            return 5;
        else
            return 0;
    }
    
    /** 
     * @return double
     */
    public double calculatePay() {
        
        return salary / 50 + (calculateBonus() == 0 ? 0 : (calculateBonus() * salary / 50) / 100);
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
        output += String.format("%-20s%s\n", "Employer Number:", employeeNumber);
        output += String.format("%-20s%s\n", "Salary:", salary);
        output += String.format("%-20s%s\n", "Production Rate:", productionRate);
        output += String.format("%-20s%s\n", "Gross Pay:", calculatePay());
        return output;
    }  
}
