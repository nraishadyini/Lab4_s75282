
package lab4;

  import java.util.Scanner;
public class lab4q6 {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
 
            System.out.print("Enter value for x1: ");
            double x1 = input.nextDouble();

            System.out.print("Enter value for x2: ");
            double x2 = input.nextDouble();

            System.out.print("Enter value for x3: ");
            double x3 = input.nextDouble();
 
            double mean = (x1 + x2 + x3) / 3;
             
            double variance = ((Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) + Math.pow(x3 - mean, 2)) / 3);
            double standardDeviation = Math.sqrt(variance);
            System.out.println("Mean: " + mean);
            System.out.println("Variance: " + variance);
            System.out.println("Standard Deviation: " + standardDeviation); 
             input.close();
        }
}
