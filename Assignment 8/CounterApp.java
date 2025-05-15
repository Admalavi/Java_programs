import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 5, 5, 5));

        JLabel label = new JLabel("Counter", SwingConstants.CENTER);
        final JTextField counterField = new JTextField("0");
        counterField.setEditable(false);
        final JButton countUpButton = new JButton("Count Up");
        final JButton countDownButton = new JButton("Count Down");
        final JButton resetButton = new JButton("Reset");

        // Action Listeners
        countUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(counterField.getText());
                count++;
                counterField.setText(String.valueOf(count));
            }
        });

        countDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(counterField.getText());
                count--;
                counterField.setText(String.valueOf(count));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counterField.setText("0");
            }
        });

        panel.add(label);
        panel.add(counterField);
        panel.add(countUpButton);
        panel.add(countDownButton);
        panel.add(resetButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
