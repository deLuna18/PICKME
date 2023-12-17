package com.pickme.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LogIn {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LogInForm loginForm = new LogInForm();
            loginForm.showLoginForm();
        });
    }
}

class LogInForm {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    // Fixed username and password - for demonstration only 
    private static final String VALID_USERNAME = "alexadeluna";
    private static final String VALID_PASSWORD = "kapoynako";
    
    // Method to display Log In Form
    public void showLoginForm() {
        EventQueue.invokeLater(() -> {
            initialize();
            frame.setVisible(true);
        });
    }
    
    // Method to initialized the login form
    private void initialize() {
        frame = new JFrame("Sign In");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#FAF9F6"));
        frame.getContentPane().setLayout(null);
        
        // Log In Panel
        JPanel logInForm = createLogInPanel();
        frame.getContentPane().add(logInForm);
        	
        	// UserName
	        usernameField = createTextField("Username", 134, 56, 348, 44);
	        logInForm.add(usernameField);
	        
		        JLabel lblUsername = createLabel("Username", Font.BOLD, 15, 92, 110);
		        logInForm.add(lblUsername);
		
	        // Password
	        passwordField = createPasswordField("Password", 134, 152, 348, 44);
	        logInForm.add(passwordField);
	        	
		        JLabel lblPassword = createLabel("Password", Font.BOLD, 15, 92, 207);
		        logInForm.add(lblPassword);
	        
	        // LogIn Button
	        JButton submit = createSubmitButton("LOG IN", 187, 268, 156, 54);
	        logInForm.add(submit);

	        JLabel txt_1 = createLabel("Don't have an account? ", 14, 168, 366);
	        logInForm.add(txt_1);
	        
	        // UserName and Password icons 
	        JPanel icon_1_Panel = createIconPanel("images/username.png", 74, 56, 60, 44);
	        logInForm.add(icon_1_Panel);
	        
	        JPanel icon_2_Panel = createIconPanel("images/userpassword.png", 74, 152, 60, 44);
	        logInForm.add(icon_2_Panel);
	        
	        // Mouse listeners for "Sign Up" label
	        JLabel txt_2 = createLabel("Sign Up", 14, 320, 366);
	        logInForm.add(txt_2);

	        txt_2.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	            	openSignUpForm(); // Open SignUp Form when clicked
	            }
	
	            @Override
	            public void mouseEntered(MouseEvent e) {
	                txt_2.setForeground(Color.BLUE); // Change text color to blue on mouse hover
	                txt_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	            }
	            
	            @Override
	            public void mouseExited(MouseEvent e) {
	                txt_2.setForeground(Color.BLACK); // Change text color back to black on mouse exit
	                txt_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // Set cursor to default on mouse exit
	            }
	        });
	    
	    // UserName and Password Panel
        JPanel userName = createPanel(574, 465, 402, 45);
        frame.getContentPane().add(userName);

        JPanel passWord = createPanel(575, 561, 402, 45);
        frame.getContentPane().add(passWord);

        JPanel logoLogIn = createPanel(494, 87, 558, 324);
        frame.getContentPane().add(logoLogIn);
        	
        	// UserName logo image
	        ImageIcon loginImage = createImageIcon("images/userlogo.png", 250, 275);
	        JLabel logoLabel = createLabelWithIcon(loginImage);
	        logoLogIn.add(logoLabel);
	        logoLogIn.setBackground(Color.decode("#FAF9F6"));
        
        JPanel logo = createPanel(10, 10, 379, 250);
        frame.getContentPane().add(logo);
        	
        	// Password logo image
	        ImageIcon logoImage = createImageIcon("images/logo.png", 300, 150);
	        JLabel logoLabel_2 = createLabelWithIcon(logoImage);
	        logo.setBackground(Color.decode("#FAF9F6")); 
	        logo.add(logoLabel_2);
        
        frame.setVisible(true);
        centerFrame();
    }
    
    // Method to create the login panel
    private JPanel createLogInPanel() {
        JPanel logInForm = new JPanel();
        logInForm.setBackground(Color.decode("#FAF9F6"));
        logInForm.setBounds(494, 410, 558, 399);
        logInForm.setLayout(null);
        return logInForm;
    }
    
    // Method to create text field
    private JTextField createTextField(String placeholder, int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBackground(Color.decode("#E4E4D7"));
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBounds(x, y, width, height);
        textField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
        textField.setColumns(10);
        return textField;
    }
    
    // Method to create password field
    private JPasswordField createPasswordField(String placeholder, int x, int y, int width, int height) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBackground(Color.decode("#E4E4D7"));
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        passwordField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
        passwordField.setColumns(10);
        passwordField.setBounds(x, y, width, height);
        return passwordField;
    }

    private JButton createSubmitButton(String text, int x, int y, int width, int height) {
        JButton submit = new JButton(text);
        submit.setForeground(new Color(255, 255, 255));
        submit.setFont(new Font("Tahoma", Font.PLAIN, 23));
        submit.setBackground(Color.decode("#2E4053"));
        submit.setBounds(x, y, width, height);
        
        // ActionListener for the submit button
        submit.addActionListener(e -> validateCredentials());

        return submit;
    }
    
    // Method to create label
    private JLabel createLabel(String text, int fontSize, int x, int y) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
        label.setBounds(x, y, 162, 23);
        return label;
    }
    
    // Method to create label with specified style
    private JLabel createLabel(String text, int style, int fontSize, int x, int y) {
        JLabel label = createLabel(text, fontSize, x, y);
        label.setFont(new Font("Tahoma", style, fontSize));
        return label;
    }
    
    // Method to create a generic panel
    private JPanel createIconPanel(String imagePath, int x, int y, int width, int height) {
        JPanel iconPanel = createPanel(x, y, width, height);

        ImageIcon iconImage = createImageIcon(imagePath, 45, 35);
        JLabel iconLabel = createLabelWithIcon(iconImage);
        iconPanel.add(iconLabel);
        iconPanel.setBackground(new Color(217, 217, 217));

        return iconPanel;
    }
    
    
    private JPanel createPanel(int x, int y, int width, int height) {
        JPanel panel = new JPanel();
        panel.setBounds(x, y, width, height);
        return panel;
    }

    private ImageIcon createImageIcon(String imagePath, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image logoImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(logoImage);
    }

    private JLabel createLabelWithIcon(ImageIcon icon) {
        return new JLabel(icon);
    }
    
    // When user click SignUp Label it will redirect to the Sign Up Frame
    private void openSignUpForm() {
        SignUp signUpForm = new SignUp();
        signUpForm.showSignUpForm();
        frame.dispose();
    }
    
    
    // Center the Frame
    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }
    
    // Check if the user's credentials is valid or not 
    private void validateCredentials() {
        String enteredUsername = usernameField.getText();
        char[] enteredPasswordChars = passwordField.getPassword();
        String enteredPassword = new String(enteredPasswordChars);

        if (enteredUsername.equals(VALID_USERNAME) && enteredPassword.equals(VALID_PASSWORD)) {
            openMainApplication();
            openGenderSelection();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid credentials. Please try again.",
                    "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
        }

        passwordField.setText("");
    }
    
    // Message will show once the user entered a valid credentials
    private void openMainApplication() {
        JOptionPane.showMessageDialog(frame, "Login successful!");
    }
    
    // If the Credentials is valid it will redirect to the Gender Frame
    private void openGenderSelection() {
        SwingUtilities.invokeLater(() -> {
            Gender genderSelection = new Gender();
            genderSelection.showGenderFrame();
            frame.dispose();
        });
    }
}
