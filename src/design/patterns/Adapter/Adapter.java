package design.patterns.Adapter;

public class Adapter implements App{
	private FancyUI fancyUI;
	public Adapter() {
		fancyUI = new FancyUI();
	}
	@Override
	public void showMenus(String XML) {
	String data = convertXMLTOJson(XML);
	fancyUI.showMenus(data);
	}
	private String convertXMLTOJson(String xML) {
		return "JSON";
	}

}
