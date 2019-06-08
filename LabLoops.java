import java.util.Scanner;

public class LabLoops {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 & 9 (inclusive)");
		
		int lines = input.nextInt();
		int spaces = lines;
		
		int format = 0;
		
		// get correct offset based on input		
		if(lines > 4) {
			format = lines - 3;
		}

		for(int i = 0; i < lines; i++) {
			
			// left side padding with first number			
			if(i < 4) { 
				System.out.printf("%"+((3*spaces)+format)+"d", (int)Math.pow(i+1, 2));
			}else {
				System.out.printf("%"+(4*spaces)+"d", (int)Math.pow(i+1, 2));
			}
		
			for(int k = 0, j = i; k < i; k++,j--){
				
				// display each number with correct padding				
				if(j < 4)
					System.out.printf("%3d", (int)Math.pow(j, 2));
				else {
					System.out.printf("%4d", (int)Math.pow(j, 2));
				}
		    }
			
		    System.out.println("");
		    spaces--;
		}
	}
}
