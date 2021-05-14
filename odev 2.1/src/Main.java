
public class Main {

	public static void main(String[] args) {
		//Kurslar i�in instance �rettim ve tan�mlama yapt�m
		Course course1 = new Course(1,1,"C#/Angular Kursu","Komple Yaz�l�m Kursu","Engin Demio�", 0);
		Course course2 = new Course (2,1,"Java/React Kursu","Komple Yaz�l�m Kursu","Engin Demiro�", 0);
		Course course3 = new Course (3,2,"Yaz�l�ma Haz�rl�k Kursu","Yaz�l�ma HAz�rl�k","Engin Demiro�",0);
		
		//Kategory i�in instance �rettim ve tan�mlama yapt�m
		Category category1 = new Category (1,"Komple Yaz�l�m Kursu");
		Category category2 = new Category (2,"Yaz�l�ma Haz�rl�k Kursu");
		
		//Teacher i�in instance �rettim ve tan�mlama yapt�m
		Teacher teacher = new Teacher (1,"Engin Demiro�");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		courseManager.getTeacherWithCourse(course1);
		courseManager.getTeacherWithCourse(course2);
		courseManager.getTeacherWithCourse(course3);
		
		

	}

}
