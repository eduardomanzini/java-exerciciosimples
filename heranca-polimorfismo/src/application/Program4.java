package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

public class Program4 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int j = 1; j <= n; j++) {
			System.out.println("Product #" + j + "data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			char res = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (res == 'i' ) {
				System.out.print("Customs free:");
				Double customsFree = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFree));
			}
			else if ( res == 'u') {
				System.out.println("Manufacture date(DD/MM/YYYY) ");
				Date data = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, data));
			}
			else {
				list.add(new Product(name, price));
			}				
		}
		
		System.out.println("Price Tags");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
		
		
		
		sc.close();
	}

}
