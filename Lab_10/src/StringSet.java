
public class StringSet {
	
	private String[] stringArray = new String[10];
	
	private int stringNums = 0;
	
	public StringSet(){}
	
	public boolean add(String newStr) {
		
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] == null) {
				stringArray[i] = newStr;
				stringNums++;
				return true;
			}
		}
		
		return false;
	}
	
	public int size() {
		return stringNums;
	}
	
	public int numChars() {
		int chars = 0;
		
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] != null) {
				chars += stringArray[i].length();
			}
		}
		
		return chars;
		
	}
	
	public int countStrings(int len) {
		
		int count = 0;
		
		for(int i = 0; i < stringArray.length; i++) {
			if(stringArray[i] != null && stringArray[i].length() == len) {
				count++;
			}
		}
		
		return count;
	}

}
