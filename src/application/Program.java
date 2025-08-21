package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		Department dep = new Department();

		dep.setId(5);
		Seller seller = new Seller(null, "Mariazinha", "mariazinha@gmail.com", new Date(), 6546.00, dep);
		sellerDao.insert(seller);
		
		System.out.println(seller.getId());

//		Seller seller = sellerDao.findById(27);
//		List<Seller> sellerList = sellerDao.findByDepartment(dep);
//		if (sellerList != null) {
//			sellerList.forEach(s -> System.out.println(s.getId()));
//		}
//		if (seller != null) {
//			System.out.println(seller);
//		} else {
//			System.out.println("Seller not found!");
//		}
//
//		List<Seller> sellerList = sellerDao.findAll();
//		if (sellerList != null) {
//			sellerList.forEach(System.out::println);
//		}


	}

}
