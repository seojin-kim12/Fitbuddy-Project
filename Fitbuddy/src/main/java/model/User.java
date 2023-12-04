package model;

public class User {
	private String nickname;
    private String password;
    private String gender;
    private String photo;
    
    public User(String nickname, String password, String gender) {
		this.nickname = nickname;
		this.password = password;
		this.gender = gender;
	}
    
	public String getnickname() {
		return nickname;
	}
	public void setnickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

   
	/* 비밀번호 검사 */
	public boolean matchPassword(String password) {
		if (password == null) {
			return false;
		}
		return this.password.equals(password);
	}

	
}
