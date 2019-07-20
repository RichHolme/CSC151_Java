import javax.swing.*;

public class StudentOrderingNumbers {

    public static void main(String[] args) {
        WidgetViewer wv = new WidgetViewer();

        // Finally, a program that does something.  This program asks the user
        // for 3 numbers and figures out the largest, middle and smallest.

        // JLabels are similar to JTextFields, but JTextFields can be modified by
        // the user.  JLabels can't
        JLabel jlInstructions = new JLabel("Enter 3 numbers and I'll order them");
        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JTextField num3 = new JTextField(5);

        // add the initial widgets
        wv.add(jlInstructions, 10, 30, 300, 20);
        wv.add(num1, 10, 60, 50, 20);
        wv.add(num2, 10, 90, 50, 20);
        wv.add(num3, 10, 120, 50, 20);

        JButton execute = new JButton("Push me after entering the numbers");
        wv.addAndWait(execute);

        // When addAndWait returns, the user has pushed the execute JButton.
        // Hopefully the user has entered three valid numbers.

        // read the (String) contents of the JTextFields, and convert them to int
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3 = Integer.parseInt(num3.getText());

        int hi = n1;
        hi = Math.max(hi, n2);
        hi = Math.max(hi, n3);

        int lo = n1;
        lo = Math.min(lo, n2);
        lo = Math.min(lo, n3);

        int mid = n1 + n2 + n3 - hi - lo;

        JLabel hiLabel = new JLabel("highest " + hi);
        JLabel midLabel = new JLabel("middle " + mid);
        JLabel loLabel = new JLabel("lowest " + lo);

        // update the gui with our results
        wv.add(hiLabel, 10, 150, 150, 20);
        wv.add(midLabel, 10, 180, 150, 20);
        wv.add(loLabel, 10, 210, 150, 20);
    }

}
