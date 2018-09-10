package Module3HomeWork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1c {
    public static void main(String[] args) {

                                                                                           // HTTP Errors declaration
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Enter the HTTP Error Code:");
            int er = Integer.parseInt(br.readLine());
            String str;
           if (er == 400) System.out.println(HTTPErrors.Bad_Request);
           else if (er == 401)  System.out.println(HTTPErrors.Unauthorized);
           else if (er == 402) System.out.println(HTTPErrors.Payment_Required);
           else if (er == 403) System.out.println(HTTPErrors.Forbidden);
           else if (er == 404) System.out.println(HTTPErrors.Not_Found);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
