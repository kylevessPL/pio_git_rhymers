package edu.kis.vh.nursery;

/**
 * The type Hanoi Rhymer
 * extends type of DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	/**
	 * Report number of rejected
	 *
	 * @return the int
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * count method
	 * overrides DefaultCountingOutRhymer method
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo()) {
			totalRejected++;
		} else {
			super.countIn(in);
		}
	}

}
