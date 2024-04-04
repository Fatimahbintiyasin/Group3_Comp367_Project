package com.example.demo;

public class Cruise {
	private String firstName;
	private String lastName;
	private Integer areaCode;
	private Integer phoneNumber;
	private String address1;
	private String address2;
	private String city;
	private String province;
	private String zipCode;
	private String country;
	private String email;
	private Integer staterooms;
	private String stateroomType;
	private Integer guests;
	private String insideCabin;
	private String outsideCabin;
	private String ageGroup;
	private Double price;
	private Double discount;
	private Double tax;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getStaterooms() {
		return staterooms;
	}
	public void setStaterooms(Integer staterooms) {
		this.staterooms = staterooms;
	}
	public String getStateroomType() {
		return stateroomType;
	}
	public void setStateroomType(String stateroomType) {
		this.stateroomType = stateroomType;
	}
	public Integer getGuests() {
		return guests;
	}
	public void setGuests(Integer guests) {
		this.guests = guests;
	}
	public String getInsideCabin() {
		return insideCabin;
	}
	public void setInsideCabin(String insideCabin) {
		this.insideCabin = insideCabin;
	}
	public String getOutsideCabin() {
		return outsideCabin;
	}
	public void setOutsideCabin(String outsideCabin) {
		this.outsideCabin = outsideCabin;
	}
	public String getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double calculatePrice() {
		switch(this.stateroomType) {
		case "Ocean View":
			this.price =  1700.00;
			break;
		case "Aqua Class":
			this.price = 1500.00;
			break;
		case "Veranda":
			this.price = 1200.00;
			break;
		case "Sky Suite":
			this.price = 2000.00;
			break;
		case "Royal Suite":
			this.price = 3000.00;
			break;
		default:
			this.price = 0.00;
		}
		if("true".equalsIgnoreCase(this.outsideCabin)) {
			this.price += 200.00;
		}
		
		return this.price;
	}
	//10% discount if the guests is over the age of 55
	public double calculateDiscount() {
		
		if("yes".equalsIgnoreCase(this.ageGroup)) 
		{
			this.discount = this.price * 0.10;
		}
		else 
		{
			this.discount = 0.00;
		}
		return this.discount;
	}
	//13% tax on the price
	public double calculateTax() {
		
		this.tax = (this.price - this.discount) * 0.13;
		return this.tax;
	}
}
