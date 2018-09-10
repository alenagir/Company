package Module3HomeWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1b {
    public static void main(String[] args) {
                                                                                            // Finding MIN MAX
        try  (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        {
//            System.out.println("Enter the array length");
//            int leng = Integer.parseInt(br.readLine());
            int leng =3;
            int [] a = new int [leng];

            System.out.println("Enter the array numbers");
            for (int i=0; i<leng; i++){a [i] = Integer.parseInt(br.readLine());}

            {if (a[0] < a[1] && a[0] < a[2]) System.out.println(a[0] + " is MIN");
            else if (a[1] < a[0] && a[1] < a[2]) System.out.println(a[1] + " is MIN");
            else System.out.println(a[2] + " is MIN");}
            {if (a[0] > a[1] && a[0] > a[2]) System.out.println(a[0] + " is MAX");
            else if (a[1] > a[0] && a[1] > a[2]) System.out.println(a[1] + " is MAX");
            else System.out.println(a[2] + " is MAX");}


        }
        catch(IOException ex){ System.out.println(ex.getMessage());}



    }

}
