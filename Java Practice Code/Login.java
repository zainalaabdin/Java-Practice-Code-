import javax.swing.*;
import java.awt.event.*;

public class Login implements ActionListener {
    JTextField userField = null;
    JPasswordField passField = null;
    JLabel resultLabel = null;
    JButton loginbutton = null;
    
    Login(){
    JFrame frame = new JFrame("LOGIN FORM");
    frame.setSize(400, 250);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel userLabel = new JLabel("User Name: ");
    userLabel.setSize(100, 30);
    userLabel.setLocation(30, 30);
    frame.add(userLabel);

    userField = new JTextField();
    userField.setSize(150, 30);
    userField.setLocation(130, 30);
    frame.add(userField);

    JLabel passLabel = new JLabel("Password: ");
    passLabel.setSize(100, 30);
    passLabel.setLocation(30, 70);
    frame.add(passLabel);

    passField = new JPasswordField();
    passField.setSize(150, 30);
    passField.setLocation(130, 70);
    frame.add(passField);

    loginbutton = new JButton("Login");
    loginbutton.setSize(150, 30);
    loginbutton.setLocation(130, 110);
    loginbutton.addActionListener(this);
    frame.add(loginbutton);

    resultLabel = new JLabel("Message");
    resultLabel.setSize(200, 30);
    resultLabel.setLocation(30, 150);
    frame.add(resultLabel);

    frame.setVisible(true);

    }

public static void main(String[] args) {
    Login ob =  new Login();
}
public void actionPerformed(ActionEvent e){
    String user = userField.getText();
    String pass = String.valueOf(passField.getPassword());

    if(user.equals("zain") && pass.equals("123")){
        JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
        resultLabel.setText("Welcome, Zain");
    }else{
        JOptionPane.showMessageDialog(null, "Please Enter Correct Information");
        resultLabel.setText("Invalid username & password");
    }

    }
}
