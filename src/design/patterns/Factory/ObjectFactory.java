package design.patterns.Factory;

public class ObjectFactory {

	public OS getInastance(String type) {
		switch(type) {
		case "OPEN":return new Android();
		case "SECURE":return new IOS();
		default:return new Windows();
		}
	}
}
