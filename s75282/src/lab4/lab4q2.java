
package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class lab4q2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter RADIUS: ");
        double r = Double.parseDouble(input);
        
        double diameter = 2*r ;
        double circumference = 2* 3.14*r;
        double  area = 3.14*r*r ;
        
        
        JOptionPane.showMessageDialog(null, "the diameter is " + diameter);
        JOptionPane.showMessageDialog(null, "the circumference is " + circumference);
        JOptionPane.showMessageDialog(null, "the area is " + area);
        
  
        
        
        
    }
    

}
