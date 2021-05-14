
public class Course {
	
	public Course () {}
	
	int id;
	int categoryId;
	String name;
	String detail;
	String teacher;
	double price;
	
	
	
	public Course(int id,int categoryId, String name,String detail,String teacher,double price) {
		this.id =id;
		this.categoryId = categoryId;
		this.name =name;
		this.detail = detail;
		this.teacher = teacher; 
		this.price = price;
		
	}

}
