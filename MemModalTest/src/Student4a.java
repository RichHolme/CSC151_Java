import javax.swing.*;

public class Student4a {

    public static void main(String[] args) throws InterruptedException {
        WidgetViewer wv = new WidgetViewer();

        // we need WidgetViewer to allow for user input.  This is how
        // we create a button for the user to click, add it to the
        // gui, and wait for the user to Do His Thing
        // The method addAndWait will not return until the user has clicked the button.
        // This program doesn't do anything interesting afterward, but
        // it does print a message to the console so we can see that things
        // do work as advertised.
        JButton jb = new JButton("waiting for you now: click this button and see console output");
        wv.addAndWait(jb);
        
        // You'll notice that addAndWait puts the JButton at the top left of the JFrame.
        // You will want to allow for that when you lay out your own widgets.
        // You'll also notice that we make the JButton disappear after you've click it.
        // It's of no use to us anymore, so we zapped it.

        // put a msg on the console showing when the button was pushed
        System.out.println("button pushed");
    }

}
