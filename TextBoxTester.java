
public class TextBoxTester {
	
	public static void main(String[] args) {
		
		String a =  TextBox.textBoxString(3);
		System.out.println(a);
		
		String b =  TextBox.textBoxString(4, '+'); 
		System.out.println(b);
		
		String c =  TextBox.textBoxString(3, 4); 
		System.out.println(c);
		
		String d =  TextBox.textBoxString(3, 5, 'x', 'o');
		System.out.println(d);
	}
	
}
