
public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println(CentToFar(25));
		}
	public static double CentToFar(double celcius) {
		double farenheight = (celcius * 9/5) + 32;
		return farenheight;
	}
	public static double FarToCent(double temp) {
		double centigrade = ((temp - 32) * 0.5055555555555);
		return centigrade;
	}
}
