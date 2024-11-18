
package lab5q1;
   import java.util.Scanner;
public class lab5q5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter wood type (oak/mahogany): ");
        String woodType = scanner.nextLine().toLowerCase();

        System.out.print("Enter number of characters on the sign: ");
        int numberOfCharacters = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter color of characters (black/white/gold): ");
        String characterColor = scanner.nextLine().toLowerCase();

      
        double price = 30.0;

        if (woodType.equals("oak")) {
            price += 15.0;
        } else if (woodType.equals("mahogany")) {
            price += 10.0;
        }

        if (numberOfCharacters > 6) {
            price += (numberOfCharacters - 6) * 3.0;
        }
        if (characterColor.equals("gold")) {
            price += 12.0;
        }

        System.out.println("Customer Name: " + customerName);
        System.out.println("Wood Type: " + woodType);
        System.out.println("Number of Characters: " + numberOfCharacters);
        System.out.println("Character Color: " + characterColor);
        System.out.printf("Total Price: RM%.2f\n",price);

        scanner.close();
    }
}

    

