import model.Employee;
import model.Position;
import service.EmployeeInfo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int bonus[] = {5,10,0,0,15,0,0}; // the value of bonuses %

          Employee emp1 = new Employee("Ойра-ойра Р.", 1930, Position.SENIORSCI, 9, 1.4);
          Employee emp2 = new Employee("Почкин В.", 1940, Position.RESEARCHASSIST,  8, 1.0);
          Employee emp3 = new Employee("Привалов А.", 1938, Position.PROGRAMMER, 10, 1.3);
          Employee emp4 = new Employee("Киврин Ф.", 1915, Position.DEPARTMENTHEAD, 8, 1.8);
          Employee emp5 = new Employee("Камноедов М.", 1915, Position.HOUSHOLDMANAG, 8, 1.0);
        Employee emp6 = new Employee("Ойра-ойра Р.", 1930, Position.DEPARTMENTHEAD, 4, 1.4);
        Employee emp7 = new Employee("Привалов А.", 1938, Position.RESEARCHASSIST, 4, 1.3);

          //Changes an hour rate:
        emp2.changeRate(1.1);
        emp1.changeRate(1.5);

                                                            // Creates the array of EmployeeInfo objects
       EmployeeInfo emp[] = new EmployeeInfo[7];
               emp[0].addEmp(emp1); emp[1].addEmp(emp2); emp[2].addEmp(emp3); emp[3].addEmp(emp4);
               emp[4].addEmp(emp5); emp[5].addEmp(emp6); emp[6].addEmp(emp7);

        Employee employee [] = {emp1, emp2, emp3, emp4, emp5, emp6, emp7};

        for (int i=0; i<employee.length; i++){
            System.out.println(employee [i] + " Gets "+ employee[i].bonusSalary(bonus[i]) + " a day.");
        }

        System.out.println("Total hours in the Department: " + Employee.getTotalHours()+" employee-hours a day.");
        System.out.println();


        System.out.println(emp.findSameEmp());
        System.out.println();


//        System.out.println(EmployeeInfo.findOldestEmp());
//        System.out.println(EmployeeInfo.enterBirthYear);
//          System.out.println();

      //  EmployeeInfo.sortEmpSalaryDesc();














    }
}

