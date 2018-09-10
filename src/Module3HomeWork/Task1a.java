package Module3HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1a {

    public static void main(String[] args) {
        System.out.println("Enter the number");                                        // Belongs to the range [-5, 5]
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            String str = br.readLine();
            Float number = Float.valueOf(str);
            System.out.println(number);
            float r1 = -5.0f, r2 = 5.0f;
            if (r1 <= number && number <= r2) System.out.println("Your number belongs to the range [-5,5]");
            else System.out.println("Your number is out of the range [-5,5]");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
