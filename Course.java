public class Course {
    private String id, name;
	private int numStudents;
//	private student array or object//which to use?

	public boolean accept(Student student) {
		if ((numStudents <= 10) && !(isEnrolled(student))) {
			numStudents++;
			return true;
		}
		return false;
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
    
    
    public static void main(String[] args) {
    	System.out.print("Hello World!");
	}
}