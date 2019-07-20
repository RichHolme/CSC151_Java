
public class AverageCalculatorMain {
	public static void main(String[] args) {
		
		AverageCalculator calc = new AverageCalculator();
		
		calc.add(5);
		
		System.out.println("Obj 1:");
		System.out.println("Sum:" + calc.getSum());
		System.out.println("Count:" + calc.getCount());
		System.out.println("Average:" + calc.getAverage());
		
		System.out.println();
		
		AverageCalculator calc2 = new AverageCalculator();
		
		calc2.add(4);
		calc2.add(3);
		calc2.add(9);
		
		System.out.println("Obj 2:");
		System.out.println("Sum:" + calc2.getSum());
		System.out.println("Count:" + calc2.getCount());
		System.out.println("Average:" + calc2.getAverage());
	}

}
