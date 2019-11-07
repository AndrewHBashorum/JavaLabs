package labSix;

public class Teacher extends Person {

	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private int numCourses = 0;
	private String course[];
	public boolean addCourse(String course2) {
		// TODO Auto-generated method stub
		
		if(numCourses < 3)
		{
			course[numCourses] += course2;
			numCourses++;
			return true;
		}
		else
			return false;

	
	}
	public boolean removeCourse(String course2) {
		// TODO Auto-generated method stub
		if(numCourses > 0)
		{
			course[numCourses].replace(course2, null);
			numCourses--;
			return true;
		}
		else
			return false;
	}
	
	
}
