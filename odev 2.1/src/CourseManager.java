
public class CourseManager {
	
	public void addToCourse(Course course) {
		System.out.println(course.name + ": adl� kursumuz hesab�n�za eklendi");
	}

	public void getTeacherWithCourse (Course course) {
		System.out.println(course.name + "adl� kursun ��retmeni :" +course.teacher + "'d�r" );
	}
	
	
}
