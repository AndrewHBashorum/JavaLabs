package labSix;

public class Student extends Person {
	private static int MAXnumCourses = 3;
	private int numCourses = 0;
	private String course[];
	private int grade[];
	


	public Student(String name, String address) {
		super(name, address);
		
	}

	// getters and setters
	
	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}

	public String toString() {
		return "Student numCourses=" + getNumCourses();
	}

	public void addCourseGrade(String string, int i) {
		// TODO Auto-generated method stub

		course[numCourses].concat(string);
		grade[numCourses] = i;
		numCourses++;
	}

	public String printGrades() {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0;i<numCourses;i++)
		{
			temp+= course[i] + " :" + grade[i] + "/n";
		}
		return temp;
	}

	public int getAverageGrade() {
		// TODO Auto-generated method stub
		int total = 0;
		int avg = 0;
		for (int i = 0;i<numCourses;i++)
		{
			total += grade[i];
		}
		
		avg = total / numCourses;
		return avg;
	}
	
}
