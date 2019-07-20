
public class EventTester {

	public static void main(String[] args) {
		Event e = new Event();
		
		e.setDate​("2019-01-02");
		e.setEventName​("name");
		e.setEventVenue​("ven");
		e.setOverhead​(11);
		e.setTicketPrice​(8);
		e.setTicketsSold​(16);
		e.setTicketsSold​(0);
		e.sellTickets​(-5);
		
		System.out.println("e event:");
		System.out.println();

		System.out.println(e.getEventName());
		System.out.println(e.getDate());
		System.out.println(e.getEventVenue());
		System.out.println(e.getOverhead());
		System.out.println(e.getTicketPrice());
		System.out.println(e.getTicketsSold());
		System.out.println(e.getProfit());
		System.out.println(e.getBreakEvenPoint());
		
		System.out.println();
		System.out.println("f event:");
		System.out.println();
		
		Event f = new Event("party", "venue");
		System.out.println(f.getEventName());
		System.out.println(f.getEventVenue());
		
		System.out.println();
		System.out.println("g event:");
		System.out.println();
		
		Event g = new Event("bday2", "bobAndJane2", "2019-01-03", 13, 22, 112);
		
		System.out.println(g.getEventName());
		System.out.println(g.getEventVenue());
		System.out.println(g.getDate());
		System.out.println(g.getTicketPrice());
		System.out.println(g.getTicketsSold());
		System.out.println(g.getOverhead());
		System.out.println(g.getProfit());
		System.out.println(g.getBreakEvenPoint());
		System.out.println(g.sellTickets​(6));
		System.out.println(g.getProfit());
		
		System.out.println();
		System.out.println("Compare:");
		System.out.println();
		
		System.out.println(e.compareDate​(g));
		System.out.println(e.compareName​(f));
		System.out.println(f.compareName​(e));
		System.out.println(e.compareName​(e));
		System.out.println(g.compareProfit​(e));
		System.out.println(e.compareProfit​(g));
		System.out.println(g.compareProfit​(g));
		
		System.out.println();
		System.out.println("To String:");
		System.out.println();
		
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(g.toString());
		
	}
	
}
