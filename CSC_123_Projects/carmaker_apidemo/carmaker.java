
public class carmaker {
	
	String commonName;
	String country;
	String fullName;
	long mfrId;
	public carmaker(String commonName, String country, String fullName, long mfrId) {
		super();
		this.commonName = commonName;
		this.country = country;
		this.fullName = fullName;
		this.mfrId = mfrId;
	}
	public String getCommonName() {
		return commonName;
	}
	public String getCountry() {
		return country;
	}
	public String getFullName() {
		return fullName;
	}
	public long getMfrId() {
		return mfrId;
	}
	@Override
	public String toString() {
		return "carmaker [commonName=" + commonName + ", country=" + country + ", fullName=" + fullName + ", mfrId="
				+ mfrId + "]";
	}
	

}
