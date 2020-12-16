package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int MINUS_ONE = -1;
	private int[] numbers = new int[12];

	public int total = MINUS_ONE;

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == MINUS_ONE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return MINUS_ONE;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return MINUS_ONE;
		}
		return numbers[total--];
	}

}
