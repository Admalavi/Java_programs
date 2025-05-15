import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="FactorialApplet.class" width=400 height=200></applet>
*/

public class FactorialApplet extends Applet implements ActionListener {
    TextField input;
    Label result;
    Button compute;

    public void init() {
        input = new TextField(10);
        compute = new Button("Compute Factorial");
        result = new Label("Result will appear here");

        add(new Label("Enter a number:"));
        add(input);
        add(compute);
        add(result);

        compute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(input.getText());
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            result.setText("Factorial: " + fact);
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }
}
