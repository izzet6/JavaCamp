
public class CourseManager {
	public void addToMyLearning(Course course) {
		System.out.println("Kursa kaydiniz yapilmisdir: "+course.getCourseName()+"-"+course.getCourseContent());
	}
	
	public void myLearningProgress(MyLearning myLearning) {
		if (myLearning.courseProgress=="100%") {
			System.out.println(myLearning.courseName+"-kursunu basariyla tamamladiniz");
		}else {
			System.out.println(myLearning.courseName+"-kursunuz devam ediyor."+"Ilerlemeniz:"+myLearning.courseProgress);
		}
	}

}
