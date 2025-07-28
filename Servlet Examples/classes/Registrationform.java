import javax.swing.*;
public class Registrationform {
    public static void main(String arg[]){
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setSize(100, 30);
        nameLabel.setLocation(20, 30);

        JTextField nameField = new JTextField();
        nameField.setSize(200, 30);
        nameField.setLocation(130, 30);

        JLabel ageLabel = new JLabel("AGE: ");
        ageLabel.setSize(100, 30);
        ageLabel.setLocation(20, 70);

        JTextField ageField = new JTextField();
        ageField.setSize(200, 30);
        ageField.setLocation(130, 70);


        JLabel genderJLabel = new JLabel("Gender");
        genderJLabel.setSize(100, 30);
        genderJLabel.setLocation(20, 110);

        JRadioButton maleBtn = new JRadioButton("Male");
        maleBtn.setSize(80,30);
        maleBtn.setLocation(130, 110);

        JRadioButton femaleBtn = new JRadioButton("Female");
        femaleBtn.setSize(80, 30);
        femaleBtn.setLocation(210, 110);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setSize(200, 30);
        submitBtn.setLocation(130, 190);

        JTextArea Result = new JTextArea();
        Result.setSize(340, 120);
        Result.setLocation(20, 240);
        Result.setEditable(false);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(genderJLabel);
        frame.add(maleBtn);
        frame.add(femaleBtn);
        frame.add(submitBtn);
        frame.add(Result);

        frame.setVisible(true);
    }
}
