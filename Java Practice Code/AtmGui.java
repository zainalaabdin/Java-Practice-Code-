import javax.swing.*;
public class AtmGui {
        public static void main(String arg[]){
            JFrame frame = new JFrame("ATM Note");
            frame.setSize(400, 250);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel amountLabel = new JLabel("Enter Amount: ");
            amountLabel.setSize(100, 30);
            amountLabel.setLocation(20, 30);
            frame.add(amountLabel);


            JTextField amountField = new JTextField();
            amountField.setSize(200, 30);
            amountField.setLocation(130, 30);
            frame.add(amountField);

            JButton noteButton = new JButton("Seprate Note");
            noteButton.setSize(200, 30);
            noteButton.setLocation(130, 70);
            frame.add(noteButton);


            JLabel resultLabel = new JLabel("Result");
            resultLabel.setSize(100, 30);
            resultLabel.setLocation(20, 120);
            frame.add(resultLabel);

            JTextField resultField = new JTextField();
            resultField.setSize(200, 30);
            resultField.setLocation(130, 120);
            resultField.setEditable(false);
            frame.add(resultField);

            
            frame.setVisible(true);

        }
}
