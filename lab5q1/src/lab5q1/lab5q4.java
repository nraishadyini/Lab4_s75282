package lab5q1;
        import javax.swing.JOptionPane;

public class lab5q4 {

    public static void main(String[] args) {

        
        String inputDate = JOptionPane.showInputDialog("Enter the date (DD-MM-YYYY or DD/MM/YYYY):");
        
        try {
            
            String[] dateParts = inputDate.contains("-") ? inputDate.split("-") : inputDate.split("/");
            int q = Integer.parseInt(dateParts[0]); 
            int m = Integer.parseInt(dateParts[1]); 
            int y = Integer.parseInt(dateParts[2]);

            if (m == 1 || m == 2) {
                m += 12;
                y -= 1;
            }

            int h = (q + (13 * (m + 1) / 5) + y +( y / 4) - (y / 100) + (y / 400)) % 7;

            String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            String dayName = daysOfWeek[h];

          
            
            JOptionPane.showMessageDialog(null, "The day of the week is: " + dayName);
        } catch (Exception e) {
          
            JOptionPane.showMessageDialog(null, "Invalid date format. Please use DD-MM-YYYY or DD/MM/YYYY.");
        }
    }
}


