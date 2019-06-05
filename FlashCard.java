import javax.swing.*;

public class FlashCard {	
	public static void main(String[] args) {
		
        WidgetViewer wv = new WidgetViewer();
        
        // random numbers
        int randNum1 = (int)(Math.random() * 10);
        int randNum2 = (int)(Math.random() * 10);
        
        // display text 
        JLabel instructions = new JLabel("What is " + randNum1 + " times " + randNum2 + "?");
        wv.add(instructions);

        // input field
        JLabel instructions2 = new JLabel("Enter your answer here:");
        JTextField userInput= new JTextField();
        wv.add(instructions2);
        wv.add(userInput);
        
        // button
        JButton execute = new JButton("Click After Answering");
        wv.addAndWait(execute);
        
        // get input
        int userAnswer = Integer.parseInt(userInput.getText());
        System.out.println(userAnswer);
        
        // process input
        int correctAnswer = randNum1 * randNum2;
        boolean rightWrong = userAnswer == correctAnswer;
        
        // display right/wrong        
        if(rightWrong) {
        	JLabel correct = new JLabel("That's right.  Good Job!");
        	wv.add(correct, 20, 0, 250, 40);
        }else {
        	JLabel incorrect = new JLabel("Sorry, the correct answer is " + correctAnswer +".");
        	wv.add(incorrect, 20, 0, 250, 40);
        }
        
    }

}
