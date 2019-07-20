import java.awt.event.ActionEvent;
import javax.swing.*;

public class StringAnalysis {
	
	StringSet sSet;
	JTextField inputStr;
	JLabel numStr;
	JLabel numChar;
	
	public StringAnalysis() {
		WidgetViewer wv = new WidgetViewer();
		
		sSet = new StringSet();
		JLabel prompt = new JLabel("Enter a String:");
		inputStr = new JTextField(0);
		JButton pushMe = new JButton("Push to include String");
		numStr = new JLabel("Number of Srtrings: 0");
		numChar = new JLabel("Number of Characters: 0");
		
		Inner action = new Inner();
		pushMe.addActionListener(action);
		inputStr.addActionListener(action);
		    
		wv.add(prompt, 10, 30, 150, 20);
		wv.add(inputStr, 100, 30, 150, 20);
		wv.add(pushMe, 260, 30, 200, 20);
		wv.add(numStr, 10, 60, 150, 20);
		wv.add(numChar, 150, 60, 150, 20);
		
	}
	
	class Inner extends WidgetViewerActionEvent {
		
		public Inner() {}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			sSet.add(inputStr.getText());
			inputStr.setText("");
			
			numStr.setText("Number of Strings: " + sSet.size());
			numChar.setText("Number of Characters: " + sSet.numChars());
		}
		
	}

}
