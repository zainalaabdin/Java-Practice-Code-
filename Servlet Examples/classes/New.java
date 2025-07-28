import javax.swing.*;
public class New{
	public static void main (String arg[]){
		String s = JOptionPane.showInputDialog("Enter Any Number");
		int num = Integer.parseInt(s);
		num = num * num;
		JOptionPane.showMessageDialog(null, "Squre is = " + num);
	}
}