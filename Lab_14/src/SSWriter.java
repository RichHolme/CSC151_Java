import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class SSWriter {
	public static void main(String[] args) throws java.io.IOException {
		
		String[] activities = {"Lab", "REVEL", "Midterm", "Project", "Final"};
		String[] calcs = {"=B1*C1/100", "=B2*C2/100",  "=B3*C3/100", "=B4*C4/100", "=B5*C5/100"};
		int[] weights = {25, 25, 20, 15, 15};
		
		File myFile = new File("MyGrades.csv");
		 
		Scanner input = new Scanner(System.in);
		
		try (
				PrintWriter output = new PrintWriter(myFile);
			    
			) {
			      
				for(int i = 0; i < activities.length; i++) {
					System.out.println("Enter "+activities[i]+" average in percent:");
					int answer = input.nextInt();
					
					SSRow row = new SSRow(activities[i],answer,weights[i],calcs[i]);
					
					output.println(row.toString());
				}
				
				SSRow avg = new SSRow();
				avg.setAvg("Average","=(D1+D2+D3+D4+D5)");
				
				output.println(avg.toString());
			    
			}
	
	}

}
