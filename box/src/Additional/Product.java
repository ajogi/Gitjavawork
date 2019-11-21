package Additional;
import java.util.*;
public class Product {
	private Long id;
	private String productName;
	private String supplierName;
	private Integer price;


	
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}

	public Product(){

	}
	public Product(Long id, String productName, String supplierName, Integer price){


	}
}


