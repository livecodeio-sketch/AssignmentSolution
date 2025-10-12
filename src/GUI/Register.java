package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register {

    JLabel emailLabel;
    JTextField emailTextField;
    JTextArea feedbackTextArea;
    JCheckBox termsCheckBox;
//    Choice country;
//    TextField passwordTF;
    JButton register;
    JFrame frame;

    Register( ){
        frame = new JFrame("Registration");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setBackground(Color.CYAN);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(100,100,80,30);
        emailTextField = new JTextField("Enter your email");
        emailTextField.setBounds(200,100,200,30);

        feedbackTextArea = new JTextArea("Enter your Feedback");
        feedbackTextArea.setBounds(100,150,300,100);

        termsCheckBox = new JCheckBox("I Agree to whatever");
        termsCheckBox.setBounds(100,280,300,30);

//        country = new Choice();
//        country.add("India");
//        country.add("USA");
//        country.add("UK");
//        country.add("Singapore");
//        country.setBounds(100,330,150, 30);
//
//        passwordTF = new TextField();
//        passwordTF.setEchoChar('*');
//        passwordTF.setBounds(100, 380, 150, 30);

        register = new JButton("Register");
        register.setBounds(100,420,80,30);
        register.setBackground(Color.gray);
        register.setForeground(Color.CYAN);

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emailLabel.setText("Reg Email");
                System.out.println("Email: "+emailTextField.getText());
                System.out.println("Feedback: "+feedbackTextArea.getText());
                System.out.println("Terms: "+termsCheckBox.getName());
//                System.out.println("Country: "+country.getSelectedItem());
//                System.out.println("Password: "+passwordTF.getText());
                System.out.println("Registered");
            }
        });

        frame.add(emailLabel);
        frame.add(emailTextField);
        frame.add(feedbackTextArea);
        frame.add(termsCheckBox);
//        frame.add(country);
//        frame.add(passwordTF);
        frame.add(register);
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

    public static void main(String[] args) {
        new Register();
    }

}
