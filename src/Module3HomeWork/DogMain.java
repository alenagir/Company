package Module3HomeWork;

import jdk.nashorn.internal.objects.annotations.Setter;

public class DogMain {
    public static void main(String[] args) {

        Dog dog1 = new Dog ("Setti", 2, DogBreed.Setter);
        Dog dog2 = new Dog ("Terri", 5, DogBreed.Terrier);
        Dog dog3 = new Dog ("Setti", 1.5, DogBreed.Shepherd);

//
                                                            // Comparing dogs' names
        if (dog1.equals(dog2)) System.out.println("Dog 1 and Dog 2 have the same name " + dog1.getName());
        else if (dog1.equals(dog3)) System.out.println("Dog 1 and Dog 3 have the same name " + dog1.getName());
        else if (dog2.equals(dog3)) System.out.println("Dog 2 and Dog 3 have the same name " + dog2.getName());

                                                            // Finding the oldest dog

        {if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge())
            System.out.println(dog1.getBreed() + " " + dog1.getName() + " is the oldest dog");
        else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge())
            System.out.println(dog2.getBreed() + " " + dog2.getName() + " is the oldest dog");
        else System.out.println(dog3.getBreed() + " " + dog3.getName() + " is the oldest dog");}


    }
}
