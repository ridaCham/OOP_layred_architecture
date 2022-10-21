package kodlamaioSimulation.databaseAccess;

import kodlamaioSimulation.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void addCategory(Category category) {
		System.out.println(category.getName()+ " is added with hibernate ");
	}

}
