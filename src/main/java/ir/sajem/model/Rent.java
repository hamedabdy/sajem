package ir.sajem.model;

import java.io.Serializable;
import java.sql.Date;

public class Rent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String address;
	private double lat;
	private double lng;
	private Date timestamp;
	private int constructYear;
	private boolean flat;
	private boolean house;
	private boolean shop;
	private boolean ofice;
	private boolean storage;
	private double price;
	private int userId;
	private String organization;
	private double area;
	private int rooms;
	private int floorN;
	private boolean available;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getConstructYear() {
		return constructYear;
	}
	public void setConstructYear(int constructYear) {
		this.constructYear = constructYear;
	}
	public boolean isFlat() {
		return flat;
	}
	public void setFlat(boolean flat) {
		this.flat = flat;
	}
	public boolean isHouse() {
		return house;
	}
	public void setHouse(boolean house) {
		this.house = house;
	}
	public boolean isShop() {
		return shop;
	}
	public void setShop(boolean shop) {
		this.shop = shop;
	}
	public boolean isOfice() {
		return ofice;
	}
	public void setOfice(boolean ofice) {
		this.ofice = ofice;
	}
	public boolean isStorage() {
		return storage;
	}
	public void setStorage(boolean storage) {
		this.storage = storage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getFloorN() {
		return floorN;
	}
	public void setFloorN(int floorN) {
		this.floorN = floorN;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}


}