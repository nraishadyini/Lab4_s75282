
package lab5q1;
 import java.util.Scanner;

public class lab5q3 {

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter your account type (S for Savings, C for Checking): ");
        char accountType = scanner.next().charAt(0);

        System.out.print("Enter minimum balance (RM): ");
        double minBalance = scanner.nextDouble();

        System.out.print("Enter current balance (RM): ");
        double currentBalance = scanner.nextDouble();

     
        double newBalance = currentBalance;
        if (accountType == 'S' ) {
            if (currentBalance < minBalance) {
                newBalance -= 10.00; 
                newBalance += currentBalance * 0.04; 
            }
        } else if (accountType == 'C' ) {
            if (currentBalance < minBalance) {
                newBalance -= 25.00; 
            } else if (currentBalance <= minBalance + 5000) {
                newBalance += currentBalance * 0.03;
            } else {
                newBalance += currentBalance * 0.05;
            }
        }

       
        System.out.printf("Account Number: %d%n", accountNumber);
        System.out.printf("Account Type: %s%n", (accountType == 'S' ) ? "Savings" : "Checking");
        System.out.printf("Current Balance: RM %.2f%n", currentBalance);
        System.out.printf("New Balance: RM %.2f%n", newBalance);
    }
}


