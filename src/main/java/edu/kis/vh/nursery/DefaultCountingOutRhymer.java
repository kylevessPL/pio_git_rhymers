package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TOTAL = -1;
	private static final int FULL = 11;
	private static final int NUMBERS = FULL + 1;
	private final int[] numbers = new int[NUMBERS];

	public int getTotal() {
		return total;
	}

	private int total = TOTAL;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == TOTAL;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return TOTAL;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return TOTAL;
		}
		return numbers[total--];
	}

}
