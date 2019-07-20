import java.util.ArrayList;

public class TRAPSCalendar {
	
	private ArrayList <Event> calendar = new ArrayList<Event>();
	
	public TRAPSCalendar() {}
	
	public boolean add(Event evt) {
		
		calendar.add(evt);
		
		int index = calendar.indexOf(evt);
		
		if(index > -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public Event get(int i) {
		
		if(i >= calendar.size() || i < 0) {
			return null;
		}
		
		return calendar.get(i);
	}
	
	public Event get(String name) {
		 
		for(int i = 0; i < calendar.size(); i++) {
			Event n = calendar.get(i);
			
			if(n.getEventName() != null) {
				if(n.getEventName().equals(name)) {
					return n;
				}
			}

		}
		
		return null;
	}
	
	public int size() {
		return calendar.size();
	}
	
	public ArrayList<Event> list(){
		return calendar;
	}
	
	public String toString() {
		String s = "";
		
		for(int i = 0; i < calendar.size(); i++) {
			Event n = calendar.get(i);
			s += n.toString() + "\n";
		}
		
		return s;
	}
	
}
