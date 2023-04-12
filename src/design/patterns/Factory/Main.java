package design.patterns.Factory;

public class Main {

	public static void main(String[] args) {
	
		ObjectFactory objFactory = new ObjectFactory();
		OS os = objFactory.getInastance("OPEN");
		os.type();
		
		OS os2 = objFactory.getInastance("SECURE");
		os2.type();
		
		OS os3 = objFactory.getInastance("IDK");
		os3.type();
	}

}
