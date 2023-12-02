import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

public class Categories {

    private JFrame frame;

    public Categories() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
		frame.setBounds(20, 20, 1327, 800);
        frame.getContentPane().setBackground(Color.decode("#F8F7F6")); 
		frame.getContentPane().setFont(new Font("Tahoma",Font.PLAIN,15));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

    }
}
