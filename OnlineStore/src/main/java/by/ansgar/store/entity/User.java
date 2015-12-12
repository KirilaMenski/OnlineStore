package by.ansgar.store.entity;

public class User {
	
	private long user_id;
	private String nickName;
	private String password;
	private String email;
	private String role;
	
	public User(){
		
	}
	
	public User(long user_id, String nickName, String password, String email, String role){
		this.user_id = user_id;
		this.nickName = nickName;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
