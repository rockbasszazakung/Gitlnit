
public class Hello {
	String name;

	public Hello(String name) {
		super();
	this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String gethello(){
		return "Hello" + this.name;
	}
	
}
