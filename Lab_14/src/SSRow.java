
public class SSRow {
	
	private String name = "";
	private int score = 0;
	private int weight = 0;
	private String calc = "";
	
	SSRow(){}
	
	SSRow(String n, int s, int w, String c){
		name = n;
		score = s;
		weight = w;
		calc = c;
	}
	
	public void setAvg(String n, String c) {
		name = n;
		calc = c;
	}
	
	public String toString() {
		return name +","+ score +","+ weight +","+ calc;
	}

}
