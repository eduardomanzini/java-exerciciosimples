import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ClientFixacao;
import entities.OrderFixacao;
import entities.OrderItemFixacao;
import entities.ProductFixacao;
import entities.enums.OrderStatus;

public class ProgramFixacao {

	public static void main(String[] args) throws ParseException {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (dd/MM/yyyy ");
		Date birthDate = sdf.parse(sc.next());
		ClientFixacao client = new ClientFixacao(name, email, birthDate);
		
		System.out.print("Status: ");
		String status = sc.next();
		
		System.out.println("Enter order data:");
		System.out.print("How many intens to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" + i+1 + "item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			ProductFixacao product = new ProductFixacao(productName, price);
			OrderItemFixacao orderItem = new OrderItemFixacao(quantity, price, product);
			OrderFixacao order = new OrderFixacao(new Date(), OrderStatus.valueOf(status), client);
			order.addItem(orderItem);
			System.out.println(order);
		}
	
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
