import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        final JLabel label = new JLabel("Enter a number:");
        final JTextField textField = new JTextField();
        final JButton button = new JButton("Reverse");
        final JLabel resultLabel = new JLabel("Reversed number will appear here");

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(textField.getText());
                    int reversed = 0;
                    while (number != 0) {
                        int digit = number % 10;
                        reversed = reversed * 10 + digit;
                        number /= 10;
                    }
                    resultLabel.setText("Reversed number: " + reversed);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid integer.");
                }
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
