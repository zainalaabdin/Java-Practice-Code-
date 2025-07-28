import javax.swing.*;
public class Ampretomegaampre{
    public static void main(String arg[]){
        String a = JOptionPane.showInputDialog("Enter Ampre for Convert Mega Ampare");
        double num = Double.parseDouble(a);
        double  num2 = num / 1000000;
        JOptionPane.showMessageDialog(null, "Mega Ampare"+ num2);
        
    }
}