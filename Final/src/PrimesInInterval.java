
public class PrimesInInterval {
	public static void main(String[] args) {}
	
	public static boolean isPrime (int possiblePrime) {
		
		for(int i = 2; i <= possiblePrime/2; i++){
			
            if(possiblePrime % i == 0){
                return false;  
            }
            
        }
		
		return true;
	}
	
	public static int floor () {
		return (int)(Math.random()*1000);
	}
	
	public static int ceiling (int lowBound) {
		return (int)(Math.random()*(lowBound * 10 - lowBound) + lowBound);
	}
}
