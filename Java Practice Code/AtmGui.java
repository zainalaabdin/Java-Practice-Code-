
import javax.swing.*;
import java.awt.event.*;

public class AtmGui implements ActionListener{

    JTextField amountField = null;
    JTextArea resultArea = null;
    JButton noteButton = null;

    AtmGui(){

            JFrame frame = new JFrame("ATM Note");
            frame.setSize(400, 250);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel amountLabel = new JLabel("Enter Amount: ");
            amountLabel.setSize(100, 30);
            amountLabel.setLocation(20, 30);
            frame.add(amountLabel);


            amountField = new JTextField();
            amountField.setSize(200, 30);
            amountField.setLocation(130, 30);
            frame.add(amountField);

            noteButton = new JButton("Click for Seprate Note");
            noteButton.setSize(200, 30);
            noteButton.setLocation(130, 70);
            noteButton.addActionListener(this);
            frame.add(noteButton);


            JLabel resultLabel = new JLabel("Seprated Notes");
            resultLabel.setSize(100, 30);
            resultLabel.setLocation(20, 120);
            frame.add(resultLabel);

            resultArea = new JTextArea();
            resultArea.setSize(300, 200);
            resultArea.setLocation(20, 150);
            resultArea.setEditable(false);
            frame.add(resultArea);

            frame.setVisible(true);

        }

        public static void main(String arg[]){
            AtmGui ob =  new AtmGui();
            
        }
        public void actionPerformed(ActionEvent e){

            if(e.getSource() == noteButton){
            String s1 = amountField.getText();
            int a = Integer.parseInt(s1);

            int fth = a / 5000;
            a %= 5000;
            int th = a / 1000;
            a %= 1000;
            int fi = a / 500;
            a %= 500;
            int hu = a / 100;
            a %= 100;
            int fif = a / 50;
            a %= 50;
            int tw = a / 20;
            a %= 20;
            int ten = a / 10;
            a %= 10;
            int fiv = a / 5;
            a %= 5;
            int two = a / 2;
            a %= 2;
            int one  = a / 1;
            a %= 1; 
            
            String result = "";

            result += "5000 Note: " + fth + "\n";
            result += "1000 Note: " + th + "\n";
            result += "500 Note: " + fi + "\n";
            result += "100 Note: " + hu + "\n";
            result += "50 Note: " + fif + "\n";
            result += "20 Note: " + tw + "\n";
            result += "10 Note: " + ten + "\n";
            result += "5 Note: " + fiv + "\n";
            result += "2 Note: " + two + "\n";
            result += "1 Note: " + one + "\n";

            resultArea.setText(result);
        }
    }
}
