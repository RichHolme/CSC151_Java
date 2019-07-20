import java.util.Scanner;

public class MakeUpYourMind {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are your parents visiting? Enter 1 for yes and 0 for no: ");
		int parentsInput = input.nextInt();
		
		boolean parents = true;
		
		if (parentsInput == 0){
			parents = !parents;
		} 
		
		System.out.println("Is the weather good? Enter 1 for yes and 0 for no: ");
		int weatherInput = input.nextInt();
		
		boolean weather = true;
		
		if (weatherInput == 0){
			weather = !weather;
		}
		
		System.out.println("Are you rich or poor? Enter 1 for yes and 0 for no: ");
		int richOrPoorInput = input.nextInt();
		
		boolean richOrPoor = true;
		
		if (richOrPoorInput == 0){
			richOrPoor = !richOrPoor;
		}
		
		// if my parents are visiting, we'll go to the cinema
		if(parents) {
			System.out.println("We're going to the cinema!");
			
		// If they're not visiting and the weather's good and I'm rich, then I'll go shopping			
		}else if (!parents && weather && richOrPoor) {
			System.out.println("It's time to go shopping!");
			
		// If they're not visiting, and the weather's good and I'm poor, then I will go to the cinema			
		}else if (!parents && weather && !richOrPoor) {
			System.out.println("I'm going to the cinema!");
			
		// If they're not visiting and the weather is bad and I'm rich, I'll go to the cinema			
		}else if (!parents && !weather && richOrPoor) {
			System.out.println("I'm going to the cinema!");
			
		//  If they're not visiting and the weather is bad and I'm poor, I'll stay in. 			
		}else if (!parents && !weather && !richOrPoor) {
			System.out.println("I'll stay in...");
		}
	}
}
