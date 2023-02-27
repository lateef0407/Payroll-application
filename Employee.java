/**
 * Mohammed Lateef
 * 1 December, 2022
 * A superclass from which subclasses are derived
 */
public abstract class Employee extends Object {
    //define all fields
    public String level;
    public String firstName;
    public String lastName;
    public String hireDate;
    public String birthdate;
    public String employeeNumber;


    /**
     * 0-arg constructor
     */
    public Employee()
    {
        this.level="";
        this.firstName="";
        this.lastName="";
        this.hireDate="";
        this.birthdate="";
        this.employeeNumber="";

    }
    
    /**
     * 5-Arg constructor
     * @param level String
     * @param firstName String
     * @param lastName String
     * @param hireDate String
     * @param birthdate String
     */
    public Employee(String level, String firstName, String lastName, String hireDate, String birthdate) {
        this.level = level;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.birthdate = birthdate;
    }

    /**
     * @return String
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param setlevel void
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    
    /** 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    /** 
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    
    /** 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    /** 
     * @return String
     */
    public String getHireDate() {
        return hireDate;
    }

    
    /** 
     * @param hireDate
     */
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    
    /** 
     * @return String
     */
    public String getBirthdate() {
        return birthdate;
    }

    
    /** 
     * @param birthdate
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    
    /** 
     * @return String
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * setemployeenumber void 
     */
    private void setEmployeeNumber(){
        employeeNumber=generateLevelCode();
        employeeNumber+="-";
        employeeNumber += this. lastName. substring(0,  2); 
        employeeNumber += this.firstName. substring ( 0,  2) ;
        employeeNumber+="-";
    
        for (int i = 0; i<5;i++){ 
            employeeNumber += (int) (Math.random() * 9);
        }
    }

    
    /** 
     * @return String
     */
    private String generateLevelCode(){
        if (this.level == "Worker" ){
            return "WKR";
        } else if(this.level =="Team Leader"){
            return "LDR";
         } else{
            return "SPR";
        }
    }

    /**
     * @return double
     */
    public abstract double calculatePay();

    
    /** 
     * @return String
     */
    public String toString() {
        String output = String.format("%-20s%s\n", "EmployeeLevel:", level);
        output += String.format("%-20s%s\n", "First Name:", firstName);
        output += String.format("%-20s%s\n", "Last Name:", lastName);
        output += String.format("%-20s%s\n", "Hire Date:", hireDate);
        output += String.format("%-20s%s\n", "Birth Date:", birthdate);
        output += String.format("%-20s%s\n", "Employee Number:", employeeNumber);
        return output;
    }  
}
