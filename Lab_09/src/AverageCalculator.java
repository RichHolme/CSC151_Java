
public class AverageCalculator {
	
	int sum = 0;
	int count = 0;
	
	AverageCalculator() {}
	
	void add(int newNum) {
		count++;
		sum += newNum;
	}
	
	int getSum() {
		return sum;
	}
	
	int getCount() {
		return count;
	}
	
	double getAverage() {
		if (count > 0) {
			double denom = count;
			return sum / denom;
		}else {
			return 0;
		}
	}

}
