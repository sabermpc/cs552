public class Clock {
    private int h, h12, m, s;
    private boolean pm;

    public Clock() {
		h = 0;
		m = 0;
		s = 0;
		pm = false;
	}
	public Clock(int hh, int mm, int ss) {
		boolean err = false;

		if ((hh < 0) || (hh > 23)) {
			System.out.println("Invalid Hours entry.");
			err = true;
		}
		if ((mm < 0) || (mm > 59)) {
			System.out.println("Invalid Minutes entry.");
			err = true;
		}
		if ((ss < 0) || (ss > 59)) {
			System.out.println("Invalid Seconds entry.");
			err = true;
		}
		if (err == true) {
			System.out.println("Clock initialized to midnight.");
			midnight();
		} else {
			h = hh;
			m = mm;
			s = ss;
			if (h > 11) pm = true;
		}
	}
	public Clock(int hh, int mm, int ss, boolean pm) {
		boolean err = false;

		if ((hh < 1) || (hh > 12)) {
			System.out.println("Invalid Hours entry.");
			err = true;
		}
		if ((mm < 0) || (mm > 59)) {
			System.out.println("Invalid Minutes entry.");
			err = true;
		}
		if ((ss < 0) || (ss > 59)) {
			System.out.println("Invalid Seconds entry.");
			err = true;
		}
		if (err == true) {
			System.out.println("Clock initialized to midnight.");
			midnight();
		} else {
			if (pm == false) h = hh;
			else {
				h = hh + 12;
				if (h == 24) h = 0;
			}
			m = mm;
			s = ss;
			this.pm = pm;
		}
	}
	void set(int hh, int mm, int ss) {
		boolean err = false;

		if ((hh < 0) || (hh > 23)) {
			System.out.println("Invalid Hours entry.");
			err = true;
		}
		if ((mm < 0) || (mm > 59)) {
			System.out.println("Invalid Minutes entry.");
			err = true;
		}
		if ((ss < 0) || (ss > 59)) {
			System.out.println("Invalid Seconds entry.");
			err = true;
		}
		if (err == true) {
			System.out.println("Clock initialized to midnight.");
			midnight();
		} else {
			h = hh;
			m = mm;
			s = ss;
			if (h > 11) pm = true;
		}
	}
	void set(int hh, int mm, int ss, boolean pm) {
		boolean err = false;

		if ((hh < 1) || (hh > 12)) {
			System.out.println("Invalid Hours entry.");
			err = true;
		}
		if ((mm < 0) || (mm > 59)) {
			System.out.println("Invalid Minutes entry.");
			err = true;
		}
		if ((ss < 0) || (ss > 59)) {
			System.out.println("Invalid Seconds entry.");
			err = true;
		}
		if (err == true) {
			System.out.println("Clock initialized to midnight.");
			midnight();
		} else {
			if (pm == false) h = hh;
			else {
				h = hh + 12;
				if (h == 24) h = 0;
			}
			m = mm;
			s = ss;
			this.pm = pm;
		}
	}
	public String toString() {
		if (isPM()) return String.format("[%02d:%02d:%02d / %02d:%02d:%02d PM]", getHours24(), getMinutes(), getSeconds(), getHours12(), getMinutes(), getSeconds());
		return String.format("[%02d:%02d:%02d / %02d:%02d:%02d AM]", getHours24(), getMinutes(), getSeconds(), getHours12(), getMinutes(), getSeconds());
	}
	void addSeconds(int ss) {
		int minCounter = 0;

		if (ss < 0) System.out.println("Invalid add Seconds entry.");
		else {
			s = ss + s;
			while (s >= 60) {
				s = s - 60;
				minCounter++;
			}
			addMinutes(minCounter);
		}
	}
	void addMinutes(int mm) {
		int hourCounter = 0;

		if (mm < 0) System.out.println("Invalid add Minutes entry.");
		else {
			m = mm + m;
			while (m >= 60) {
				m = m - 60;
				hourCounter++;
			}
			addHours(hourCounter);
		}
	}
	void addHours(int hh) {
		if (hh < 0) System.out.println("Invalid add Hours entry.");
		else {
			h = hh + h;
			while (h >= 24) {
				h = h - 24;
			}
		}
	}
	public boolean equals(Clock otherClock) {
		if ((otherClock.getHours24() == getHours24()) && (otherClock.getMinutes() == getMinutes()) && (otherClock.getSeconds() == getSeconds())) return true;
		return false;
	}
	int getHours12() {
		h12 = h;
		if (h == 0) h12 = 12;
		if (h > 12) h12 = h - 12;

		return h12;
	}
	int getHours24() {
		return h;
	}
	int getMinutes() {
		return m;
	}
	int getSeconds() {
		return s;
	}
	boolean isPM() {
		if (h > 11) return true;
		return false;
	}

	private void midnight() {
		h = 0;
		m = 0;
		s = 0;
		pm = false;
	}
}