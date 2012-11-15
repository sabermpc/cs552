public class AlarmClock {
    public AlarmClock() {}
	public AlarmClock(int hh, int mm, int ss) {
	}
	public AlarmClock(int hh, int mm, int ss, boolean pm) {
	}
	void setAlarm(int hh, int mm) {
	}
	void setAlarm(int hh, int mm, boolean pm) {
	}
	void turnAlarmOn() {}
	void turnAlarmOff() {}
	boolean isAlarmOn() {}
	boolean isRinging() {}
	boolean equals(AlarmClock otherAlarmClock) {}
	public String toString() {}
}