
public class Main {

	public static void main(String[] args) {
		//Kurslar için instance ürettim ve tanımlama yaptım
		Course course1 = new Course(1,1,"C#/Angular Kursu","Komple Yazılım Kursu","Engin Demioğ", 0);
		Course course2 = new Course (2,1,"Java/React Kursu","Komple Yazılım Kursu","Engin Demiroğ", 0);
		Course course3 = new Course (3,2,"Yazılıma Hazırlık Kursu","Yazılıma HAzırlık","Engin Demiroğ",0);
		
		//Kategory için instance ürettim ve tanımlama yaptım
		Category category1 = new Category (1,"Komple Yazılım Kursu");
		Category category2 = new Category (2,"Yazılıma Hazırlık Kursu");
		
		//Teacher için instance ürettim ve tanımlama yaptım
		Teacher teacher = new Teacher (1,"Engin Demiroğ");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		courseManager.getTeacherWithCourse(course1);
		courseManager.getTeacherWithCourse(course2);
		courseManager.getTeacherWithCourse(course3);
		
		

	}

}
