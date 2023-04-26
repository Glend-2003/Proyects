package domain;

public class Computadora {
	
	private String id;
	private String brand;
	private String model;
	private int price;
	
	public Computadora() {}
	
	public Computadora(String id, String brand, String model, int price ) {
		super();
		this.id=id;
		this.brand=brand;
		this.model = model;
		this.price = price;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return id+"-"+brand+"-"+model+"-"+price;
	}
	
}
