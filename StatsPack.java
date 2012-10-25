public class StatsPack {
    private int total, numVals, numPositive, numNegative, numZero;
    private double average;
    private int lowest = Integer.MAX_VALUE;
	private int highest = Integer.MIN_VALUE;

	public StatsPack() {
		total = 0;
		numVals = 0;
		average = 0;
		lowest = Integer.MAX_VALUE;
		highest = Integer.MIN_VALUE;
		numPositive = 0;
		numNegative = 0;
		numZero = 0;
	}
	void addValue(int val) {
		total = total + val;
		numVals++;
		average = (float)total / numVals;
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
		total = 0;
		numVals = 0;
		average = 0;
		lowest = Integer.MAX_VALUE;
		highest = Integer.MIN_VALUE;
		numPositive = 0;
		numNegative = 0;
		numZero = 0;
	}
}