
public class Pay{
	
	public static void main(String[] args) {}
	
	public static double takeHomePay( double rate, double hours){
		
		double total = rate * hours;
		
		double tax = total * .219;
		
		total = total - tax;
		
		return total;
		
	}
	
	public static double surplus( double rate, double hours){
		
		double total = rate * hours;
		
		double tax = total * .219;
		
		total = total - tax;
		
		return total - 1780;
		
	}

}
