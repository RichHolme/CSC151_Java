import java.util.Scanner;

public class Project_1_Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much was your car?");
		int carTotal = input.nextInt();
		
		System.out.println("What's your downpayment?");
		int downPayment = input.nextInt();
		
		System.out.println("Enter APR.");
		double apr = input.nextDouble();
		
		System.out.println("Enter loan term.");
		int term = input.nextInt();
		
		// monthly payment 
		int totalOwed = carTotal - downPayment;
		// monthlyInterest 	
		double r = apr / 12.0;
		r = r / 100;
		System.out.println(r);
		double payment = totalOwed * ( r * Math.pow((1+r) , term) ) / ( Math.pow( (1+r),term) - 1 );
		
		
		System.out.println("Here's your monthly payment.");
		System.out.println(payment);
		System.out.println("Here's how much you'll end up paying.");
		System.out.println(payment * term + downPayment);
		
	}
}
