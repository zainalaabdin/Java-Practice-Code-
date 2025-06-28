import javax.swing.*;
public class Addition {
    public static void main(String arg[]){
        String a = JOptionPane.showInputDialog("Enter 1st Number");
        String b = JOptionPane.showInputDialog("Enter 2nt Number");
        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);
        JOptionPane.showMessageDialog(null,"The Addition is :"+ (i+j));
    }
    
}
