
package lab5q1;

 import java.util.Scanner;
public class lab5q2 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the value of sales in RM: ");
        double sales = scanner.nextDouble();

        double commissionRate;
        if (sales <= 10000) {
            commissionRate = 0.10; 
        } else if (sales <= 15000) {
            commissionRate = 0.15; 
        } else {
            commissionRate = 0.20; 
        }

     
        double salescommission = sales * commissionRate;

        System.out.printf("Commission: RM %.2f%n", salescommission);
    }
}

