import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private int counter = 0;

    public GUI() {

        frame = new JFrame();

        button = new JButton("Click Me!");
        label = new JLabel("Number of clicks: 0   ");
        button.addActionListener(this);


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(400,400,200,400));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our Gui");
        frame.pack();
        frame.setVisible(true);



    }

    public static void main(String[] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter ++;
        label.setText("Number of clicks: " + counter );
    }
}
