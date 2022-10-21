package kodlamaioSimulation.databaseAccess;

import kodlamaioSimulation.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void addCourse(Course course) {
		System.out.println(course.getName()+" is added with Hibernate");
		
	}

}
