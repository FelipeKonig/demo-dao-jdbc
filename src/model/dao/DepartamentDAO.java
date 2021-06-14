package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDAO {

	void insert(Departament obj);

	void update(Departament departament);

	void deleteById(Departament obj);

	Departament findById(Departament obj);

	List<Departament> findAll();
}
