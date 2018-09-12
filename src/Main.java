import People.Employee;
import People.Position;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int b1=5, b2=10, b3=0, b4=0, b5=15; // the value of bonuses %

// Test default constructor:
//        Employee emp1 = new Employee();
//        emp1.setName("Ойры-ойры Р.");
//        emp1.setRate(1.5);
//        emp1.setHours(10);
//        emp1.addHours();
//
//        Employee emp2 = new Employee();
//        emp2.setName("Почкин В.");
//        emp2.setRate(1.3);
//        emp2.setHours(9);
//        emp2.addHours();
//
//        Employee emp3 = new Employee();
//        emp3.setName("Привалов А.");
//        emp3.setRate(1.2);
//        emp3.setHours(8);
//        emp3.addHours();                        // void  method of class Employee for summing created employees hours

// Test two variables constructor:
//        Employee emp1 = new Employee("Ойры-ойры Р.", 1.5);
//        emp1.setHours(10);
//Test five variables constructor:
          Employee emp1 = new Employee("Ойра-ойра Р.", 1930, Position.Senior_staff_scientist, 9, 1.4);
          Employee emp2 = new Employee("Почкин В.", 1940, Position.Research_assistant,  8, 1.0);
          Employee emp3 = new Employee("Привалов А.", 1938, Position.Programmer, 10, 1.3);
          Employee emp4 = new Employee("Киврин Ф.", 0, Position.Head_of_department, 8, 1.8);
          Employee emp5 = new Employee("Камноедов М.", 1915, Position.Household_manager, 8, 1.0);
        Employee emp6 = new Employee("Ойра-ойра Р.", 1930, Position.Head_of_department, 4, 1.4);
        Employee emp7 = new Employee("Привалов А.", 1938, Position.Research_assistant, 4, 1.3);

          //Changes an hour rate:
        emp2.changeRate(1.1);
        emp1.changeRate(1.5);

                                                            // Creates array of Employee objects
       Employee arrEmp [] = new Employee[Employee.getCountEmp()];
       arrEmp [0] = emp1; arrEmp [1] = emp2; arrEmp [2] = emp3; arrEmp [3] = emp4; arrEmp [4] = emp5;
        arrEmp [5] = emp6; arrEmp [6] = emp7;

                                                        // Creates arrays with corresponding employees' parameters
        String empName [] = {emp1.getName(), emp2.getName(), emp3.getName(), emp4.getName(),
                emp5.getName(), emp6.getName(), emp7.getName() };
        int empBirthYear [] = {emp1.getBirthYear(), emp2.getBirthYear(), emp3.getBirthYear(),
                emp4.getBirthYear(), emp5.getBirthYear()};
        int empHour [] = {emp1.getHours(), emp2.getHours(), emp3.getHours(), emp4.getHours(), emp5.getHours()};
        double empRate [] = {emp1.getRate(), emp2.getRate(), emp3.getRate(), emp4.getRate(), emp5.getRate()};
        double empSalary [] = {emp1.bonusSalary(b1), emp2.bonusSalary(b2), emp3.bonusSalary(b3),
                emp4.bonusSalary(b4), emp5.bonusSalary(b5), emp6.bonusSalary(b1), emp7.bonusSalary(b3)};

        System.out.println(emp1.toString() + " Gets "+ empSalary [0] + " a day.");
        System.out.println();
        System.out.println(emp2.toString() + " Gets "+ empSalary [1] + " a day.");
        System.out.println();
        System.out.println(emp3.toString() + " Gets "+ empSalary [2] + " a day.");
        System.out.println();
        System.out.println(emp4.toString() + " Gets "+ empSalary [3] + " a day.");
        System.out.println();
        System.out.println(emp5.toString() + " Gets "+ empSalary [4] + " a day.");
        System.out.println();
        System.out.println("Total hours in the Department: " + Employee.getTotalHours()+" employee-hours a day.");


        int counter=0;                                          // Comparison of the Employee objects
        for (int i=0; i<(arrEmp.length-1); i++){
            for (int j=(i+1); j<arrEmp.length; j++) {
                if (arrEmp[i].equals(arrEmp[j])) {
                    System.out.print("Object "+ i + " == " + j+";   ");
                    counter++;
                }
            }
        }System.out.println("More than one time entered in the database "+counter +" employee(s)!" );


                                                         // Finding the oldest employee
        int minYear = empBirthYear[0], mY=0;
        for (int j=1; j<empBirthYear.length; j++) {
                if (minYear > (empBirthYear[j])&& (empBirthYear[j])!=0) {
                    minYear = empBirthYear[j];
                    mY=j;
                }
                if (empBirthYear[j-1] == 0) System.out.println("Enter birth year for employee "+empName[j-1]);
            }
        System.out.println(empName[mY]+" is the oldest employee.");

                                                        // Sorting employees according to their bonusSalary (descent)

        for (int i=0; i<(empSalary.length-1); i++){
            double maxSal = empSalary[i];
            for (int j=i+1; j<empSalary.length; j++) {
                if (maxSal < (empSalary[j])) {
                    String nameSort;
                    maxSal = empSalary[j];
                    empSalary[j] = empSalary[i];
                    empSalary[i] = maxSal;
                    nameSort = empName[j];
                    empName[j] = empName[i];
                    empName[i] = nameSort;
                }
            }
        }
        System.out.println(Arrays.toString(empSalary));
        System.out.println(Arrays.toString(empName));

                                                    // Sorting employees according to their bonusSalary (increase)

        for (int i=0; i<(empSalary.length-1); i++){
            double minSal = empSalary[i];
            for (int j=i+1; j<empSalary.length; j++) {
                if (minSal > (empSalary[j])) {
                    String nameSort;
                    minSal = empSalary[j];
                    empSalary[j] = empSalary[i];
                    empSalary[i] = minSal;
                    nameSort = empName[j];
                    empName[j] = empName[i];
                    empName[i] = nameSort;
                }
            }
        }
        System.out.println(Arrays.toString(empSalary));
        System.out.println(Arrays.toString(empName));




    }
}

