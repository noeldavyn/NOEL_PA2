import javax.swing.JOptionPane;
import java.awt.*;

public class Encrypt {

     public static void main (String args [] ) {
          int digit1, digit2, digit3, digit4, encryptedNumber, number;
          number= Integer.parseInt(JOptionPane.showInputDialog ("Enter a 4-digit number: "));
          digit1= (number/1000+7)%10;
          digit2= (number%1000/100+7)%10;
          digit3= (number%100/10+7)%10;
          digit4=(number%10+7)%10;
          encryptedNumber = digit1*10 + digit2 + digit3*1000 + digit4*100;
          JOptionPane.showMessageDialog (null, "Encrypted number is " + encryptedNumber,
          " Encyptor", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
          }
     }

