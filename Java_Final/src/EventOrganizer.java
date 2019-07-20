import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class EventOrganizer {
	
	private WidgetViewer wv = new WidgetViewer(950, 700);
	private TRAPSCalendar cal = new TRAPSCalendar();
	
	private JLabel nameLabel;
	private JTextField nameInput;
	private JLabel venueLabel;
	private JTextField venueInput;
	private JLabel dateLabel;
	private JTextField dateInput;
	private JLabel ticketsLabel;
	private JTextField ticketsInput;
	private JLabel priceLabel;
	private JTextField priceInput;
	private JLabel costLabel;
	private JTextField costInput;
	
	private JButton cEvent;
	private JButton sTicket;
	private JButton reset;
	private JButton sName;
	private JButton sProfit;
	private JButton bBones;
	private JButton auto;
	private JButton clear;
	private JButton resetEvent;
	
	private JTextArea outputStr;
	
	private int unknown = 0;
	
	public EventOrganizer() {
		
		nameLabel = new JLabel("Event Name");
		nameInput = new JTextField(0);
		
		venueLabel = new JLabel("Event Venue");
		venueInput = new JTextField(0);
		
		dateLabel = new JLabel("Event Date");
		dateInput = new JTextField(0);
		
		ticketsLabel = new JLabel("Tickets Sold");
		ticketsInput = new JTextField(0);
		
		priceLabel = new JLabel("Ticket Price");
		priceInput = new JTextField(0);
		
		costLabel = new JLabel("Overhead Costs");
		costInput = new JTextField(0);
		
		AddEvent addEvent = new AddEvent();
		cEvent = new JButton("Create an Event");
		cEvent.addActionListener(addEvent);
		
		SellTicket sellTicket = new SellTicket();
		sTicket = new JButton("Sell Tickets");
		sTicket.addActionListener(sellTicket);
		
		Reset resetAction = new Reset();
		reset = new JButton("Reset List");
		reset.addActionListener(resetAction);
		
		SortName sortName = new SortName();
		sName = new JButton("Sort by Name");
		sName.addActionListener(sortName);
		
		SortProfit sortProfit = new SortProfit();
		sProfit = new JButton("Sort by Profit");
		sProfit.addActionListener(sortProfit);
		
		BareBones bareBones = new BareBones();
		bBones = new JButton("Bare Bones");
		bBones.addActionListener(bareBones);
		
		AutoComplete ac = new AutoComplete();
		auto = new JButton("AutoComplete");
		auto.addActionListener(ac);
		
		Clear clearList = new Clear();
		clear = new JButton("Clear Calendar");
		clear.addActionListener(clearList);
		
		ResetEvent resetE = new ResetEvent();
		resetEvent = new JButton("Reset Event");
		resetEvent.addActionListener(resetE);
		
		outputStr = new JTextArea();
		
		wv.add(nameLabel, 10, 30, 150, 20);
		wv.add(nameInput, 10, 50, 150, 20);
		
		wv.add(venueLabel, 10, 70, 150, 20);
		wv.add(venueInput, 10, 90, 150, 20);
		
		wv.add(dateLabel, 10, 110, 150, 20);
		wv.add(dateInput, 10, 130, 150, 20);
		
		wv.add(ticketsLabel, 10, 150, 150, 20);
		wv.add(ticketsInput, 10, 170, 150, 20);
		
		wv.add(priceLabel, 10, 190, 150, 20);
		wv.add(priceInput, 10, 210, 150, 20);
		
		wv.add(costLabel, 10, 230, 150, 20);
		wv.add(costInput, 10, 250, 150, 20);
		
		wv.add(cEvent, 10, 280, 150, 20);
		wv.add(sTicket, 10, 300, 150, 20);
		wv.add(reset, 10, 320, 150, 20);
		wv.add(sName, 10, 340, 150, 20);
		wv.add(sProfit, 10, 360, 150, 20);
		wv.add(bBones, 10, 380, 150, 20);
		wv.add(auto, 10, 400, 150, 20);
		wv.add(clear, 10, 420, 150, 20);
		wv.add(resetEvent, 10, 440, 150, 20);
		
		wv.add(outputStr, 10, 490, 900, 100);
		
	}
	
	private void cleanData() {
		
		nameInput.setText("");
		venueInput.setText("");
		dateInput.setText("");
		ticketsInput.setText("");
		priceInput.setText("");
		costInput.setText("");
		
	} 
	
	private boolean exists() {
		
		ArrayList <Event> temp = cal.list();
		
		for(int i = 0; i < temp.size(); i++) {
			if(cal.get(i).getEventName().equals(nameInput.getText())) {
				return true;
			}
		}
		
		return false;
		
	}
	
	private boolean checkInts() {
		
		if(!ticketsInput.getText().equals("")) {
			try {
				int a = Integer.parseInt(ticketsInput.getText());
			}catch (NumberFormatException e) { 
				return false;
	        }
		}
		
		if(!priceInput.getText().equals("")) {
			try {
				int a = Integer.parseInt(priceInput.getText());
			}catch (NumberFormatException e) { 
				return false;
	        }
		}
		
		if(!costInput.getText().equals("")) {
			try {
				int a = Integer.parseInt(costInput.getText());
			}catch (NumberFormatException e) { 
				return false;
	        }
		}
		
		return true;
		
	}
	
	private void autoComplete(int i) {
		
		if(checkInts()) {
			
			String n = nameInput.getText().equals("")? "unknown" + unknown++ : nameInput.getText();
			String v = venueInput.getText().equals("")? "unknown" : venueInput.getText();
			String d = dateInput.getText().equals("")? "unknown" : dateInput.getText();
			int t = ticketsInput.getText().equals("")? 0 : Integer.parseInt(ticketsInput.getText());
			int p = priceInput.getText().equals("")? 0 : Integer.parseInt(priceInput.getText());
			int c = costInput.getText().equals("")? 0 : Integer.parseInt(costInput.getText());
			
			Event newEvent = new Event(n, v, d, t, p, c);
	
			cleanData();
			
			if(i >= 0) {
				ArrayList <Event> temp = cal.list();
				temp.add(i, newEvent);
			}else {
				cal.add(newEvent);
			}
			
			outputStr.setText(cal.toString());
		
		}else {
			outputStr.setText("Must use int values.");
		}
	
	}
	
	class AddEvent extends WidgetViewerActionEvent {
			
		public AddEvent() {}
		
		private boolean checkVals() {
			
			if(nameInput.getText().equals("") || venueInput.getText().equals("") || 
			   dateInput.getText().equals("") || ticketsInput.getText().equals("") ||
		       priceInput.getText().equals("") || costInput.getText().contentEquals("")) {
				return false;
			}else {
				return true;
			}
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(checkVals() && checkInts()) {
				Event newEvent = new Event(nameInput.getText(), venueInput.getText(), dateInput.getText(), 
						Integer.parseInt(ticketsInput.getText()), Integer.parseInt(priceInput.getText()), 
						Integer.parseInt(costInput.getText()));
				
				cleanData();
				
				cal.add(newEvent);
				outputStr.setText(cal.toString());
			}else if(!checkVals()){
				outputStr.setText("Please enter a value for every input field.");
			}else if(!checkInts()) {
				outputStr.setText("Must use int values.");
			}
		}
			
	}
	
	class SellTicket extends WidgetViewerActionEvent {
		
		public SellTicket() {}
		
		private String checkVals() {
			
			if(nameInput.getText().equals("")) {
				return "name";
			}else if(ticketsInput.getText().equals("")){
				return "ticket string";
			}else {
				return "pass";
			}
		}
		
		private boolean checkInt() {
			try {
				int ticket = Integer.parseInt(ticketsInput.getText());
			}catch (NumberFormatException e){  
			     return false;
			}
			
			return true;
		}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String check = checkVals();
			
			if(check.equals("name")) {
				outputStr.setText("Please enter a name for the event.");
			}else if(check.equals("ticket string")) {
				outputStr.setText("Please enter the amount of tickets to sell.");
			}else if(check.equals("pass")) {
				
				if(checkInt()) {
					Event myEvent = cal.get(nameInput.getText());
					
					if(exists()) {
						myEvent.sellTickets(Integer.parseInt(ticketsInput.getText()));
						
						cleanData();
							
						outputStr.setText(cal.toString());
					}else {
						outputStr.setText("An event with this name does not exist.");
					}
					
				}else {
					outputStr.setText("Must use int values.");
				}
				
			}
		}
			
	}
	
	class Reset extends WidgetViewerActionEvent {
		
		public Reset() {}
	
		@Override
		public void actionPerformed(ActionEvent e) {
				
			cleanData();
				
			outputStr.setText(cal.toString());
		}
			
	}
	
	class SortName extends WidgetViewerActionEvent {
		
		public SortName() {}
	
		@Override
		public void actionPerformed(ActionEvent e) {
				
			cleanData();
			
			ArrayList <Event> calCopy = cal.sortByName();
			String s = "";
			
			for(int i = 0; i < calCopy.size(); i++) {
				s += calCopy.get(i) + "\n";
			}
			
			outputStr.setText(s);
		}
			
	}
	
	class SortProfit extends WidgetViewerActionEvent {
		
		public SortProfit() {}
	
		@Override
		public void actionPerformed(ActionEvent e) {
				
			cleanData();
			
			ArrayList <Event> calCopy = cal.sortByProfit();
	
			String s = "";
			
			for(int i = 0; i < calCopy.size(); i++) {
				s += calCopy.get(i) + "\n";
			}
			
			outputStr.setText(s);
		}
			
	}
	
	class BareBones extends WidgetViewerActionEvent {
		
		public BareBones() {}
	
		@Override
		public void actionPerformed(ActionEvent e) {
				
			cleanData();
				
			String s = "";
			
			for(int i = 0; i < cal.size(); i++) {
				Event temp = cal.get(i);
				String tempString = "Event Name: " + temp.getEventName() + " Event Venue: " + temp.getEventVenue() 
				+" Event Date: "+ temp.getDate() +" Event Profit: "+ temp.getProfit();
				s += tempString + "\n";
			}
			
			outputStr.setText(s);
		}
			
	}
	
	class AutoComplete extends WidgetViewerActionEvent {
		
		public AutoComplete() {}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			autoComplete(-1);
		}
			
	}
	
	class Clear extends WidgetViewerActionEvent {
		
		public Clear() {}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			
			cleanData();
			
			ArrayList <Event> calRemove = cal.list();
			calRemove.clear();
			
			unknown = 0;
			
			outputStr.setText(cal.toString());
			
		}
			
	}
	
	class ResetEvent extends WidgetViewerActionEvent {
		
		public ResetEvent() {}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(exists() && checkInts()) {
				
				ArrayList <Event> temp = cal.list();
				
				int i = temp.indexOf(cal.get(nameInput.getText()));
				temp.remove(i);
				
				autoComplete(i);

			}else if (!checkInts()){
				outputStr.setText("Must use ints.");
			}else {
				outputStr.setText("An event with this name does not exist.");
			}
			
		}
			
	}

}
