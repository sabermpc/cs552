public class AlarmClock {
	private int hh, mm, ss;
	private boolean pm, on;

    public AlarmClock() {
		hh = 0;
		mm = 0;
		ss = 0;
		pm = false;
	}
	public AlarmClock(int hh, int mm, int ss) {

	}
	public AlarmClock(int hh, int mm, int ss, boolean pm) {

	}
	void setAlarm(int hh, int mm) {
	}
	void setAlarm(int hh, int mm, boolean pm) {
	}
	void turnAlarmOn() {
		on = true;
	}
	void turnAlarmOff() {
		on = false;
	}
	boolean isAlarmOn() {
		if (on) return true;
		return false;
	}
	boolean isRinging() {
		if ((hh == getHours())) return true;
		return false;
	}
	boolean equals(AlarmClock otherAlarmClock) {}
	public String toString() {}
}