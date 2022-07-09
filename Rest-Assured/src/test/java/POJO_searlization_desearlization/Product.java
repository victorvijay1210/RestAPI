package POJO_searlization_desearlization;

import org.apache.juneau.annotation.Beanc;

//pojo class
public class Product {
	
	private String name;
	private String price;
	private String color;
	private String[] sellarnames;
	
	
	
	
	
	@Beanc(properties = "name,price,color,sellarnames")
	public Product(String name, String price, String color, String[] sellarnames) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellarnames = sellarnames;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String[] getSellarnames() {
		return sellarnames;
	}
	public void setSellarnames(String[] sellarnames) {
		this.sellarnames = sellarnames;
	}
	
	
	

}
