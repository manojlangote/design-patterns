package design.patterns.Builder;

public class PhoneBuilder {
	private String OS;
	private int battery;
	private String screenSize;
	public PhoneBuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setScreenSize(String screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	@Override
	public String toString() {
		return "PhoneBuilder [OS=" + OS + ", battery=" + battery + ", screenSize=" + screenSize + "]";
	}
	
}
