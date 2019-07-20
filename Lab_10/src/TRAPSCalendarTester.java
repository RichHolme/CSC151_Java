
public class TRAPSCalendarTester {

	public static void main(String[] args) {
		
		Event a = new Event();
		Event b = new Event("Event1", "thePlace");
		Event c = new Event();
		c.setEventName("name");
		
		TRAPSCalendar cal = new TRAPSCalendar();
		
		cal.add(a);
		cal.add(b);
		cal.add(c);
		
		System.out.println(cal.size());
		System.out.println(cal.list());
		System.out.println(cal.get("fasdfadsf"));
		System.out.println(cal.get(cal.size()));
		System.out.println(cal.toString());
		
	}
	
}
