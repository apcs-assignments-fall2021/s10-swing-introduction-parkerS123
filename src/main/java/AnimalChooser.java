import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalChooser {

    public AnimalChooser() {
        // 1. Create the frame.
        JFrame frame = new JFrame("Animal Chooser");

        // This Frame is using BorderLayout
        frame.setLayout(new BorderLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame.
        // This label will be replaced by an image later
        JLabel label1 = new JLabel("");
        frame.add(label1);

        JButton button1 = new JButton("Red Panda");
        frame.add(button1, BorderLayout.SOUTH);

        JButton button2 = new JButton("Baby Seal");
        frame.add(button2, BorderLayout.NORTH);

        JButton button3 = new JButton("Pippen");
        frame.add(button3, BorderLayout.WEST);

        JButton button4 = new JButton("Penguin");
        frame.add(button4, BorderLayout.EAST);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ImageIcon icon = new ImageIcon("images/red_panda.jpg");
                label1.setIcon(icon);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ImageIcon icon = new ImageIcon("images/seal.jpg");
                label1.setIcon(icon);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ImageIcon icon = new ImageIcon("images/Pippen.png");
                label1.setIcon(icon);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                ImageIcon icon = new ImageIcon("images/img.png");
                label1.setIcon(icon);
            }
        });

        // 4. Size the frame.
        frame.setSize(900, 500);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        AnimalChooser x = new AnimalChooser();
    }
}
