package model.dto;

public class UserDTO {
	private int userId;
	private String nickname;
	private String password;
	private String gender;
	private String photo;
	
	public UserDTO() {
    }
	
	public UserDTO(int userId, String nickname,String password,String gender, String photo) {
        this.userId = userId;
        this.nickname = nickname;
        this.password = password;
        this.gender = gender;
        this.photo= photo;
    }
	
	public UserDTO(String nickname,String password) {
        this.nickname = nickname;
        this.password = password;
    }
	
	public UserDTO(String nickname,String password, String gender) {
        this.nickname = nickname;
        this.password = password;
        this.gender = gender;
    }
	
	public int getUserId() { return userId; }
	public void setUserId(int userId) { this.userId = userId; }
	
	public String getNickname() { return nickname; }
	public void setNickname(String nickname) { this.nickname = nickname; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	public String getGender() { return gender; }
	public void setGender(String gender) { this.gender = gender; }
	
	public String getPhoto() { return photo; }
	public void setPhoto(String photo) { this.photo = photo; }
	
	
}
