import java.util.Scanner;

public class MakeYourSchecdule {
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// full or part time		
		System.out.println("Are you a full time or part time student? (full/part).");
		String fullOrPart = input.nextLine();
		
		// total # of classes		
		System.out.println("How many classes are required to complete your degree?");
		String howManyClasses = input.nextLine();
		int howManyClassesInt = Integer.parseInt(howManyClasses.trim());
		
		// take summer classes?		
		System.out.println("Are you willing to take summer courses? (yes/no)");
		String summer = input.nextLine();
		
		// if part time
		int maxClassesInt = 0;
		if(fullOrPart.equals("part")){
			System.out.println("What is the maximum number of classes you can take during the spring & fall semesters?");
			String maxClasses = input.nextLine();
			maxClassesInt = Integer.parseInt(maxClasses.trim()); 
		}
		
		// get summer class #		
		int maxSummerClassesInt = 0;
		int summerSession = 0;
		if(summer.equals("yes")){
			System.out.println("What is the maximum number of classes you can take during the summer semester?");
			String maxSummerClasses = input.nextLine();
			maxSummerClassesInt = Integer.parseInt(maxSummerClasses.trim());
			summerSession = maxSummerClassesInt;
		}
		
		// print schedule 
		System.out.println("Here's your schedule:");
		System.out.println("");
		
		// for full time		
		int fullSession = 5;
		
		// for part time		
		if(fullOrPart.equals("part")){
			fullSession = maxClassesInt;
		}
		
		int years = 0;
		
		while (howManyClassesInt > 0) {
			
			years++;
			// get last digit of number			
			int compare = years % 10;
			
			String extension;
			
			// determine correct suffix 			
			if(compare == 1){
				extension = "st";
			}else if( compare == 2){
				extension = "nd";
			}else if( compare == 3){
				extension = "rd";
			}else{
				extension = "th";
			}
			
			System.out.println(years + extension + " year");
			System.out.println("fall | spring | summer");
			
			// take away 2 full semesters 			
			howManyClassesInt -= fullSession * 2;
			
			// if courses still left			
			if(howManyClassesInt >= 0){
				System.out.print( fullSession + "    | " + fullSession + "      |");
			}else{ // 2 full semesters is greater than courses left
				
				// determine how many courses are left				
				howManyClassesInt += fullSession * 2;
				int fullSessionCombo = fullSession * 2;
				int diff = fullSessionCombo - howManyClassesInt;
				fullSessionCombo -= diff;
				
				// if courses left greater than 1 semester 				
				if(fullSessionCombo > fullSession){
					
					int displayDiff = fullSession - diff;
					System.out.print( fullSession + "    | " + displayDiff + "      | 0");
					howManyClassesInt = 0;
					
				}else{ // else less than 1 semester of courses left
					
					int displayDiff = fullSession * 2 - diff;
					
					// if exactly 1 semester left					
					if(displayDiff == 0){
						displayDiff = fullSession;
					}
					
					System.out.print( displayDiff+ "    | 0      | 0");
				}
				
				// break while loop	
				break;
			}
			
			// take away 1 summer semester 
			howManyClassesInt -= summerSession;
			
			// if courses still left
			if(howManyClassesInt >= 0){
				
				System.out.println(" " + summerSession);
				System.out.println("");
				
			}else{// summer semester is greater than courses left
				
				// determine how many courses are left	
				howManyClassesInt += summerSession;
				int diff = summerSession - howManyClassesInt;
				summerSession -= diff;
				
				System.out.println(" " + summerSession);
				System.out.println("");
				
				// break while loop				
				howManyClassesInt = 0;
				
			}
			
		}
		
	}
	
}
