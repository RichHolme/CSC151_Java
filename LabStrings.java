import java.util.Scanner;

public class LabStrings {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line of text");

		String line = input.nextLine();
		
		// whitespace
		System.out.println("");
		System.out.println("1. Whitespace.");
		if(line.length() != line.trim().length()) {
			System.out.println("The original String has leading or trailing whitespace.");
		}else {
			System.out.println("The original String has no leading or trailing whitespace.");
		}
		
		// character swap
		System.out.println("");
		System.out.println("2. First 3 swapped with last 4.");
		System.out.println(line.substring(line.length() - 4) + line.substring(3, line.length() - 4) + line.substring(0, 3));
		
		// to upper case
		System.out.println("");
		System.out.println("3. String to uppercase.");
		System.out.println(line.toUpperCase());
		
		// compare to
		System.out.println("");
		System.out.println("4. Comparing lowercase results.");
		System.out.println(line.compareTo(line.toLowerCase()));
		
		// compare first & last half
		System.out.println("");
		System.out.println("5. Compare first & last half.");
		int len = line.length() / 2;
		if(line.substring(0, len).equalsIgnoreCase(line.substring(len))) {
			System.out.println("Ignoring case, first & last half are the same.");
		}else {
			System.out.println("Ignoring case, first & last half are not the same.");
		}
	}
}
