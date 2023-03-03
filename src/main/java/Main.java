import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Please type in your first name: ");
            String name = scanner.nextLine().toLowerCase();
            if (name.equals("alice") || name.equals("bob")) {
                System.out.println("Hello " + name.substring(0, 1) + name.substring(1) + ", have a wonderful day!");
            } else {
                System.out.println("Get out of here!");
            }
        }
    }}