package com.stpeters.prime;

public class Car {
	private String Brand;
	private String Model;
	private int mileage;
	private int price;
	public Car(String brand, String model, int mileage, int price) {
		super();
		Brand = brand;
		Model = model;
		this.mileage = mileage;
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
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [Brand=" + Brand + ", Model=" + Model + ", mileage=" + mileage + ", price=" + price + "]";
	}
	

}
