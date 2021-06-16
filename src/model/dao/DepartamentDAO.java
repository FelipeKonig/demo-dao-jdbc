package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartamentDao {

	void insert(Department obj);

	void update(Department departament);

	void deleteById(Integer id);

	Department findById(Integer id);

	List<Department> findAll();
}
