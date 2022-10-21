package kodlamaioSimulation.databaseAccess;

import kodlamaioSimulation.entities.Instructor;

public class JdbcInstructorDao implements IInstractorDao{

	@Override
	public void addInstractor(Instructor instructor) {
		//it is a simple simulation, I did not write  Sql commands
		System.out.println(instructor.getName()+" is added with Jdbc");
		
	}

}
