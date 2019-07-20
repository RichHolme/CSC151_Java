import java.awt.event.ActionEvent;
import javax.swing.*;

public class UpDown {
		
		private JButton jb1;
		private JButton jb2;
		private JLabel leftLabel;
		private JLabel rightLabel;
		
		public UpDown() {
			WidgetViewer wv = new WidgetViewer();
			
			leftLabel = new JLabel("0");
			rightLabel = new JLabel("0");
		    
			jb1 = new JButton("go up/down");
			jb2 = new JButton("go down/up");
			
			ButtonIncrementer1 action1 = new ButtonIncrementer1();
			ButtonIncrementer2 action2 = new ButtonIncrementer2();
			
			jb1.addActionListener(action1);
			jb2.addActionListener(action2);
			    
			wv.add(leftLabel, 80, 30, 150, 20);
			wv.add(rightLabel, 270, 30, 150, 20);
			wv.add(jb1, 10, 90, 150, 20);
			wv.add(jb2, 200, 90, 150, 20);
			
		}
		
		class ButtonIncrementer1 extends WidgetViewerActionEvent {
			
			public ButtonIncrementer1() {}

			@Override
			public void actionPerformed(ActionEvent e) {
				String leftLabelVal= leftLabel.getText();
				String rightLabelVal= rightLabel.getText();
				
				int rand1 = (int)(Math.random() * 11);
		        int rand2 = (int)(Math.random() * 11);
				
				int newValLeftLabel = Integer.parseInt(leftLabelVal) + rand1;
				int newValRightLabel = Integer.parseInt(rightLabelVal) - rand2;
				
				leftLabel.setText(String.valueOf(newValLeftLabel));
				rightLabel.setText(String.valueOf(newValRightLabel));
			}
			
		}
		
		class ButtonIncrementer2 extends WidgetViewerActionEvent {
			
			public ButtonIncrementer2() {}

			@Override
			public void actionPerformed(ActionEvent e) {
				String leftLabelVal= leftLabel.getText();
				String rightLabelVal= rightLabel.getText();
				
				int rand1 = (int)(Math.random() * 11);
		        int rand2 = (int)(Math.random() * 11);
				
				int newValLeftLabel = Integer.parseInt(leftLabelVal) - rand1;
				int newValRightLabel = Integer.parseInt(rightLabelVal) + rand2;
				
				leftLabel.setText(String.valueOf(newValLeftLabel));
				rightLabel.setText(String.valueOf(newValRightLabel));
			}
			
		}

}
