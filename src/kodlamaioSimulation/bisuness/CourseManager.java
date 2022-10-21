package kodlamaioSimulation.bisuness;

import kodlamaioSimulation.databaseAccess.ICourseDao;
import kodlamaioSimulation.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;

	public CourseManager(ICourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	public void addCourse(Course course) throws Exception {
		if(false){
			throw new Exception("Kurs Adı Daha Önce eklenmiş! ");
			
		}
		if(course.getPrice()<0) {
			throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz");
		}
		
		
		courseDao.addCourse(course);
	}
}
