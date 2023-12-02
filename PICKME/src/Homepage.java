import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Homepage implements ActionListener {

    private JFrame frame;
    private Dimension screenSize;
    private JButton[] btn;

    private String[] btnText = {
            "Street Style", "Casual", "<html> Dressy <br> Casual </html>",
            "<html> Dressy <br> Casual </html>", "Semi-Formal", "Street Style",
            "Casual", "<html> Dressy <br> Casual </html>",
            "<html> Dressy <br> Casual </html>", "Semi-Formal"
    };

    public static void main(String[] args) {
        new Homepage();
    }

    public Homepage() {
        initialize();
        initializebtn();
        frame.setVisible(true);
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.decode("#F8F7F6"));
        frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
        frame.setSize(1327, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        centerFrame();
        
        JLabel txt_1 = new JLabel("CATEGORIES");
        txt_1.setFont(new Font("Tahoma", Font.BOLD, 22));
        txt_1.setBounds(65, 70, 159, 36);
        frame.getContentPane().add(txt_1);
        
        JLabel txt_2 = new JLabel("[DRESS CODE]");
        txt_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        txt_2.setBounds(65, 104, 88, 24);
        frame.getContentPane().add(txt_2);
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void initializebtn() {
        btn = new JButton[btnText.length];

        for (int i = 0; i < btnText.length; i++) {
            btn[i] = createButton(btnText[i], 186 + 245 * (i % 5), 199 + 301 * (i / 5));
            btn[i].addActionListener(this);
            frame.add(btn[i]);
        }
    }

    private JButton createButton(String buttonText, int x, int y) {
        JButton button = new JButton(buttonText);
        button.setBounds(x, y, 185, 179);
        button.setBackground(Color.LIGHT_GRAY);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Tahoma", Font.BOLD, 22));
        return button;
    }

    private void centerFrame() {
        screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        Categories category = new Categories();
        System.out.println("Button Clicked: " + clickedButton.getText());
    }
}



