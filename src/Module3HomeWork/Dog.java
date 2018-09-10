package Module3HomeWork;

public class Dog {
    private String name;
    private double age;
    private String breed;
    public static int countDogs=0;

    DogBreed dogBreed;

    public Dog(){};         // default constructor


    public Dog(String name, double age, DogBreed dogBreed) {
        this.name = name;
        this.age = age;
        this.dogBreed = dogBreed;
        countDogs++;
    }

    public static int totalDogs (){return countDogs;}



    public void setName(String name){this.name=name;}
    public void setAge(double age){this.age=age;}
    public void setBreed(DogBreed dogBreed){this.dogBreed = dogBreed;}

    public String getName(){return this.name;}
    public double getAge(){return this.age;}
    public DogBreed getBreed(){return this.dogBreed;}


    public boolean equals(Object obj) {     // Overrides equals method if dogs have the same name
//       if (this == obj) return true;
//       if (obj == null) return false;
//       else return false;

        if (!(getClass() == obj.getClass())) return false;
        else {
            Dog tmp = (Dog) obj;
            if (tmp.name == this.name ) return true;
            else return false;
        }


    }
}
