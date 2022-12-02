package main.java.com.teamwork.netdisc.model;

public class UserBean {

	String username; // 用户名
	String email; // 用户email
	String password; // 用户密码

	public UserBean(){
	}

	public UserBean(String name, String email, String password){
		this.email = email;
		this.username = name;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserBean [ username=" + username + ", email=" + email + ", password=" + password + "]";
	}

}
