/**
 * Mohammed Lateef
 * 1 December, 2022
 * A subclass of Worker
 */

public class TeamLeader extends Worker{

    private static int REQUIRED_TRAINING = 150;
    private static double MONTHLY_BONUS = 100;
    private int completedTraining;

    /**
     * 0-arg constructor
     */
    public TeamLeader() {
        super();
        this.completedTraining = 0;
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
     * @param completedTraining int
     */
    public TeamLeader(String level, String firstName, String lastName, String hireDate, String birthdate, int shift,double rate, double hours, int completedTraining){
        super(level, firstName, lastName, hireDate, birthdate, shift, rate, hours);
        this.completedTraining = completedTraining;
    }

    
    /** 
     * @return int
     */
    public static int getREQUIRED_TRAINING() {
        return REQUIRED_TRAINING;
    }

    
    /** 
     * @return double
     */
    public static double getMONTHLY_BONUS() {
        return MONTHLY_BONUS;
    }

    
    /** 
     * @return int
     */
    public int getCompletedTraining() {
        return completedTraining;
    }

    
    /** 
     * @param completedTraining
     */
    public void setCompletedTraining(int completedTraining) {
        this.completedTraining = completedTraining;
    }

    
    /** 
     * @return double
     */
    public double calculatePay() {
        
        return (rate * hours) + (shift == 1 ? 0 : (rate * hours * 3) / 100) + 25;
    }

    
    /** 
     * @return int
     */
    public int calculateTrainingLeft(){
        return REQUIRED_TRAINING - completedTraining;

    }

    /** 
     * @return String
     */
    @Override
    public String toString() {
        String output = String.format("%-20s%s\n", "Level:", level);
        output += String.format("%-20s%s\n", "First Name:", firstName);
        output += String.format("%-20s%s\n", "Last Name:", lastName);
        output += String.format("%-20s%s\n", "Hire Date:", hireDate);
        output += String.format("%-20s%s\n", "Birth Date:", birthdate);
        output += String.format("%-20s%s\n", "Employer Number:", employeeNumber);
        output += String.format("%-20s%s\n", "Shift:", (shift == 1 ? "day (no premium)" : "night (shift premium)"));
        output += String.format("%-20s%s\n", "Monthly Bonus:", MONTHLY_BONUS);
        output += String.format("%-20s%s\n", "Completed Training:", completedTraining);
        output += String.format("%-20s%s\n", "Gross Pay:", calculatePay());
        output += String.format("%-20s%s\n", "Training Left:", calculateTrainingLeft());
        return output;
    }
    
}
