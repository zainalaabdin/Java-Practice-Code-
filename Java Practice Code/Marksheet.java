import javax.swing.*;
import java.awt.event.*;

public class Marksheet implements ActionListener {

    JTextField englishField = null;
    JTextField mathField = null;
    JTextField scienceField = null;
    JTextField totalField = null;
    JTextField percentField = null;
    JTextField gradeField = null;
    JButton calButton = null;


    Marksheet(){
        JFrame frame = new JFrame("Marksheet");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel Label1 = new JLabel("ENGLISH");
        Label1.setSize(100, 30);
        Label1.setLocation(20, 30);

        englishField = new JTextField();
        englishField.setSize(200, 30);
        englishField.setLocation(130, 30);


        JLabel Label2 = new JLabel("MATH");
        Label2.setSize(100, 30);
        Label2.setLocation(20, 70);

        mathField = new JTextField();
        mathField.setSize(200, 30);
        mathField.setLocation(130, 70);


        JLabel Label3 = new JLabel("SCIENCE");
        Label3.setSize(100, 30);
        Label3.setLocation(20, 110);

        scienceField = new JTextField();
        scienceField.setSize(200, 30);
        scienceField.setLocation(130, 110);


        calButton = new JButton("CALCULATE");
        calButton.setSize(200, 30);
        calButton.setLocation(130, 150);
        calButton.addActionListener(this);


        JLabel totalLabel = new JLabel("TOTAL");
        totalLabel.setSize(100, 30);
        totalLabel.setLocation(20, 200);

        totalField = new JTextField();
        totalField.setSize(200, 30);
        totalField.setLocation(130, 200);
        totalField.setEditable(false);

        JLabel percentLabel = new JLabel("PERCENTAGE");
        percentLabel.setSize(100, 30);
        percentLabel.setLocation(20, 240);

        percentField = new JTextField();
        percentField.setSize(200, 30);
        percentField.setLocation(130, 240);
        percentField.setEditable(false);


        JLabel gradeLabel = new JLabel("GRADE");
        gradeLabel.setSize(100, 30);
        gradeLabel.setLocation(20, 280);


        gradeField = new JTextField();
        gradeField.setSize(200, 30);
        gradeField.setLocation(130, 280);


        frame.add(Label1); 
        frame.add(englishField);
        frame.add(Label2);
        frame.add(mathField);
        frame.add(Label3); 
        frame.add(scienceField);
        frame.add(calButton);
        frame.add(totalLabel); 
        frame.add(totalField);
        frame.add(percentLabel); 
        frame.add(percentField);
        frame.add(gradeLabel); 
        frame.add(gradeField);


        frame.setVisible(true);
        
    }

    public static void main(String arg[]){
        Marksheet ob = new Marksheet();
    }

    public void actionPerformed(ActionEvent e){
        int eng = Integer.parseInt(englishField.getText());
        int math = Integer.parseInt(mathField.getText());
        int sci = Integer.parseInt(scienceField.getText());

        int total = eng + math + sci;
        int percent = (total * 100) / 300;

        String grade = "";
        if(percent >= 80){
            grade = "A+";
        }else if(percent >= 70){
            grade = "A";
        }else if(percent >= 60){
            grade = "B";
        }else if(percent >= 50){
            grade = "C";
        }else{
            grade = "FAIL";
        }

        totalField.setText(String.valueOf(total));
        percentField.setText(percent + "%");
        gradeField.setText(String.valueOf(grade));
    }
}
