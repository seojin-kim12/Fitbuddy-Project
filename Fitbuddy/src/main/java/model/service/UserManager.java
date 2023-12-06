package model.service;

import java.sql.SQLException;
import java.util.List;

import model.User;
import model.dao.UserDAO;

public class UserManager {
	private static UserManager userMan = new UserManager();
	private UserDAO userDAO;

	private UserAnalysis userAanlysis;

	private UserManager() {
		try {
			userDAO = new UserDAO();
			userAanlysis = new UserAnalysis(userDAO);
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	public static UserManager getInstance() {
		return userMan;
	}
	
	public int create(User user) throws SQLException, ExistingUserException {
		if (userDAO.existingUser(user.getNickname()) == true) {
			throw new ExistingUserException(user.getNickname() + "는 존재하는 아이디입니다.");
		}
		return userDAO.create(user);
	}
	
	
	
	public boolean login(String nickname, String password)
			throws SQLException, UserNotFoundException, PasswordMismatchException {
			
			try {
		        User user = userDAO.findUser(nickname);
		        
		        if (user == null) {
		            throw new UserNotFoundException(nickname + "는 존재하지 않는 아이디입니다.");
		        }

		        if (!user.matchPassword(password)) {
		            throw new PasswordMismatchException("비밀번호가 일치하지 않습니다.");
		        }
		        return true;
		    } catch (Exception e) {
		        e.printStackTrace(); // 또는 로깅 라이브러리 사용
		        throw e; // 예외를 다시 던져서 컨트롤러에서 처리
		    }
		}


	public User findUser(String userId)
			throws SQLException, UserNotFoundException {
			User user = userDAO.findUser(userId);
			
			if (user == null) {
				throw new UserNotFoundException(userId + "는 존재하지 않는 아이디입니다.");
			}		
			return user;
		}
	
//	public int update(User user) throws SQLException, UserNotFoundException {
//		int oldCommId = findUser(user.getnickname())
//		if (user.getCommId() != oldCommId) { 	// 소속 커뮤티니가 변경됨
//			Community comm = commDAO.findCommunity(oldCommId);  // 기존 소속 커뮤니티
//			if (comm != null && user.getUserId().equals(comm.getChairId())) {
//				// 사용자가 기존 소속 커뮤니티의 회장인 경우 -> 그 커뮤니티의 회장을 null로 변경 및 저장
//				comm.setChairId(null);
//				commDAO.updateChair(comm);
//			}
//		}
//		return userDAO.update(user);
//	}	
	
	public UserDAO getUserDAO() {
		return this.userDAO;
	}
}