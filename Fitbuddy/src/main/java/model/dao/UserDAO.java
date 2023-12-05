//package model.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import model.User;
//
//public class UserDAO {
//	private JDBCUtil jdbcUtil = null;
//	
//	public UserDAO() {			
//		jdbcUtil = new JDBCUtil();	// JDBCUtil 객체 생성
//	}
//		
//	/**
//	 * 사용자 관리 테이블에 새로운 사용자 생성.
//	 */
//	public int create(User user) throws SQLException {
//		String sql = "INSERT INTO BUDDYUSER (USERID, NICKNAME, PASSWORD, GENDER, PHOTO) VALUES (?, ?, ?, ?, ?)";
//        Object[] param = new Object[] { user.getUserId(), user.getNickname(), user.getPassword(), user.getGender(), user.getPhoto() };
//
//		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil 에 insert문과 매개 변수 설정
//						
//		try {				
//			int result = jdbcUtil.executeUpdate();	// insert 문 실행
//			return result;
//		} catch (Exception ex) {
//			jdbcUtil.rollback();
//			ex.printStackTrace();
//		} finally {		
//			jdbcUtil.commit();
//			jdbcUtil.close();	// resource 반환
//		}		
//		return 0;			
//	}
//	
//	/**
//	 * 주어진 사용자 ID에 해당하는 사용자 정보를 데이터베이스에서 찾아 User 도메인 클래스에 
//	 * 저장하여 반환.
//	 */
//	public User findUser(String nickname) throws SQLException {
//        String sql = "SELECT password, nickname "
//        			+ "FROM BUDDYUSER "
//        			+ "WHERE nickname=? ";              
//		jdbcUtil.setSqlAndParameters(sql, new Object[] {nickname});	// JDBCUtil에 query문과 매개 변수 설정
//
//		try {
//			ResultSet rs = jdbcUtil.executeQuery();		// query 실행
//			if (rs.next()) {						// 학생 정보 발견
//				User user = new User(		// User 객체를 생성하여 학생 정보를 저장
//					nickname,
//					rs.getString("password"),
////					rs.getString("nickname"),
//					rs.getString("gender")
//				);
//				return user;
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			jdbcUtil.close();		// resource 반환
//		}
//		return null;
//	}
//	
//	
//	/**
//	 * 주어진 사용자 ID에 해당하는 사용자가 존재하는지 검사 
//	 */
//	public boolean existingUser(String nickname) throws SQLException {
//		String sql = "SELECT count(*) FROM USERINFO WHERE nickname=?";      
//		jdbcUtil.setSqlAndParameters(sql, new Object[] {nickname});	// JDBCUtil에 query문과 매개 변수 설정
//
//		try {
//			ResultSet rs = jdbcUtil.executeQuery();		// query 실행
//			if (rs.next()) {
//				int count = rs.getInt(1);
//				return (count == 1 ? true : false);
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			jdbcUtil.close();		// resource 반환
//		}
//		return false;
//	}
//
//}

package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAO {
    private JDBCUtil jdbcUtil;

    public UserDAO() {
        jdbcUtil = new JDBCUtil();
    }

    public int create(User user) throws SQLException {
        String sql = "INSERT INTO BUDDYUSER (NICKNAME, PASSWORD, GENDER, PHOTO) VALUES ( ?, ?, ?, ?)";
        Object[] param = new Object[] { user.getNickname(), user.getPassword(), user.getGender(), user.getPhoto() };

        jdbcUtil.setSqlAndParameters(sql, param);

        try {
            int result = jdbcUtil.executeUpdate();
            return result;
        } catch (Exception ex) {
            jdbcUtil.rollback();
            ex.printStackTrace();
        } finally {
            jdbcUtil.commit();
            jdbcUtil.close();
        }

        return 0;
    }

    public User findUser(String nickname) throws SQLException {
        String sql = "SELECT USERID, PASSWORD, GENDER, PHOTO FROM BUDDYUSER WHERE NICKNAME=?";
        jdbcUtil.setSqlAndParameters(sql, new Object[] { nickname });

        try {
            ResultSet rs = jdbcUtil.executeQuery();
            if (rs.next()) {
                User user = new User(
                 
                    nickname,
                    rs.getString("PASSWORD"),
                    rs.getString("GENDER"),
                    rs.getString("PHOTO")
                );
                return user;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            jdbcUtil.close();
        }

        return null;
    }

    public boolean existingUser(String nickname) throws SQLException {
        String sql = "SELECT COUNT(*) FROM BUDDYUSER WHERE NICKNAME=?";
        jdbcUtil.setSqlAndParameters(sql, new Object[] { nickname });

        try {
            ResultSet rs = jdbcUtil.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println("Nickname: " + nickname + ", User Count: " + count); // 로그 출력
                return (count == 1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            jdbcUtil.close();
        }

        return false;
    }
}
