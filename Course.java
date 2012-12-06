public class Course {
    private String id, name;
	private int numStudents;
//	private student array or object//which to use?

	public boolean accept(Student student) {
		return true;
	}
	public boolean isEnrolled(Student student) {
		return true;
	}
	public int getNumStudents() {
		return numStudents;
	}
/*	public Student getStudent(int i) {
		return ;
	}*/
	public boolean courseIsFull() {
		return true;
	}
}