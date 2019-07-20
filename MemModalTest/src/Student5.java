import javax.swing.*;

public class Student5 {

    public static void main(String[] args) {
        WidgetViewer wv = new WidgetViewer();

        // There is another way to make your program wait for user
        // input--addButtonAndWait.
        // It's a convenience method.  It works like addAndWait, but 
        // WidgetViewer will create the button for you.
        // we create a button for the user to click, add it to the
        // gui, and wait for the user to Do His Thing
        // The method addAndWait will not return until the user has clicked the button.
        // This program doesn't do anything interesting afterward, but
        // it does print a message to the console so we can see that things
        // do work as advertised.
        wv.addButtonAndWait("waiting for you: click here and see console output");

        // put a msg on the console showing when the button was pushed
        System.out.println("button pushed");
    }

}
