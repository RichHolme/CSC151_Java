import javax.swing.*;

public class ChooseOperation {
	public static void main(String[] args) {
		
		WidgetViewer wv = new WidgetViewer();
        
        // random numbers
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;

        // display text 
        JLabel displayX = new JLabel("Random number x: " + x);
        JLabel displayY = new JLabel("Random number y: " + y);
        wv.add(displayX);
        wv.add(displayY);
        
        // input field
        JLabel instructions = new JLabel("Enter an operation number.");
        JTextField userAnswer = new JTextField();
        wv.add(instructions);
        wv.add(userAnswer);
        
        // button
        JButton execute = new JButton("Press here when you've entered your operation.");
        wv.addAndWait(execute);
        
        // get input
        int operation = Integer.parseInt(userAnswer.getText());
        
        // process input
        int result = 0; 
        float resultFloat = 0;
        boolean varSwitch = false;
        
        if(operation >= 1 && operation <= 10) {
        	result = x + y;
        }else if (operation != 0 && operation % 4 == 0) {
        	result = x - y;
        }else if (operation != 0 && operation % 5 == 0) {
        	result = x / y;
        }else if (operation != 0 && operation % 2 == 0) {
        	resultFloat = (float)x / y;
        	varSwitch = true;
        }else {
        	result = x * y;
        }
 
        // display result         
        if(!varSwitch) {
        	JLabel finalAnswer = new JLabel("The result is: " + result);
        	wv.add(finalAnswer, 20, 0, 250, 40);
        }else {
        	JLabel finalAnswer = new JLabel("The result is: " + resultFloat);
        	wv.add(finalAnswer, 20, 0, 250, 40);
        }
        
	}
}
