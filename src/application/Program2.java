package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = new Department(null, "aqui nao foi");
				
		departmentDao.insert(department);
		
		department.setName("aqui foi");
		
		departmentDao.update(department);

		department = departmentDao.findById(department.getId());
		
		System.out.println(department);
		
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
	}

}
