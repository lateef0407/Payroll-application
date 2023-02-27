/**
 * Mohammed Lateef
 * 1 December, 2022
 * A payroll class
 */

import java.util.ArrayList;

public class Payroll {

    public static double EI_RATE =0.0188;
    public static double CPP_RATE=0.0495;
    public static double TAX_RATE =0.2;
    public static double RSP_RATE =0.04;
    public static int CURRENT_YEAR =2022;
    
    private Employee emp;

    /**
     * 0-arg constructor
     */
    public Payroll() 
    {

    }
     
    /** 
     * @param emp
     */
    public Payroll(Employee emp){
        this.emp =emp;
    }
    
    /** 
     * @return Employee
     */
    public Employee getEmp() {
        return emp;
    }

    
    /** 
     * @param emp
     */
    public void setEmp(Employee emp) {
        this.emp = emp;
    }
    
    
    /** 
     * @return double
     */
    public double calculateNetPay(){
        return emp.calculatePay() - ei() - cpp() - tax() - rsp();
        
    }

    
    /** 
     * @return double
     */
    private double ei(){
        return emp.calculatePay() * EI_RATE; 
    }

    
    /** 
     * @return double
     */
    private double cpp(){
        return emp.calculatePay() * CPP_RATE;
    }

    
    /** 
     * @return double
     */
    private double tax(){
        return (emp.calculatePay() - ei() - cpp()) * TAX_RATE; 
    }

    
    /** 
     * @return double
     */
    private double rsp(){
        return (emp.calculatePay() - ei() - cpp() - tax()) * RSP_RATE;
    }

    
    /** 
     * @param date
     * @return int
     */
    private int parseYear(String date){
        return CURRENT_YEAR - Integer.parseInt(date.split(" ")[1]);
    }

    
    /** 
     * @param list
     */
    public static void printReport(ArrayList<Payroll> list){
        double totalGross = 0, totalCI = 0, totalCPP = 0, totalTax = 0, totalRSP = 0, totalNetPay = 0;
        System.out.printf("%-15s%-15s%-15s%-10s%10s%10s%10s%12s%12s", "------------", "--------", "--------", "---------", "--------", "--------", "--------", "--------", "----------");
        System.out.println();
        System.out.printf("%-15s%-15s%-15s%-10s%10s%10s%10s%12s%12s", "Level", "First", "Last", "Gross Pay", "EI", "CPP", "Tax", "RSP", "Net Pay");
        System.out.println();
        System.out.printf("%-15s%-15s%-15s%-10s%10s%10s%10s%12s%12s", "------------", "--------", "--------", "---------", "--------", "--------", "--------", "--------", "----------");
        System.out.println();

        for (Payroll payroll : list) {
            totalGross += payroll.emp.calculatePay();
            totalCI += payroll.ei();
            totalCPP += payroll.cpp();
            totalTax += payroll.tax();
            totalRSP += payroll.rsp();
            totalNetPay += payroll.calculateNetPay();
            System.out.printf("%-15s", payroll.emp.getLevel());
            System.out.printf("%-15s", payroll.emp.getFirstName());
            System.out.printf("%-15s", payroll.emp.getLastName());
            System.out.printf("%-10s", String.format("%,.2f", payroll.emp.calculatePay()));
            System.out.printf("%10s", String.format("%.2f", payroll.ei()));
            System.out.printf("%10s", String.format("%.2f", payroll.cpp()));
            System.out.printf("%10s", String.format("%.2f", payroll.tax()));
            System.out.printf("%12s", String.format("%.2f", payroll.rsp()));
            System.out.printf("%12s", String.format("%.2f", payroll.calculateNetPay()));
            System.out.println();
        }

        System.out.printf("%-15s%-15s%-15s%-10s%10s%10s%10s%12s%12s", "------------", "--------", "--------", "---------", "--------", "--------", "--------", "--------", "----------");
        System.out.println();
        System.out.printf("%-45s", "Total");
        System.out.printf("%-10s", String.format("%,.2f", totalGross));
        System.out.printf("%10s", String.format("%,.2f", totalCI));
        System.out.printf("%10s", String.format("%,.2f", totalCPP));
        System.out.printf("%10s", String.format("%,.2f", totalTax));
        System.out.printf("%12s", String.format("%,.2f", totalRSP));
        System.out.printf("%12s", String.format("%,.2f", totalNetPay));
        System.out.println();
        
    }
}
