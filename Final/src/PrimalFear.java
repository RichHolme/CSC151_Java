
public class PrimalFear {
	public static void main(String[] args) {
		
		int low = PrimesInInterval.floor();
		
		int high = PrimesInInterval.ceiling(low);
		
		System.out.println("Floor Number: " + low);
		System.out.println("Ceiling Number: " + high);
		
		int numPrimes = 0;
		
		System.out.println("Prime Numbers: ");
		
		for(int i = low; i <= high; i++) {
			
			boolean isPrime = PrimesInInterval.isPrime(i);
			
			if(isPrime) {	
				numPrimes++;
				System.out.println(i + " ");
			}
			
		}

		System.out.println("Total Number of Primes: " + numPrimes);
	}

}
