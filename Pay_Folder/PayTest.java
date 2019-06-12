import java.util.Scanner;
public class PayTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to know your take home pay or your monthly surplus?");
		String userInput = input.nextLine();
		
		if(userInput.equals("take home")){
			
			System.out.println("What is your hourly rate?");
			double rate = input.nextDouble();
			System.out.println("How many hours did you work this pay period?");
			double hours = input.nextDouble();
			
			System.out.println("Your take home pay is: ");
			System.out.printf("%5.2f", Pay.takeHomePay(rate,hours));
			
		}else if(userInput.equals("surplus")){
			
			System.out.println("What is your hourly rate?");
			double rate = input.nextDouble();
			System.out.println("How many hours did you work month?");
			double hours = input.nextDouble();
			
			System.out.println("Your monthly surplus is: ");
			System.out.printf("%5.2f", Pay.surplus(rate,hours));
			
		}
		
	}
	
}
