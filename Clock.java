public class Clock {
    private int hh, mm, ss;
	private boolean pm;

	public Clock(int hh, int mm, int ss) {
	}
	public Clock(int hh, int mm, int ss, boolean pm) {
	}
	void set(int hh, int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	void set(int hh, int mm, int ss, boolean pm) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
		this.pm = pm;
	}
	String toString() {
		//Return time in 12 / 24 hr format
	}
	void addSeconds(int ss) {
	}
	void addMinutes(int mm) {
	}
	void addHours(int hh) {
	}
	public boolean equals(Clock otherClock) {
	}
	int getHours12() {
	}
	int getHours24() {
	}
	int getMinutes() {
	}
	int getSeconds() {
	}
	boolean isPM() {
	}
}