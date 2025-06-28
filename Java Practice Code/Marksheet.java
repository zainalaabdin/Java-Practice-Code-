import javax.swing.*;
public class Marksheet {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Marksheet");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel Label1 = new JLabel("ENGLISH");
        Label1.setSize(100, 30);
        Label1.setLocation(20, 30);

        JTextField englishField = new JTextField();
        englishField.setSize(200, 30);
        englishField.setLocation(130, 30);


        JLabel Label2 = new JLabel("MATH");
        Label2.setSize(100, 30);
        Label2.setLocation(20, 70);

        JTextField mathField = new JTextField();
        mathField.setSize(200, 30);
        mathField.setLocation(130, 70);


        JLabel Label3 = new JLabel("SCIENCE");
        Label3.setSize(100, 30);
        Label3.setLocation(20, 110);

        JTextField scienceField = new JTextField();
        scienceField.setSize(200, 30);
        scienceField.setLocation(130, 110);


        JButton calButton = new JButton("CALCULATE");
        calButton.setSize(200, 30);
        calButton.setLocation(130, 150);


        JLabel totalLabel = new JLabel("TOTAL");
        totalLabel.setSize(100, 30);
        totalLabel.setLocation(20, 200);

        JTextField totalField = new JTextField();
        totalField.setSize(200, 30);
        totalField.setLocation(130, 200);
        totalField.setEditable(false);

        JLabel percentLabel = new JLabel("PERCENTAGE");
        percentLabel.setSize(100, 30);
        percentLabel.setLocation(20, 240);

        JTextField percentField = new JTextField();
        percentField.setSize(200, 30);
        percentField.setLocation(130, 240);
        percentField.setEditable(false);


        JLabel gradeLabel = new JLabel("GRADE");
        gradeLabel.setSize(100, 30);
        gradeLabel.setLocation(20, 280);


        JTextField gradeField = new JTextField();
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
}
