public class AlarmClock extends Clock {
    private int h, h12, m;
	private boolean pm, alarmOn;

	public AlarmClock() {
		super();
		defaultAlarm();
	}
	public AlarmClock(int hh, int mm, int ss) {
		super(hh, mm, ss);
		defaultAlarm();
	}
	public AlarmClock(int hh, int mm, int ss, boolean pm) {
		super(hh, mm, ss, pm);
		defaultAlarm();
	}
	void setAlarm(int hh, int mm) {
		boolean err = false;

		if ((hh < 0) || (hh > 23)) {
			System.out.println("Invalid Hours entry.");
			err = true;
		}
		if ((mm < 0) || (mm > 59)) {
			System.out.println("Invalid Minutes entry.");
			err = true;
		}
		if (err == true) {
			defaultAlarm();
			System.out.println("Alarm clock initialized to Midnight / Off.");
		} else {
			h = hh;
			m = mm;
			if (h > 11) pm = true;
			else pm = false;
		}
	}
	void setAlarm(int hh, int mm, boolean pm) {
		boolean err = false;

		if ((hh < 0) || (hh > 12)) {
			System.out.println("Invalid Hours entry.");
			err = true;
		}
		if ((mm < 0) || (mm > 59)) {
			System.out.println("Invalid Minutes entry.");
			err = true;
		}
		if (err == true) {
			defaultAlarm();
			System.out.println("Alarm clock initialized to Midnight / Off.");
		} else {
			h = hh;
			m = mm;
			this.pm = pm;
		}
	}
	void turnAlarmOn() {
		alarmOn = true;
	}
	void turnAlarmOff() {
		alarmOn = false;
	}
	boolean isAlarmOn() {
		if (alarmOn) return true;
		return false;
	}
	boolean isRinging() {
		if ((h == super.getHours24()) && (m == super.getMinutes()) && isAlarmOn()) return true;
		return false;
	}
	boolean equals(AlarmClock otherAlarmClock) {
        if ((h == otherAlarmClock.getAlarmHours24()) && (m == otherAlarmClock.getAlarmMinutes()) && (isAlarmOn() == otherAlarmClock.isAlarmOn())) return true;
        return false;
	}
	public String toString() {
		String alarmIsOn, alarmIsRinging, pm;
		
		if (isAlarmOn()) alarmIsOn = "ON";
		else alarmIsOn = "OFF";
		if (isRinging()) alarmIsRinging = "RINGING";
		else alarmIsRinging = "NOT RINGING";
		if (h > 11) pm = "PM";
		else pm = "AM";
		
		return "Clock " + super.toString() + "  Alarm [" + String.format("%02d:%02d / %02d:%02d ", getAlarmHours24(), getAlarmMinutes(), getAlarmHours12(), getAlarmMinutes()) + pm + " / " + alarmIsOn + " / " + alarmIsRinging + "]";
	}

	int getAlarmHours24() {
		return h;
	}
	int getAlarmHours12() {
		h12 = h;
		if (h == 0) h12 = 12;
		if (h > 12) h12 = h - 12;

		return h12;
	}
	int getAlarmMinutes() {
		return m;
	}
    private void defaultAlarm() {
		setAlarm(0, 0);
        turnAlarmOff();
	}
}