import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by paulo on 2018/10/25.
 */
public class Menu {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("-----------------------------");
        System.out.println("--------- MAIN MENU ---------");
        System.out.println("-----------------------------");
        System.out.println(" ");
        System.out.println("|1| - Create a new contact");
        System.out.println("|2| - List of all contacts");
        System.out.println("|3| - Delete contact");
        System.out.println("|4| - Search contact ");
        System.out.println("|5| - Exit application");

        System.out.println(" ");
        System.out.printf("> ");

        Scanner in = new Scanner(System.in);
        int s = in.nextInt();

        if (s == 5) {
            System.out.println(" ");
            System.out.println("Turning application off...");
            System.exit(0);
        }

        do {

            Scanner Cont = new Scanner(System.in);

            if (s == 1) {
                // Create a new contact
                System.out.println(" ");
                System.out.println("--------- CONTACT CREATION ---------");
                System.out.println(" ");
                System.out.println(" ");


            }

            if (s == 2) {
                // List of all contacts
                System.out.println(" ");
                System.out.println("--------- CONTACT LIST ---------");
                System.out.println(" ");
                System.out.println(" ");

                Contact c001 = new Contact("name 1", "email@1.com","noStreet",1231231234,0120120123);
                System.out.println("01");
                System.out.println("------------------------------------");
                System.out.println("Name: " + c001.getUserName());
                System.out.println("E-mail: " + c001.getEmail());
                System.out.println("Street: " + c001.getStreet());
                System.out.println("Sin: " + c001.getSin());
                System.out.println("Cellphone: " + c001.getCelphone());
                System.out.println("-------------------------------------");
            }

            if (s == 3) {
                // Delete contact
                System.out.println(" ");
                System.out.println("--------- DELETE CONTACT ---------");
            }

            if (s == 4) {
                // Search contact
                System.out.println(" ");
                System.out.println("--------- CONTACT SEARCH ---------");

            }

            else if (s > 5) {
                System.out.println(" ");
                System.out.println("This option does not exist");
            }


            System.out.println(" ");
            System.out.println("-----------------------------");
            System.out.println("--------- MAIN MENU ---------");
            System.out.println("-----------------------------");
            System.out.println(" ");
            System.out.println("|1| - Create a new contact");
            System.out.println("|2| - List all contacts");
            System.out.println("|3| - Delete contact");
            System.out.println("|4| - Search contact ");
            System.out.println("|5| - Exit application");

            System.out.println(" ");
            System.out.printf("> ");

            s = in.nextInt();


        }

        while (s != 5);
        System.out.println(" ");
        System.out.println("Turning application off...");














    }
}
