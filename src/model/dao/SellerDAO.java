package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {

	void insert(Seller obj);

	void update(Seller Seller);

	void deleteById(Seller obj);

	Seller findById(Seller obj);

	List<Seller> findAll();
}
