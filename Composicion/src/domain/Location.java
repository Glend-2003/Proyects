package domain;

public class Location {

	private String canton;
	private String district;
	private String street;
	
	public Location() {}

	public Location(String canton, String district, String street) {
		super();
		this.canton = canton;
		this.district = district;
		this.street = street;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public String ToString() {
		return this.canton+"-"+this.district+"-"+this.street;
	}
	public String ToStringSecond() {
		return "\nProvincia: "+this.canton+"\nCanton: "+this.district+"\nLugar Exacto: "+this.street;
	}
	
	
}
