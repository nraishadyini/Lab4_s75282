
package lab4;
import javax.swing.JOptionPane;
public class lab4q4 {
        public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter string characters: ");
        
         StringBuilder result = new StringBuilder();

        String convertedString = input.equals(input.toLowerCase()) 
                                 ? input.toUpperCase() 
                                 : input.toLowerCase();

       
        JOptionPane.showMessageDialog(null, "Converted string: " + convertedString);
    }

}
