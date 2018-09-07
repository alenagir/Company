package People;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    public int countEmp=0;
    private static int totalHours;

    public Employee (){                             // default constructor
        countEmp++ ;
    };
    public Employee (String n, double r){          // two variables constructor
        name = n;
        rate = r;
        countEmp++;

    };
    public Employee (String n, double r, int h){   // three variables constructor
        name = n;
        rate = r;
        hours = h;
        countEmp++;
        totalHours += hours;                      // Total employees-hours a day calculation
    };

    public void addHours (){           // summing hours of employees created by  default constructor
        totalHours += hours;
            }


    public static int getTotalHours (){               // Total employees-hours a day return
        return totalHours;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setRate(double r){
        rate = r;
    }
    public double getRate (){
        return rate;
    }
    public void setHours(int h){
        hours = h;
    }
    public int getHours (){
        return hours;
    }
    public double Salary () {                         // salary a day calculation (without bonuses)
        double sl = rate * hours;
        return sl;
    }
    public void changeRate (double newRate){    // Изменение почасовой ставки
        rate = newRate;
    }
    public double bonuses (int bonus){          // payrise because of bonuses [int bonus]=[%]
        double bon = bonus * Salary()/100;
        return bon;
    }
    public String toString() {
        return name + ":" + " works " + hours + " hours a day," + " gets " + rate + " per/hour.";
    }



}
