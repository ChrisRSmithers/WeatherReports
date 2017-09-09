public class LatLong {
	
	private int Latitude;
	private int Longitude;
	
	public LatLong (int Latitude, int Longitude){
		this.Latitude = Latitude;
		this.Longitude = Longitude;
	}
	
	public LatLong(String LatAndLong) {
		String[] vals = LatAndLong.split("\\s");
		Latitude = fromString(vals[0]);
		Longitude = fromString(vals[1]);
	}
	
	public int getLat() {
		return Latitude;
	}
	
	public void setLat(int Latitude) {
		this.Latitude = Latitude;
	}
	
	public int getLong() {
		return Longitude;
	}
	
	public void setLong(int Longitude) {
		this.Longitude = Longitude;
	}
	
	private int fromString(String value) {
		value = value.substring(0, value.length() - 1);
		return Integer.parseInt(value);
	}
	
	public String toString() {
		String str1 = Integer.toString(Longitude);
		String str2 = Integer.toString(Latitude);
		return str1 + "E " + str2 + "N";
	}

}
