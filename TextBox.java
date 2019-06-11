
public class TextBox {
	
	public static void main(String[] args) {}
	
	public static String textBoxString (int side) {
		
		String returnVal = "";
		
		for(int i = 0; i < side; i++) {
			
			for(int k = 0; k < side; k++) {
				returnVal += "^";
			}
			
			returnVal += "\n";
		}
		
		return returnVal;
	}
	
	public static String textBoxString(int side, char bChar) {
		
		String returnVal = "";
		
		for(int i = 0; i < side; i++) {
			
			for(int k = 0; k < side; k++) {
				returnVal += bChar;
			}
			
			returnVal += "\n";
		}
		
		return returnVal;
		
	}
	
	public static String textBoxString(int rows, int cols) {
		
		String returnVal = "";
		
		for(int i = 0; i < rows; i++) {
			
			for(int k = 0; k < cols; k++) {
				returnVal += "*";
			}
			
			returnVal += "\n";
		}
		
		return returnVal;
		
	}
	
	public static String textBoxString(int rows, int cols, char c1, char c2) {
		
		String returnVal = "";
		
		for(int i = 0; i < rows; i++) {
			
			for(int k = 1; k < cols+1; k++) {
				
				if(k % 2 != 0) {
					returnVal += c1;
				}else {
					returnVal += c2;
				}
				
			}
			
			returnVal += "\n";
		}
		
		return returnVal;
	}

}
