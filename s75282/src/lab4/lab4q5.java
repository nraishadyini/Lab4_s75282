
package lab4;
import javax.swing.JOptionPane;

public class lab4q5 {
     public static void main(String[] args) {
      
        String distanceInput = JOptionPane.showInputDialog("Enter the distance in meters:");
        double distance = Double.parseDouble(distanceInput);

        String hoursInput = JOptionPane.showInputDialog("Enter the time in hours:");
        int hours = Integer.parseInt(hoursInput);

        String minutesInput = JOptionPane.showInputDialog("Enter the time in minutes:");
        int minutes = Integer.parseInt(minutesInput);

        String secondsInput = JOptionPane.showInputDialog("Enter the time in seconds:");
        int seconds = Integer.parseInt(secondsInput);
        
        int totalTimeInSeconds = (hours * 3600) + (minutes * 60) + seconds;

     
        double speedMps = distance / totalTimeInSeconds;

      
        double speedKmph = (distance / 1000) / (totalTimeInSeconds / 3600.0);

        double speedMph = (distance / 1609) / (totalTimeInSeconds / 3600.0);


        
        String result = String.format("Speed:\n"
            + "In meters per second: %.2f m/s\n"
            + "In kilometers per hour: %.2f km/h\n"
            + "In miles per hour: %.2f mph", speedMps, speedKmph, speedMph);

        JOptionPane.showMessageDialog(null, result);
     }
     
     
}
