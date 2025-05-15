import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample {
    static JButton[] buttons = new JButton[6]; // Moved outside main()

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            frame.add(buttons[i]);

            final int index = i; // make index effectively final
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int swapIndex = (index + 1) % 6;
                    String currentText = buttons[index].getText();
                    String temp = buttons[swapIndex].getText();
                    buttons[swapIndex].setText(currentText);
                    buttons[index].setText(temp);
                }
            });
        }

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
