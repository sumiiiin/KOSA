package ch12.check.no06;

public class Member {
	private String id;
	private String name;
	
	Member(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return getId() + ": " + getName();
	}

}
