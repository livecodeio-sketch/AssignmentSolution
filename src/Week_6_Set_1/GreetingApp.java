package Week_6_Set_1;

import java.awt.*;
import java.awt.event.*;

public class GreetingApp extends Frame implements ActionListener {
    TextField nameField;
    Label messageLabel;
    Button submitButton;

    public GreetingApp() {
        // Frame setup
        setTitle("AWT Greeting App");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Components
        Label nameLabel = new Label("Enter your name:");
        nameField = new TextField(20);
        submitButton = new Button("Submit");
        messageLabel = new Label("");

        // Add components to Frame
        add(nameLabel);
        add(nameField);
        add(submitButton);
        add(messageLabel);

        // Register listener
        submitButton.addActionListener(this);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        if (name.isEmpty()) {
            messageLabel.setText("Please enter your name!");
        } else {
            messageLabel.setText("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        new GreetingApp();
    }
}
