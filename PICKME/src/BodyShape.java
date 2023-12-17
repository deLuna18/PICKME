package com.pickme.test;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyShape {

 private JFrame frame;
 
 public JFrame getFrame() {
     return frame;
 }

 public BodyShape(String gender, String category) {
     initialize(gender, category);
 }

 private void initialize(String gender, String category) {
     frame = new JFrame();
     frame.getContentPane().setBackground(Color.WHITE);
     frame.pack();
     frame.setSize(1920, 1080);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.getContentPane().setLayout(null);

     BodyShapePanel bodyShapePanel = new BodyShapePanel(gender, category);
     frame.getContentPane().add(bodyShapePanel);
     
     
     
     RoundedButton  roundShapeBtn = new RoundedButton ("ROUNDSHAPE");
     bodyShapePanel.addShapeButton(roundShapeBtn);
     
	     ImageIcon roundShape = new ImageIcon("images/round.png");
	     Image roundShapeImage = roundShape.getImage().getScaledInstance(213, 487, Image.SCALE_SMOOTH);
	     roundShape = new ImageIcon(roundShapeImage);
	     roundShapeBtn.setIcon(roundShape);
	     roundShapeBtn.setBackground(Color.decode("#E4E4D7"));


	 RoundedButton  triangleShapeBtn = new RoundedButton ("TRIANGLE SHAPE");
     bodyShapePanel.addShapeButton(triangleShapeBtn);
     
	     ImageIcon triangleShape = new ImageIcon("images/triangle.png");
	     Image triangleShapeImage = triangleShape.getImage().getScaledInstance(213, 487, Image.SCALE_SMOOTH);
	     triangleShape = new ImageIcon(triangleShapeImage);
	     triangleShapeBtn.setIcon(triangleShape);
	     triangleShapeBtn.setBackground(Color.decode("#E4E4D7"));

	 RoundedButton  hourGlassBtn = new RoundedButton ("HOUR GLASS");
     bodyShapePanel.addShapeButton(hourGlassBtn);
     
	     ImageIcon hourGlass = new ImageIcon("images/hour glass.png");
	     Image hourGlassImage = hourGlass.getImage().getScaledInstance(213, 487, Image.SCALE_SMOOTH);
	     hourGlass = new ImageIcon(hourGlassImage);
	     hourGlassBtn.setIcon(hourGlass);	
	     hourGlassBtn.setBackground(Color.decode("#E4E4D7"));

	 RoundedButton rectangleShapeBtn = new RoundedButton("RECTANGLE SHAPE");
     bodyShapePanel.addShapeButton(rectangleShapeBtn);
     
	     ImageIcon rectangleShape = new ImageIcon("images/rectangle.png");
	     Image rectangleShapeImage = rectangleShape.getImage().getScaledInstance(213, 487, Image.SCALE_SMOOTH);
	     rectangleShape = new ImageIcon(rectangleShapeImage);
	     rectangleShapeBtn.setIcon(rectangleShape);
	     rectangleShapeBtn.setBackground(Color.decode("#E4E4D7"));

	     
	 RoundedButton invertedTriangleBtn = new RoundedButton("INVERTED TRIANGLE");
     bodyShapePanel.addShapeButton(invertedTriangleBtn);
     
	     ImageIcon invertedTriangle = new ImageIcon("images/inverted.png");
	     Image invertedTriangleImage = invertedTriangle.getImage().getScaledInstance(213, 487, Image.SCALE_SMOOTH);
	     invertedTriangle = new ImageIcon(invertedTriangleImage);
	     invertedTriangleBtn.setIcon(invertedTriangle);
	     invertedTriangleBtn.setBackground(Color.decode("#E4E4D7"));


     JLabel bodyShapeTitle = new JLabel(" BODY SHAPE");
     bodyShapeTitle.setFont(new Font("Tahoma", Font.BOLD, 32));
     bodyShapeTitle.setBounds(51, 43, 367, 53);
     frame.getContentPane().add(bodyShapeTitle);
     	
     centerFrame();
     frame.setVisible(true);
 }
 private void centerFrame() {
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (screenSize.width - frame.getWidth()) / 2;
	    int y = (screenSize.height - frame.getHeight()) / 2;
	    
	    frame.setLocation(x, y);
	}
 

public class FemaleBodyShape extends BodyShape {
    public FemaleBodyShape(String gender, String category) {
        super(gender, category);
        getFrame().setTitle("Female BodyShape - " + category);
    }
}

public class MaleBodyShape extends BodyShape {
    public MaleBodyShape(String gender, String category) {
        super(gender, category);
        getFrame().setTitle("Male BodyShape - " + category);
    }
}
 
 private static class BodyShapePanel extends JPanel {

     private int buttonX = 49;
     private int buttonY = 61;

     public BodyShapePanel(String gender, String category) {
         setBackground(Color.WHITE);
         setBounds(51, 195, 1426, 605);
         setLayout(null);
     }

     public void addShapeButton(JButton button) {
         button.setBounds(buttonX, buttonY, 213, 487);
         add(button);
         buttonX += 271; 
     }
 }
 
 static class RoundedButton extends JButton {
     private static final int ARC_SIZE = 15;

     public RoundedButton(String text) {
         super(text);
         setContentAreaFilled(false);
     }

     @Override
     protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, ARC_SIZE, ARC_SIZE);
         super.paintComponent(g);
     }

     @Override
     protected void paintBorder(Graphics g) {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, ARC_SIZE, ARC_SIZE);
     }
 }
}
