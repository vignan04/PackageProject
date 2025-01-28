package com.stpeters.prime;

public class Laptop {
	private String Brand;
	private String Model;
	private String Storage;
	private int price;
	public Laptop(String brand, String model, String storage, int price) {
		super();
		Brand = brand;
		Model = model;
		Storage = storage;
		this.price = price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getStorage() {
		return Storage;
	}
	public void setStorage(String storage) {
		Storage = storage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ClassProgram [Brand=" + Brand + ", Model=" + Model + ", Storage=" + Storage + ", price=" + price + "]";
	}
}
	
	
	