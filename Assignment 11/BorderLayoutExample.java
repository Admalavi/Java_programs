import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setLayout(new BorderLayout());

        final JTextField textField = new JTextField("Enter the number");
        JButton binary = new JButton("Binary");
        JButton octal = new JButton("Octal");
        JButton hex = new JButton("Hex");
        final JLabel result = new JLabel("Result");

        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.add(binary);
        centerPanel.add(octal);
        centerPanel.add(hex);

        frame.add(textField, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(result, BorderLayout.SOUTH);

        binary.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    result.setText("Binary: " + Integer.toBinaryString(num));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });

        octal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    result.setText("Octal: " + Integer.toOctalString(num));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });

        hex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    result.setText("Hex: " + Integer.toHexString(num));
                } catch (NumberFormatException ex) {
                    result.setText("Invalid input");
                }
            }
        });

        frame.setSize(300, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
