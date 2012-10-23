public class StatsPack {
    private static int total, numVals, numPositive, numNegative, numZero;
	private int lowest = Integer.MAX_VALUE;
	private int highest = Integer.MIN_VALUE;
	private double average;
	
	public StatsPack() {
		numVals = 0;
		numPositive = 0;
		numNegative = 0;
		numZero = 0;
		total = 0;
		lowest = Integer.MAX_VALUE;
		highest = Integer.MIN_VALUE;
		average = 0;
	}
	void addValue(int val) {
		total = total + val;
		numVals++;
		
		average = (total + 0.0) / numVals;
		if (val < lowest) lowest = val;
		if (val > highest) highest = val;
		if (val > 0) numPositive++;
		if (val < 0) numNegative++;
		if (val == 0) numZero++;
	}
	int total() {
		return total;
	}
	int numVals() {
		return numVals;
	}
	double average() {
//		if (numVals == 0) return average.format(); //is this line overkill?
		return average;
	}
	int lowest() {
		return lowest;
	}
	int highest() {
		return highest;
	}
	int numPositive() {
		return numPositive;
	}
	int numNegative() {
		return numNegative;
	}
	int numZero() {
		return numZero;
	}
	void reset() {
		StatsPack stat = new StatsPack();
	}
}