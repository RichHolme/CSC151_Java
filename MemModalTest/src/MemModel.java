import javax.swing.JButton;
import javax.swing.JTextField;

public class MemModel {

	public static void main(String[] args) {
		WidgetViewer wv = new WidgetViewer();
		
		JTextField j0 = new JTextField("Change Me");
		JButton pushMe = new JButton("push me");
		wv.add(j0, 10, 30, 150, 20);
		wv.addAndWait(pushMe);
		
		String j0Text = j0.getText();
		
		JTextField j1 = new JTextField(j0Text);
		
		JTextField j2;
		j2 = j1;
		j2.setText("resistance is futile");
		
		wv.add(j1, 110, 130, 150, 50);
	}

}
