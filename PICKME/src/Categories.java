package com.pickme.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Categories {
	// Text for buttons
	private static final String[] BUTTON_TEXTS = {
         "TROPICAL", "CASUAL", "<html> SEMI <br> FORMAL </html>",
         "FORMAL", "BLACK TIE"
	};
	
	// Main frame containing category buttons
	public static class CategoriesFrame extends JFrame implements ActionListener {
		protected StyledButton[] buttons;
		protected CategoriesPanel categoriesPanel;
		private String selectedGender;
		
		// Constructor for our category class
		public CategoriesFrame(String title, String gender) {
			this.selectedGender = gender;
			initializeFrame(title);
		}
		
		 // Initialize the main frame
	     private void initializeFrame(String title) {
	    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setLayout(new BorderLayout());
	         
	         // Title Panel
	         categoriesPanel = new CategoriesPanel("CATEGORIES");
	         add(categoriesPanel, BorderLayout.NORTH);
	         
	         createButtonPanel();
	
	         pack();
	         setSize(1920, 1080);
	
	         centerFrame();
	         setTitle(title);
	
	         setVisible(true);
	     }
     
	     // Center the frame on the screen
	     private void centerFrame() {
	         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	         int x = (screenSize.width - getWidth()) / 2;
	         int y = (screenSize.height - getHeight()) / 2;
	         setLocation(x, y);
	     }
     
	     // Panel containing category buttons 
	     private void createButtonPanel() {
	         JPanel gridPanel = new JPanel(new GridBagLayout());
	         gridPanel.setBackground(Color.decode("#FAF9F6"));
	
	         buttons = new StyledButton[BUTTON_TEXTS.length];
	         for (int i = 0; i < BUTTON_TEXTS.length; i++) {
	        	 
	        	 //Modification of the buttons
	             buttons[i] = createStyledButton(BUTTON_TEXTS[i]);
	
	             GridBagConstraints buttonConstraints = new GridBagConstraints();
	             buttonConstraints.gridx = i % 5;
	             buttonConstraints.gridy = i / 5 + 1;
	             buttonConstraints.insets = new Insets(20, 10, 10, 10);
	             gridPanel.add(buttons[i].getButton(), buttonConstraints);
	
	             buttons[i].addActionListener(this);
	         } 
	
	         add(gridPanel, BorderLayout.CENTER);
	     }
     
	     // Styled button with text
	     protected StyledButton createStyledButton(String buttonText) {
	         return new RoundedButton(buttonText);
	     }
     
	     // This will handle button click events
	     @Override
	     public void actionPerformed(ActionEvent e) {
	         JButton clickedButton = (JButton) e.getSource();
	         String category = clickedButton.getText();
	
	
	         EventQueue.invokeLater(() -> {
	             try {
	                 new BodyShape(selectedGender, category);
	             } catch (Exception ex) {
	                 ex.printStackTrace();
	             }
	         });
	     }
	}
	
// Displaying the title of the categories - using Panel
public static class CategoriesPanel extends JPanel {

     private JLabel titleLabel;
     
     // Constructor for the Categories Panel
     public CategoriesPanel(String title) {
         setLayout(new BorderLayout());
         setBackground(Color.decode("#FAF9F6"));
         
         // Add title label
         createTitleLabel(title);
         add(titleLabel, BorderLayout.NORTH);
     }
     
     // Creation of title label with modification of the style
     private void createTitleLabel(String title) {
         titleLabel = new JLabel(title);
         titleLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
         titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
         titleLabel.setVerticalAlignment(SwingConstants.TOP);
         titleLabel.setBorder(BorderFactory.createEmptyBorder(40, 40, 10, 10));
     }
     
     // Getter for title label
     public JLabel getTitleLabel() {
    	 return titleLabel;
     }
}

	// Sub class for female categories frame
	static class FemaleCategoriesFrame extends CategoriesFrame {
		public FemaleCategoriesFrame() {
	         super("Female Categories", "female");
	     }
	}

	// Sub class for male categories frame
	 static class MaleCategoriesFrame extends CategoriesFrame {
	     public MaleCategoriesFrame() {
	         super("Male Categories", "male");
	     }
	}

	 // Interface for clickable elements 
	interface Clickable {
	     void onClick();
	}

	// An abstract class - represnting a styled button
	abstract static class StyledButton extends JButton implements Clickable {
	     public StyledButton(String text) {
	         super(text);
	         setContentAreaFilled(false);
	         styleButton();
	     }
	
	     protected abstract void styleButton();
	
	     @Override
	     public void onClick() {
	         System.out.println("Button Clicked: " + getText());
	     }
	
	     public JButton getButton() {
	         return this;
	     }
	}

	//Subclass of a rounded button
	static class RoundedButton extends StyledButton {
		private static final int ARC_SIZE = 15;
	
	    public RoundedButton(String text) {
	        super(text);
	    }
	     
	    // Modification of the buttons
	    @Override
	    protected void styleButton() {
	    	setBackground(Color.decode("#E4E4D7"));
	        setForeground(Color.BLACK);
	        setFont(new Font("Tahoma", Font.BOLD, 22));
	        setPreferredSize(new Dimension(250, 220)); 
	    }
	     
	    // Paint the components with rounded corners
	    @Override
	    protected void paintComponent(Graphics g) {
	        g.setColor(getBackground());
	        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, ARC_SIZE, ARC_SIZE);
	        super.paintComponent(g);
	    }
	     
	    // Paint the border with rounded corners
	    @Override
	    protected void paintBorder(Graphics g) {
	        g.setColor(getForeground());
	        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, ARC_SIZE, ARC_SIZE);
	    }
	}
}
