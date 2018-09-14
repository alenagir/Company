import model.Employee;
import model.Position;
import service.EmployeeInfo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         int bonus[] = {0,0,0,0,0,0,0}; // the value of bonuses % // ПРОВЕРИТЬ ВНОСЯТ ОШИБКУ

          Employee emp1 = new Employee("Ойра-ойра Р.", 1930, Position.SENIORSCI, 9, 1.4);
          Employee emp2 = new Employee("Почкин В.", 1940, Position.RESEARCHASSIST,  8, 1.0);
          Employee emp3 = new Employee("Привалов А.", 1938, Position.PROGRAMMER, 10, 1.3);
          Employee emp4 = new Employee("Киврин Ф.", 1915, Position.DEPARTMENTHEAD, 8, 1.8);
          Employee emp5 = new Employee("Камноедов М.", 1915, Position.HOUSHOLDMANAG, 8, 1.0);
        Employee emp6 = new Employee("Ойра-ойра Р.", 1930, Position.SENIORSCI, 4, 1.4);
        Employee emp7 = new Employee("Привалов А.", 1938, Position.RESEARCHASSIST, 4, 1.3);


                                                            // Creates the array of EmployeeInfo objects

        Employee employee [] = {emp1, emp2, emp3, emp4, emp5, emp6, emp7};

        EmployeeInfo empInfo = new EmployeeInfo();
        empInfo.addEmp(emp1); empInfo.addEmp(emp2); empInfo.addEmp(emp3); empInfo.addEmp(emp4);
        empInfo.addEmp(emp5); empInfo.addEmp(emp6); empInfo.addEmp(emp7);

                                                            //Prints out the array of employee
        for (int i=0; i<employee.length; i++){
            System.out.println(employee [i] + " Gets "+ employee[i].bonusSalary(bonus[i]) + " a day.");
        }
        System.out.println("Total hours in the Department: " + Employee.getTotalHours()+" employee-hours a day.");
        System.out.println();


                                                        // Comparison of the Employee objects
        System.out.println(empInfo.findSameEmp());
        System.out.println();

                                                        // Finding the oldest employee
        empInfo.findOldestEmp();
        System.out.println();
                                                    //Sorting employees  with respect to their salary with bonuses

      empInfo.sortEmpSalaryDesc();
      empInfo.print();




















    }
}

