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
	
	public ArrayList sortByName() {
		
		ArrayList <Event> calendarCopy = new ArrayList<Event>();
		
		for(int i = 0; i < calendar.size(); i++) {
			calendarCopy.add(calendar.get(i));
		}
		
		
		for (int i = 0; i < calendarCopy.size(); i++) {

            int holder = i;
            
            for (int j = i; j < calendarCopy.size(); j++) {
                if (calendarCopy.get(j).getEventName().compareTo(calendarCopy.get(holder).getEventName()) < 0)
                    holder = j;
            }
 
            Event min = calendarCopy.get(holder);
            calendarCopy.set(holder, calendarCopy.get(i));
            calendarCopy.set(i, min);
        }
		
		return calendarCopy;
	
	}
	
	public ArrayList sortByProfit() {
		
		ArrayList <Event> calendarCopy = new ArrayList<Event>();
		
		for(int i = 0; i < calendar.size(); i++) {
			calendarCopy.add(calendar.get(i));
		}
		
		for (int i = 0; i < calendarCopy.size(); i++) {

            int holder = i;
            
            for (int j = i; j < calendarCopy.size(); j++) {
                if (calendarCopy.get(j).getProfit() < calendarCopy.get(holder).getProfit())
                    holder = j;
            }
 
            Event min = calendarCopy.get(holder);
            calendarCopy.set(holder, calendarCopy.get(i));
            calendarCopy.set(i, min);
        }
		
		return calendarCopy;
		
	}
	
}
