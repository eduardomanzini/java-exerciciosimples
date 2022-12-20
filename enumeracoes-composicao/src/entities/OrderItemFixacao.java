package entities;

public class OrderItemFixacao {

	private Integer quantity;
	private Double price;
	
	private ProductFixacao product;
	
	public OrderItemFixacao() {
	}

	public OrderItemFixacao(Integer quantity, Double price, ProductFixacao product) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public double subTotal() {
		return quantity * price;
	}

	public ProductFixacao getProduct() {
		return product;
	}

	public void setProduct(ProductFixacao product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItemFixacao [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}
	
	
	
	
}
