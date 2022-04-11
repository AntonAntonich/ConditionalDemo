import java.util.Scanner;

public class ShopManDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = scanner.nextInt();


        if ((hour > 8) && (hour < 18)) {

            System.out.println("Go to work");

        } else if (hour > 18 && hour <= 24) {
            System.out.println("You can go home or visit some supermarket");

            if (hour < 23) {
                System.out.println("Buy some food");

            } else {
                System.out.println("All shops are closed");
            }

        } else {
            System.out.println("Error !");
        }
    }
}
