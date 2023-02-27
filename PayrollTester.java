/**
 * Mohammed Lateef
 * 1 December, 2022
 * A class to create Employee hierarchy objects and their methods
 */
import java.util.ArrayList;

public class PayrollTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Payroll Tester");
        System.out.println("-----------------------------");
         //create objects
         Employee emp1 = new Supervisor("Supervisor", "D'arcy", "French", "2001 10 31", "1976 09 08", 176000, 105);
         Employee emp2 = new Supervisor("Supervisor", "Janelle", "Birch", "2010 09 14", "1971 10 14", 96000, 70);
         Employee emp3 = new Worker("Worker", "Daniel", "Van Patter", "2015 04 30", "1999 01 20", 2, 25.50, 41);
         Employee emp4 = new Worker("Worker", "Thomas", "O'Neil", "1999 06 31", "1970 05 29", 1, 45.50, 40);
         Employee emp5 = new TeamLeader("Team Leader", "Judy", "Campbell", "2003 02 25", "1983 11 23", 1, 65.50, 41, 54);
         Employee emp6 = new TeamLeader("Team Leader", "John", "Greene", "2015 02 28", "1985 03 05", 2, 45.50, 45, 75);
 
         // Print each object
         System.out.println(emp1.toString());
         System.out.println();
         System.out.println(emp2.toString());
         System.out.println();
         System.out.println(emp3.toString());
         System.out.println();
         System.out.println(emp4.toString());
         System.out.println();
         System.out.println(emp5.toString());
         System.out.println();
         System.out.println(emp6.toString());
         System.out.println();
 
         // Create ArrayList of Payroll object
         ArrayList<Payroll> payRollList = new ArrayList<>();
         payRollList.add(new Payroll(emp1));
         payRollList.add(new Payroll(emp2));
         payRollList.add(new Payroll(emp3));
         payRollList.add(new Payroll(emp4));
         payRollList.add(new Payroll(emp5));
         payRollList.add(new Payroll(emp6));
 
         // Print the payrolllist
         System.out.println("***** Payroll Report *****");
         System.out.println("for the week ending December 2, 2022");
         Payroll.printReport(payRollList);
 
         //Bob French’s production rate 
         emp1 = new Supervisor("Supervisor", "D'arcy", "French", "2001 10 31", "1976 09 08", 176000, 115);
         //Janelle Birch’s production rate 
         emp2 = new Supervisor("Supervisor", "Janelle", "Birch", "2010 09 14", "1971 10 14", 96000, 110);
         //Daniel Johnston work
         emp3 = new Worker("Worker", "Daniel", "Van Patter", "2015 04 30", "1999 01 20", 2, 47, 44);
         //Thomas Marco work
         emp4 = new Worker("Worker", "Thomas", "O'Neil", "1999 06 31", "1970 05 29", 1, 45.50, 37);
         //Judy Campbell work
         emp5 = new TeamLeader("Team Leader", "Judy", "Campbell", "2003 02 25", "1983 11 23", 1, 65.50, 42.75, 64);
         //John Greene work
         emp6 = new TeamLeader("Team Leader", "John", "Greene", "2015 02 28", "1985 03 05", 1, 45.50, 44, 81);
 
         // Update the Payroll ArrayList
         payRollList = new ArrayList<>();
         payRollList.add(new Payroll(emp1));
         payRollList.add(new Payroll(emp2));
         payRollList.add(new Payroll(emp3));
         payRollList.add(new Payroll(emp4));
         payRollList.add(new Payroll(emp5));
         payRollList.add(new Payroll(emp6));
 
         // Print the paroll list
         System.out.println();
         System.out.println("***** Payroll Report *****");
         System.out.println("for the week ending December 9, 2022");
         Payroll.printReport(payRollList);
    }
}