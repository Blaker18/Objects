
public class Dog {
	private String color = "white";
	private String type = "poodle";
	int weight = 20;
	int height = 1;
	
	public String toString() {
		String str = "Hello little " + color + " " + type + ", you weigh " + weight + " pounds and you are "+ height + " foot tall.";
		
		
		
		return str;
	}
	
	public void setType(String t) {
		type = t;
	}
	public String getType(){
		return type;
	}
}
