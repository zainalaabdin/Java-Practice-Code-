import javax.swing.*;
import java.awt.event.*;
 
public class Calculator implements ActionListener{

    JButton addButton = null;
    JButton subButton = null;
    JButton mulButton = null;
    JButton divButton = null;

    JTextField num1Field = null;
    JTextField num2Field = null;
    JTextField resultField = null;

    Calculator(){
     
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel label1 = new JLabel("Enter 1st Num:");
        label1.setSize(100, 30);
        label1.setLocation(20, 30);
        

        num1Field = new JTextField();
        num1Field.setSize(200, 30);
        num1Field.setLocation(130, 30);

      
        JLabel label2 = new JLabel("Enter 2nd Num:");
        label2.setSize(100, 30);
        label2.setLocation(20, 70);
        

        num2Field = new JTextField();
        num2Field.setSize(200, 30);
        num2Field.setLocation(130, 70);

    
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setSize(100, 30);
        resultLabel.setLocation(20, 160);
        

        resultField = new JTextField();
        resultField.setSize(200, 30);
        resultField.setLocation(130, 160);
        resultField.setEditable(false);
        

        addButton = new JButton("+");
        addButton.setSize(60, 30);
        addButton.setLocation(60, 110);


        subButton = new JButton("-");
        subButton.setSize(60, 30);
        subButton.setLocation(130, 110);


        mulButton = new JButton("*");
        mulButton.setSize(60, 30);
        mulButton.setLocation(200, 110);

        
        divButton = new JButton("/");
        divButton.setSize(60, 30);
        divButton.setLocation(270, 110);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        
        frame.add(label1);
        frame.add(num1Field);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);


       
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {

        new Calculator();
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton){
            String s1 = num1Field.getText();
            String s2 = num2Field.getText();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            resultField.setText(String.valueOf(num1 + num2));
                
        }

        if(e.getSource() == subButton){
            String s1 = num1Field.getText();
            String s2 = num2Field.getText();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            resultField.setText(String.valueOf(num1 - num2));

        }

        if(e.getSource() == mulButton){
            String s1 = num1Field.getText();
            String s2 = num2Field.getText();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            resultField.setText(String.valueOf(num1 * num2));

        }

        if(e.getSource() == divButton){
            String s1 = num1Field.getText();
            String s2 = num2Field.getText();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            resultField.setText(String.valueOf(num1 / num2));

        }
    }
}
