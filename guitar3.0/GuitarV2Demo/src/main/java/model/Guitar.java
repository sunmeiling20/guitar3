package model;

public class Guitar {
	
	private String builder;
	private String model;
	private String type;
	private String topwood;
	private String backwood;
	public Guitar(String builder, String model, String type, String backwood, String topwood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
		
	}


	
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public String getTopwood() {
		return topwood;
	}
	public void setTopwood(String topwood) {
		this.topwood =topwood;
	}
	public String getBackwood() {
		return backwood;
	}
	public void setBackwood(String backwood) {
		this.backwood=backwood;
	}

}
