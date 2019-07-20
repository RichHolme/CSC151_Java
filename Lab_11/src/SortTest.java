
public class SortTest {
	
	public static void main(String[] args) {
		
		Event a = new Event("g", "thing", "05/11/2019", 9, 12, 25);
		Event b = new Event("k", "thePlace", "05/11/2019", 20, 20, 1);
		Event c = new Event("r", "thing", "05/11/2019", 19, 23, 30);
		Event d = new Event("v", "thePlace", "05/11/2019", 18, 20, 11);
		
		TRAPSCalendar cal = new TRAPSCalendar();

		cal.add(a);
		cal.add(b);
		cal.add(c);
		cal.add(d);
	
		System.out.println(cal.sortByName());
		System.out.println(cal.sortByProfit());
		System.out.println(cal.get(0));
		System.out.println(cal.get(2));
		
	}

}
