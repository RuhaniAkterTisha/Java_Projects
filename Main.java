import java.util.*;
public class Main {
    public static void main(String[] args) {
        int debit, credit, balance=0;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select option 1 for debit");
            System.out.println("Select option 2 for credit");
            System.out.println("Select option 3 for balance");
            System.out.println("Select option 4 for exit");
            System.out.println("Select an option");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    System.out.println("Amount to debit:");
                    debit = sc.nextInt();
                    if (debit <= balance) {
                        balance = balance - debit;
                        System.out.println("Amount debited successfully");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                case 2:
                    System.out.println("Enter amount to be credited:");
                    credit = sc.nextInt();
                    balance = balance + credit;
                    break;
                case 3:
                    System.out.println(balance);
                    break;
                case 4:
                    System.out.println("transaction completed successfully.");
                    System.exit(0);
                    break;}
                System.out.println("Operation Completed");

        }
    }
}
