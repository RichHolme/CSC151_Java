import java.util.Scanner;

public class StringSetTester {
	
	public static void main(String[] args) {
		

		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("How many strings will you enter? ");
		 int numStr = input.nextInt(); 
		 
		 StringSet e = new StringSet();
		 
		 System.out.println("Enter each string and press enter:");
		 input.nextLine();
		 
		 while(numStr>0){
			
			 String nextString = input.nextLine();
			 e.add(nextString);
			 numStr--;
		 }
		 
		 System.out.println(e.size());
		 System.out.println(e.numChars());
		 System.out.println(e.countStrings(5));
		 System.out.println(e.countStrings(7));
		 System.out.println(e.size());

	}

}
