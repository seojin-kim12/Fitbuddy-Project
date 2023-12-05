package model;
import java.util.UUID;

public class User {
	private String nickname;
    private String password;
    private String gender;
    private String photo;
    private int userId;

    public User(String nickname, String password, String gender, String photo) {
//    	this.userId = UUID.randomUUID().toString(); // UUID로 userId 생성

        this.nickname = nickname;
        this.password = password;
        this.gender = gender;
        this.photo = photo;
    }
//	public int getUserId() {
//		return userId;
//	}
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
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
	
//	 // 회원가입 시 UserID를 UUID로 생성하는 메서드
//    public void generateUserId() {
//        this.userId = UUID.randomUUID().toString();
//    }

	
}
