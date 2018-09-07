import People.Employee;

public class Main {
    public static void main(String[] args) {
        int b1=1, b2=0, b3=0; // the value of bonuses

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
//Test three variables constructor:
          Employee emp1 = new Employee("Ойры-ойры Р.", 1.5, 10);
          Employee emp2 = new Employee("Почкин В.", 1.3, 9);
          Employee emp3 = new Employee("Привалов А.", 1.2, 8);   // summing employees hours in Constructor

//Change an hour rate:
        emp2.changeRate(1.1);
        emp1.changeRate(1.4);


// Calc a day Salary:
        double salary1 = emp1.Salary()+emp1.bonuses(b1);
        double salary2 = emp2.Salary()+emp2.bonuses(b2);
        double salary3 = emp3.Salary()+emp3.bonuses(b3);


        System.out.println(emp1.toString());
        System.out.println(emp1.getName() + " gets "+ salary1 + " a day.");
        System.out.println();
        System.out.println(emp2.toString());
        System.out.println(emp2.getName() + " gets "+ salary2 + " a day.");
        System.out.println();
        System.out.println(emp3.toString());
        System.out.println(emp3.getName() + " gets "+ salary3 + " a day.");
        System.out.println();
        System.out.println("Department has " + Employee.getTotalHours()+" employee-hours a day.");


    }
}

