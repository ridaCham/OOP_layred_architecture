package kodlamaioSimulation;

import kodlamaioSimulation.bisuness.CourseManager;
import kodlamaioSimulation.databaseAccess.HibernateCourseDao;
import kodlamaioSimulation.entities.Category;
import kodlamaioSimulation.entities.Course;

public class MainUi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Course course1 = new Course(1,"Java 20221","Programming",2000);
		Category category1 = new Category(1,"Programming");
	CourseManager courseManager = new CourseManager(new HibernateCourseDao());
	courseManager.addCourse(course1);
	}

}
