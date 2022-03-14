
public class User {

	private String userVek,password,confirmPassword,roles,gender;

	public String getUserVek() {
		return userVek;
	}

	public void setUserVek(String userVek) {
		this.userVek = userVek;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User(String userVek, String password, String confirmPassword, String roles, String gender) {
		super();
		this.userVek = userVek;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.roles = roles;
		this.gender = gender;
	}
	
	


}
