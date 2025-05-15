// GenderSelectionBoxLayout.java
import javax.swing.*;
import java.awt.event.*;

public class GenderSelectionBoxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical layout
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel label = new JLabel("Select your gender:");
        final JRadioButton male = new JRadioButton("Male");
        final JRadioButton female = new JRadioButton("Female");
        final JRadioButton other = new JRadioButton("Other");
        JButton button = new JButton("Submit");
        final JLabel resultLabel = new JLabel("Selected gender will appear here");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        // Ensure proper alignment
        label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        male.setAlignmentX(JRadioButton.LEFT_ALIGNMENT);
        female.setAlignmentX(JRadioButton.LEFT_ALIGNMENT);
        other.setAlignmentX(JRadioButton.LEFT_ALIGNMENT);
        button.setAlignmentX(JButton.LEFT_ALIGNMENT);
        resultLabel.setAlignmentX(JLabel.LEFT_ALIGNMENT);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    resultLabel.setText("Selected Gender: Male");
                } else if (female.isSelected()) {
                    resultLabel.setText("Selected Gender: Female");
                } else if (other.isSelected()) {
                    resultLabel.setText("Selected Gender: Other");
                } else {
                    resultLabel.setText("Please select a gender.");
                }
            }
        });

        // Add components to panel
        panel.add(label);
        panel.add(Box.createVerticalStrut(10));
        panel.add(male);
        panel.add(female);
        panel.add(other);
        panel.add(Box.createVerticalStrut(15));
        panel.add(button);
        panel.add(Box.createVerticalStrut(15));
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
