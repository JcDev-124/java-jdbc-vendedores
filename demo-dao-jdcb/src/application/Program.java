package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller;
		System.out.println("=== TEST 1: seller findById ===");
		seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("=== TEST 2: seller findById ===");
		
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDeparment(department);
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 3: seller findAll ===");
		

		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("=== TEST 4: seller Insert ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller Update ===");
		
		seller = sellerDao.findById(1);
		seller.setName("Martha Whane");
		sellerDao.update(seller);
		
		System.out.println("Update complete!");
		
		
		System.out.println("=== TEST 6: seller DeleteById ===");
		System.out.println("Enter id for delete");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete complete!");
	}

}
