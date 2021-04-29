
public class Main {

	public static void main(String[] args) {
		Course course1 =new Course(1,"C#+Angular","Yazılım geliştirici yetişdirme kampı",0);
		Course course2=new Course(2,"Java+React","Yazılım geliştirici yetişdirme kampı",0);
		Course course3=new Course(3,"Python,Java,C#","Programlamaya giris icin temel kurs",0);
		
		MyLearning learning1=new MyLearning(1, "C#+Angular","31%");
		MyLearning learning2=new MyLearning(2, "Java+React","24%");
		MyLearning learning3=new MyLearning(3, "Programlamaya giris","100%");
		
		
		Course courses[]= {course1,course2,course3};
		System.out.println("Tum kurslar:");
		for (Course course : courses) {
			System.out.println(course.getCourseName());
		
		}
		MyLearning learnings[]= {learning1,learning2,learning3};
		System.out.println("Kurslarim");
		for (MyLearning myLearning : learnings) {
			System.out.println(myLearning.courseName);
		}
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.addToMyLearning(course1);
		courseManager.addToMyLearning(course2);
		courseManager.addToMyLearning(course3);
		
		courseManager.myLearningProgress(learning1);
		courseManager.myLearningProgress(learning2);
		courseManager.myLearningProgress(learning3);


	}

}
