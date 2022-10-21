package kodlamaioSimulation.databaseAccess;

import kodlamaioSimulation.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void addCategory(Category category) {
		// TODO Auto-generated method stub
		System.out.println(category.getName()+ " is added with jbdc");
	}

}
