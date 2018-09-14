package model;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private int birthYear;
    public static int countEmp=0;
    private static int totalHours;
    Position position;


    public Employee (){                             // default constructor
        countEmp++ ;
    };
    public Employee (String name, int birthYear){          // two variables constructor
        this.name = name;
        this.birthYear = birthYear;
        countEmp++;

    };
    public Employee (String name, int birthYear, Position position, int hours, double rate){   // five variables constructor with Enum
        this.name = name;
        this.birthYear = birthYear;
        this.position = position;
        this.rate = rate;
        this.hours = hours;
        countEmp++;
        totalHours += hours;                      // Total employees-hours a day calculation
    };

    public void addHours (){ totalHours += hours; }    // summing hours of employees created by  default constructor


    public static int getTotalHours (){               // Total employees-hours a day return
        return totalHours;
    }

    public static int getCountEmp (){               // Total employees return
        return countEmp;
    }

    public void setName(String name){this.name = name; }
    public void setBirthYear (int birthYear) {this.birthYear=birthYear;}
    public void setPosition (Position position){this.position = position;}
    public void setRate(double rate){this.rate = rate; }
    public void setHours(int hours){ this.hours = hours;}


    public String getName(){return name;}
    public int getBirthYear () {return birthYear;}
    public Position getPosition (){return position;}
    public double getRate (){return rate;}
    public int getHours (){return hours;}

    public void changeRate (double newRate){    // hourly rate change
        rate = newRate;
    }

    public double Salary () {                         // salary a day calculation (without bonuses)
        double sl = this.rate * this.hours;
        return sl;
    }

    public double bonusSalary (int bonus){          // payrise because of bonuses [int bonus]=[%]
        double bon = bonus * this.Salary()/100 + this.Salary();
        return bon;
    }

    public String toString() {
        return position+" " + name + " works " + hours + " hours a day," + " gets " + rate + " per hour.";
    }

    public boolean equals(Object obj) {     // Overrides equals method if employees have the same parameters
        if (this == obj) return true;
        if (obj == null) return false;

        if (!(getClass() == obj.getClass())) return false;
        else {
            Employee tmp = (Employee) obj;
            if (tmp.name == this.name && tmp.birthYear == this.birthYear) return true;
            else return false;
        }
    }


}
