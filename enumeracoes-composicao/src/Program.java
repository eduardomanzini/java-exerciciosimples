import java.util.Date;

import entities.pedido;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		
		pedido pedido = new pedido(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
