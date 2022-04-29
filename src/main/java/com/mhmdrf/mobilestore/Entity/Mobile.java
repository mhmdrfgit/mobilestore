package com.mhmdrf.mobilestore.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mobiles")
public class Mobile {

	@Id
	@SequenceGenerator(sequenceName = "mobile_id", name = "mobile_id", schema = "mobileschema",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "mobile_id")
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "size")
	private int size;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "quantity")
	private Integer quantity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size + ", price=" + price
				+ ", brand=" + brand + ", quantity=" + quantity + "]";
	}
}
