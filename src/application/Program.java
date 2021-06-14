package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	
	public static void main(String[] args) {
		
		Departament obj = new Departament(1, "Books");
		
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println(seller);
	}
}
