package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class OrderFixacao {

	private Date moment;
	private OrderStatus status;
	
	private ClientFixacao client;
	private List<OrderItemFixacao> itens = new ArrayList<>();
	
	public OrderFixacao() {	
	}

	public OrderFixacao(Date moment, OrderStatus status, ClientFixacao client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ClientFixacao getClient() {
		return client;
	}

	public void setClient(ClientFixacao client) {
		this.client = client;
	}

	public List<OrderItemFixacao> getItens() {
		return itens;
	}

	public void addItem(OrderItemFixacao item) {
		itens.add(item);
	}
	
	@Override
	public String toString() {
		return "OrderFixacao [moment=" + moment + ", status=" + status + ", client=" + client + ", itens=" + itens
				+ "]";
	}

	public void removeItem(OrderItemFixacao item) {
		itens.add(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItemFixacao item : itens) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	
	
	
}
