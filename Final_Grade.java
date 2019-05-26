import java.util.Scanner;

public class Final_Grade {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Labs average in percent: ");
		double labs = input.nextDouble();
		double labsWeight = 25 / 100.0;
		labs = labs * labsWeight;
		
		System.out.println("Enter REVEL scores average in percent: ");
		double revel = input.nextDouble();
		double revelWeight = 25 / 100.0;
		revel = revel * revelWeight;
		
		System.out.println("Enter Midterm average in percent: ");
		double midterm = input.nextDouble();
		double midtermWeight = 20 / 100.0;
		midterm = midterm * midtermWeight;
		
		System.out.println("Enter Project average in percent: ");
		double project = input.nextDouble();
		double projectWeight = 15 / 100.0;
		project = project * projectWeight;
		
		System.out.println("Enter Final average in percent: ");
		double finalGrade = input.nextDouble();
		double finalGradeWeight = 15 / 100.0;
		finalGrade = finalGrade * finalGradeWeight;
		
		double average = labs + revel + midterm + project + finalGrade;
		
		System.out.println("Your average is " + average + "%");
	}
}
