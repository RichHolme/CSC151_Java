import java.util.Scanner;

public class PurseDialog {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int k = 1;
		
		Purse Sally = new Purse();
		Purse Sophie = new Purse();
		
		while(k == 1) {
			
			System.out.println("Enter 1 for Sophie, 2 for Sally, or 0 to exit:");
			int person = input.nextInt();
			
			if(person == 1 || person == 2) {
				
				System.out.println("Enter 1 to give pence, 2 to give shillings, 3 to query her purse:");
				int purse = input.nextInt();
				
				if(purse == 3) {
					
					if(person == 1) {
						System.out.println(Sophie.getPurse());
					}else if(person == 2) {
						System.out.println(Sally.getPurse());
					}
					
					
				}else if(purse == 1) {
					
					System.out.println("Enter the pence to give:");
					int amount = input.nextInt();
					
					if(person == 1) {
						Sophie.addPence(amount);
					}else if(person == 2) {
						Sally.addPence(amount);
					}
					
					
				}else if(purse == 2) {
					
					System.out.println("Enter the shillings to give:");
					int amount = input.nextInt();
					
					if(person == 1) {
						Sophie.addShilling(amount);
					}else if(person == 2) {
						Sally.addShilling(amount);
					}

					
				}
				
			}else if(person == 0) {
				k = person;
			}
			
		}
		
		
	}

}
