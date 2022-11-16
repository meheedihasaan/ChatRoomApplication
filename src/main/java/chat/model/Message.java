package chat.model;

public class Message {
	private String name;
	private String content;
	
	public Message(String name, String content) {
		this.name = name;
		this.content = content;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
}
