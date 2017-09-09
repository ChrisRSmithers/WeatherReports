
public class WeatherObservation {
	private int year, month, frostDays, rainfall;
	private double meanMax, meanMin, sunshine;
	private boolean isProvisional;
	
	public WeatherObservation(int setYear, int setMonth) {
		year = setYear;
		month = setMonth;
	}
	
	public int getMonth(){
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getFrostDays() {
		return frostDays;
	}
	public int getRainfall() {
		return rainfall;
	}
	public double getMax() {
		return meanMax;
	}
	public double getMin() {
		return meanMin;
	}
	public double getSunshine() {
		return sunshine;
	}
	public boolean getIsProvisional() {
		return isProvisional;
	}
	
	public void setFrostDays(int n) {
		frostDays = n;
	}
	public void setRainfall(int n) {
		rainfall = n;
	}
	public void setMeanMax(double d) {
		meanMax = d;
	}
	public void setMeanMin(double d) {
		meanMin = d;
	}
	public void setSunshine(double d) {
		sunshine = d;
	}
	public void setisProvisional(boolean b) {
		isProvisional = b;
	}
	
	
}
