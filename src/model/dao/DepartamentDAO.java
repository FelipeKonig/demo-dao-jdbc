package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartamentDao {

	void insert(Department obj);

	void update(Department departament);

	void deleteById(Department obj);

	Department findById(Department obj);

	List<Department> findAll();
}
