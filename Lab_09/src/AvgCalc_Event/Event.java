
public class Event {
	
	String name;
	String venue;
	String eventDate;
	int eventTicketsSold = 0;
	int eventTicketPrice = 0;
	int eventOverhead = 0;
	
	Event() {}
	
	Event(String eventName, String eventVenue) {
		name = eventName;
		venue = eventVenue;
	}
	
	Event(String eventName, String eventVenue, String date, int ticketsSold, int ticketPrice, int overhead) {
		name = eventName;
		venue = eventVenue;
		eventDate = date;
		eventTicketsSold = ticketsSold;
		eventTicketPrice = ticketPrice;
		eventOverhead = overhead;
	}
	
	public boolean sellTickets​(int numberOfTickets) {
		if(numberOfTickets > 0) {
			eventTicketsSold += numberOfTickets;
			return true;
		}else {
			return false;
		}
	}
	
	public int getProfit() {
		return eventTicketsSold * eventTicketPrice - eventOverhead;
	}
	
	public int getBreakEvenPoint() {
		
		int total = 0;
		
		if(eventTicketPrice > 0) {
			total = eventOverhead / eventTicketPrice;
		}
		
		if(eventTicketPrice * total >= eventOverhead) {
			return total;
		}else {
			return total + 1;
		}
		
		
	}
	
	public int compareName​(Event other) {
		return name.compareTo(other.getEventName());
	}
	
	public int compareDate​(Event other) {
		return eventDate.compareTo(other.getDate());
	}
	
	public int compareProfit​(Event other) {
		int profit = this.getProfit();
		return profit - other.getProfit();
	}
	
	public String getEventName(){
		return name;
	}
	
	public void setEventName​(String eventName) {
		name = eventName;
	}
	
	public String getEventVenue(){
		return venue;
	}
	
	public void setEventVenue​(String eventVenue) {
		venue = eventVenue;
	}
	
	public int getTicketsSold() {
		return eventTicketsSold;
	}
	
	public void setTicketsSold​(int ticketsSold) {
		if(ticketsSold > 0) {
			eventTicketsSold = ticketsSold;
		}
	}
	
	public int getTicketPrice() {
		return eventTicketPrice;
	}
	
	public void setTicketPrice​(int ticketPrice) {
		eventTicketPrice = ticketPrice;
	}
	
	public int getOverhead() {
		return eventOverhead;
	}
	
	public void setOverhead​(int overhead) {
		eventOverhead = overhead;
	}
	
	public String getDate(){
		return eventDate;
	}
	
	public void setDate​(String date) {
		eventDate = date;
	}
	
	public String toString(){
		
		return "Event name: " + name + ", event venue: " + venue + ", event date " + eventDate + ", # tickets sold: " + eventTicketsSold + 
				", ticket price: " + eventTicketPrice + ", overhead: " + eventOverhead + ", profit: " + getProfit() + ", break even point: "
				+ getBreakEvenPoint();
	}
	
}
