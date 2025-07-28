import javax.swing.*;
public class Acretosqurefoot {
    public static void main (String arg[]){
        String s = JOptionPane.showInputDialog("Enter Acre Number: ");
        int num = Integer.parseInt(s);
        num = num * 43560;
        JOptionPane.showMessageDialog(null, "Squer foot is :"+ num);
    }
}
