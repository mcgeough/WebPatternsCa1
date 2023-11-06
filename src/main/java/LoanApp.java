
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LoanApp {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("This is the Library Loan book system");
        System.out.println("1: Borrow a book");
        System.out.println("2: Return a book");
        System.out.println("3 : Exit");
        System.out.println("Choose an option");

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            borrowBook();
        } else if (option == 2) {
            returnBook();

        } else if (option == 3) {
            System.out.println("Thank you, come again");

        } else {
            System.out.println("invalid option,please try again");

        }

    }

}
