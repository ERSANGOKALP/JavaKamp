
public class CourseManager {
	
	public void addToCourse(Course course) {
		System.out.println(course.name + ": adlı kursumuz hesabınıza eklendi");
	}

	public void getTeacherWithCourse (Course course) {
		System.out.println(course.name + "adlı kursun öğretmeni :" +course.teacher + "'dır" );
	}
	
	
}
