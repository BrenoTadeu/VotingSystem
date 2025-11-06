package main.java.model;

public class Database {
	private String user;
	private String pass;
	
	
	public Database(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getPass() {
		return pass;
	}
}
