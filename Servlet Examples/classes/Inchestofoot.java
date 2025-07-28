import javax.swing.*;
public class Inchestofoot {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Inches to Feet Convertor");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel inchesLabel = new JLabel("Enter Inches: ");
        inchesLabel.setSize(100, 30);
        inchesLabel.setLocation(20,30);
        frame.add(inchesLabel);


        JTextField inchesField = new JTextField();
        inchesField.setSize(200, 30);
        inchesField.setLocation(130, 30);
        frame.add(inchesField);


        JButton convertButton = new JButton("Convert to Feet");
        convertButton.setSize(200, 30);
        convertButton.setLocation(130, 70);
        frame.add(convertButton);


        JLabel resultLabel = new JLabel("Result");
        resultLabel.setSize(100, 30);
        resultLabel.setLocation(20, 120);
        frame.add(resultLabel);


        JTextField resultField = new JTextField();
        resultField.setSize(200, 30);
        resultField.setLocation(130, 120);
        resultField.setEditable(false);


        frame.setVisible(true);


    }
    
}
