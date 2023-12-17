package com.pickme.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUp {

    private JFrame frame;
    private JLabel completionMessage;
    private JTextField lastnameTextField;
    private JTextField firstnameTextField;
    private JTextField emailTextField;
    private JTextField addressTextField;
    private JTextField ageTextField;
    private JTextField sexTextField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUp window = new SignUp();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SignUp() {
        initialize();
    }
    
    public void showSignUpForm() {
        frame.setVisible(true);
    }
    
    private void initialize() {
        frame = new JFrame("Sign Up");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#FAF9F6"));
        frame.getContentPane().setLayout(null);
        
        // SignUp Panel with icon
        JPanel logoSignUp = new JPanel();
        logoSignUp.setBackground(Color.decode("#FAF9F6"));
        logoSignUp.setBounds(493, 60, 558, 202);
        frame.getContentPane().add(logoSignUp);
        
	        ImageIcon loginImage = new ImageIcon("images/userlogo.png"); 
	        Image logInLogoImage = loginImage.getImage().getScaledInstance(175, 195, Image.SCALE_SMOOTH);
	        loginImage = new ImageIcon(logInLogoImage);
	        JLabel logoLabel = new JLabel(loginImage);
	        logoSignUp.add(logoLabel);
	        logoSignUp.setBackground(Color.decode("#FAF9F6"));

        // Icon for SignUp Panel
        JPanel logo = new JPanel();
        logo.setBackground(Color.decode("#FAF9F6"));
        logo.setBounds(10, 10, 379, 250);
        frame.getContentPane().add(logo);
        
	        ImageIcon logoImage = new ImageIcon("images/logo.png"); 
	        Image logoIconImage = logoImage.getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH);
	        logoImage = new ImageIcon(logoIconImage);
	        JLabel logoLabel_2 = new JLabel(logoImage);
	        logo.add(logoLabel_2);
        
        // Panel for SignUp Form
        JPanel signUpForm = new JPanel();
        signUpForm.setBackground(Color.decode("#FAF9F6"));
        signUpForm.setBounds(493, 261, 558, 532);

        frame.getContentPane().add(signUpForm);
        signUpForm.setLayout(null);
        
	        // Email/ Mobile Number
	        JPanel email = new JPanel();
	        email.setBackground(new Color(217, 217, 217));
	        email.setBounds(74, 41, 408, 45);
	        signUpForm.add(email);
	        email.setLayout(null);
	        	
	        	// Email Label
		        JLabel lblNewLabel = new JLabel("Mobile Number / Email\r\n");
		        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		        lblNewLabel.setBounds(10, 10, 196, 25);
		        email.add(lblNewLabel);
		        
		        // Email TextField
		        emailTextField = new JTextField();
		        emailTextField.setBackground(new Color(228, 228, 215));
		        emailTextField.setColumns(10);
		        emailTextField.setBounds(0, 0, 408, 45);
		        emailTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5)); // Add empty border for spacing
		        email.add(emailTextField);
	  
		    // FirstName
		    JPanel firstName = new JPanel();
		    firstName.setBackground(new Color(217, 217, 217));
		    firstName.setBounds(74, 114, 408, 45);
		    signUpForm.add(firstName);
		    firstName.setLayout(null);
		        
		    	// FirstName Label
			    JLabel lblFirstName = new JLabel("First Name\r\n");
			    lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
			    lblFirstName.setBounds(10, 10, 196, 25);
			    firstName.add(lblFirstName);
		        
			    // FirstName TextField
			    firstnameTextField = new JTextField();
			    firstnameTextField.setBackground(new Color(228, 228, 215));
			    firstnameTextField.setColumns(10);
			    firstnameTextField.setBounds(0, 0, 408, 45);
			    firstnameTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5)); // Add empty border for spacing
			    firstName.add(firstnameTextField);
		    
		    
		    // LastName
		    JPanel lastName = new JPanel();
		    lastName.setBackground(new Color(217, 217, 217));
		    lastName.setBounds(74, 184, 408, 45);
		    signUpForm.add(lastName);
		    lastName.setLayout(null);
		        
		    	// LastName Label
			    JLabel lblLastName = new JLabel("Last Name");
			    lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
			    lblLastName.setBounds(10, 10, 196, 25);
			    lastName.add(lblLastName);
			    
			    // LastName TextField
			    lastnameTextField = new JTextField();
			    lastnameTextField.setBackground(new Color(228, 228, 215));
			    lastnameTextField.setColumns(10);
			    lastnameTextField.setBounds(0, 0, 408, 45);
			    lastnameTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5)); // Add empty border for spacing
			    lastName.add(lastnameTextField);
		        
		    // Address
		    JPanel address = new JPanel();
		    address.setBackground(new Color(217, 217, 217));
		    address.setBounds(74, 332, 408, 45);
		    signUpForm.add(address);
		    address.setLayout(null);
			    
		     	// Address Label
			    JLabel lblAddress = new JLabel("Address\r\n");
			    lblAddress.setBounds(10, 10, 196, 25);
			    address.add(lblAddress);
			    lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
			    
			    // Address TextField
			    addressTextField = new JTextField();
			    addressTextField.setBackground(new Color(228, 228, 215));
			    addressTextField.setColumns(10);
			    addressTextField.setBounds(0, 0, 408, 45);
			    addressTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5)); // Add empty border for spacing
			    address.add(addressTextField);
			    
			// Age
		    JPanel age = new JPanel();
		    age.setLayout(null);
		    age.setBackground(new Color(217, 217, 217));
		    age.setBounds(74, 256, 176, 45);
		    signUpForm.add(age);
		        
		    	// Age Label
			    JLabel lblAge = new JLabel("Age\r\n");
			    lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
			    lblAge.setBounds(10, 10, 196, 25);
			    age.add(lblAge);
			    
			    // Age TextField
			    ageTextField = new JTextField();
			    ageTextField.setBackground(new Color(228, 228, 215));
			    ageTextField.setColumns(10);
			    ageTextField.setBounds(0, 0, 176, 45);
			    ageTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5)); // Add empty border for spacing
			    age.add(ageTextField);
		     
			// Sex 
		    JPanel sex = new JPanel();
		    sex.setLayout(null);
		    sex.setBackground(new Color(217, 217, 217));
		    sex.setBounds(306, 256, 176, 45);
		    signUpForm.add(sex);
		       
			    // Sex Label
			    JLabel lblSex = new JLabel("Sex");
			    lblSex.setFont(new Font("Tahoma", Font.PLAIN, 15));
			    lblSex.setBounds(10, 10, 196, 25);
			    sex.add(lblSex);
			    
			    // Sex TextField
			    sexTextField = new JTextField();
			    sexTextField.setBackground(new Color(228, 228, 215));
			    sexTextField.setColumns(10);
			    sexTextField.setBounds(0, 0, 176, 45);
			    sexTextField.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5)); // Add empty border for spacing
			    sex.add(sexTextField);
	        
			// Label that will ask the user if they already have an account.
	        JLabel lblAlreadyHaveAn = new JLabel("Already have an account? \r\n ");
		    lblAlreadyHaveAn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblAlreadyHaveAn.setBounds(142, 497, 246, 25);
		    signUpForm.add(lblAlreadyHaveAn);
		    
		    //CLickable
		    JLabel lblSignIn = new JLabel("Sign In\r\n ");
		    lblSignIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblSignIn.setBounds(341, 497, 59, 25);
		    signUpForm.add(lblSignIn);
		    
		    // This will modify the Sign In Label 
		    // When click it sign in label it will become blue and it will redirect to the log in form
		    lblSignIn.addMouseListener(new MouseAdapter() {
		        @Override
		        public void mouseClicked(MouseEvent e) {
		            openSignInForm();
		        }
	
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            lblSignIn.setForeground(Color.BLUE);
		            lblSignIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		        }
	
		        @Override
		        public void mouseExited(MouseEvent e) {
		            lblSignIn.setForeground(Color.BLACK);
		            lblSignIn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		        }
		    });
		    
	        // Add JLabel for completion message
		    // JLabel Modification
	        completionMessage = new JLabel("");
	        completionMessage.setForeground(Color.GREEN);
	        completionMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        completionMessage.setBounds(74, 470, 500, 30);
	        signUpForm.add(completionMessage);
	        
	        // Button for Creating an Account
	        JButton Submit = new JButton("CREATE ACCOUNT\r\n");
		    Submit.setFont(new Font("Tahoma", Font.PLAIN, 23));
		    Submit.setBounds(154, 415, 230, 45);
		    signUpForm.add(Submit);
		    
		    // When Create Account is clicked, it will redirect to the Log In Form
		    Submit.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Validate and process signup data
	                if (validateSignUp()) {
	                    // Display completion message
	                    completionMessage.setText("Sign up Completed");
	
	                    // Simulate a delay for the message to be visible
	                    try {
	                        Thread.sleep(2000); 
	                    } catch (InterruptedException ex) {
	                        ex.printStackTrace();
	                    }
	
	                    // Open the Login form after completion
	                    openSignInForm();
	                }
	            }
	        });
	    
        frame.setVisible(true);
        centerFrame();
    }
    
    public void showLoginForm() {
        frame.setVisible(true);
    }
    
    
    // Validatin the Sign Up form
    private boolean validateSignUp() {
    	 if (emailTextField.getText().isEmpty() ||
    		        firstnameTextField.getText().isEmpty() ||
    		        lastnameTextField.getText().isEmpty() ||
    		        addressTextField.getText().isEmpty() ||
    		        ageTextField.getText().isEmpty() ||
    		        sexTextField.getText().isEmpty()) {

    		        // Display an error message
    		        completionMessage.setText("Please fill out all the required fields.");
    		        completionMessage.setForeground(Color.RED);

    		        // Return false as the validation failed
    		        return false;
    		    }
        return true;
    }

    // Open the SignIn form
    private void openSignInForm() {
        LogInForm signInForm = new LogInForm();
        signInForm.showLoginForm();
        frame.dispose(); // Close the current SignUp form
    }


    // Center the frame on the screen
    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }
}
