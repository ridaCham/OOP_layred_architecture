package kodlamaioSimulation.databaseAccess;

import kodlamaioSimulation.entities.Instructor;

public class HibernateInstractorDao implements IInstractorDao{

	@Override
	public void addInstractor(Instructor instructor) {
		System.out.println(instructor.getName()+" is added with Hibernate");
		
	}

}
