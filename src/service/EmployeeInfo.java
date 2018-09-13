package service;

import model.Employee;

public class EmployeeInfo {
    private  Employee employee[];
    public  int bonus[];
    private String sameEmp;
    private   String oldestEmp;
    private   String enterBirthYear;
    private int empNomber;

    public EmployeeInfo (int maxEmp){
        this.employee = new Employee[maxEmp];
    }
    public void addEmp(Employee emp){             //TA ZE FIGNYA!!!
        employee[empNomber]=emp;
        empNomber++;
    }

                                                        // Comparison of the Employee objects
     public void findSameEmp() {
         for (int i = 0; i < (Employee.countEmp - 1); i++) {
             for (int j = (i + 1); j < Employee.countEmp; j++) {
                 if (employee[i].equals(employee[j])) {
                     sameEmp = employee[i].getName() + " == " + employee[j].getName();
                     System.out.println(sameEmp);
                 }
             }
         }
     }
//

                                                         // Finding the oldest employee

    public String findOldestEmp () {
        int minYear =employee[0].getBirthYear();
        for (int j = 1; j < Employee.countEmp; j++) {
            if (employee[j - 1].getBirthYear() == 0) enterBirthYear="Enter birth year for employee " + employee[j - 1].getName();
            else enterBirthYear="All birth years are entered";
            if (minYear > (employee[j].getBirthYear()) && (employee[j].getBirthYear()) != 0) {
                minYear = employee[j].getBirthYear();
               oldestEmp = employee[j].getName()+ " was born in "+ employee[j].getBirthYear();
            }

        }return oldestEmp;
    }

                                                       //Sorting employees  with respect to their salary with bonuses

    public void sortEmpSalaryDesc(){
        for (int i=0; i<(Employee.countEmp); i++){
            double maxSal = employee[i].bonusSalary(bonus[i]);
            for (int j=i+1; j<Employee.countEmp; j++) {
                if (maxSal < (employee[j].bonusSalary(bonus[j]))) {
                    Employee sort;
                    maxSal = employee[j].bonusSalary(bonus[j]);
                    sort = employee[j];
                    employee[j] = employee[i];
                    employee[i] = sort;
                }
            }
        }
    }


}
