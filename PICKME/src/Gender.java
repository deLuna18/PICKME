import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Insets;

public class Gender implements ActionListener {

    private JFrame frame;

    public static void main(String[] args) {
        new GettingStarted();
    }

    public Gender() {
        initialize();
    
        frame.setVisible(true);
    }
    
    // Set-up the main frame
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.decode("#FFFFFF"));
        frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridBagLayout());
        
       
        
        frame.pack(); // Adjust the frame size based on the preferred size of its content
        frame.setSize(1920, 1080);
        
        centerFrame();
    }
    
    // Calculates the position to center the frame 
    // Use to center this frame to my screen
    // NOT SURE PA ARI HA NEEDED PAG RESEARCH BALIK
    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    } 
    
    // To make the button clickable 
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        Categories categories = new Categories(); // Categories Frame 
        System.out.println("Button Clicked: " + clickedButton.getText());
    }
}
