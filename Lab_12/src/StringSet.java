import java.util.ArrayList;

public class StringSet extends ArrayList<String>{
	
	public StringSet(){}
	
	public int numChars() {
		int chars = 0;
		
		for(int i = 0; i < this.size() ; i++) {
			chars += this.get(i).toString().length();
		}
		
		return chars;
		
	}
	
	public int countStrings(int len) {
		
		int count = 0;
		
		for(int i = 0; i < this.size(); i++) {
			if(this.get(i).toString().length() == len) {
				count++;
			}
		}
		
		return count;
		
	}

}
