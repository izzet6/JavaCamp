
public class Course {
	public Course(int id,String name,String content,double price){
		this.setCourseId(id);
		this.setCourseName(name);
		this.setCourseContent(content);
		this.setCoursePrice(price);
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseContent() {
		return courseContent;
	}
	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	private int courseId;
	private String courseName;
	private String courseContent;
	private double coursePrice;

}
