package design.patterns.Builder;

public class Main {
	public static void main(String[] args) {
		PhoneBuilder pb = new PhoneBuilder().setOS("Android").setBattery(5000);
		System.out.println(pb);
	}

}
