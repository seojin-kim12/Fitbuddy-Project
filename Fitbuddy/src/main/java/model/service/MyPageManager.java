package model.service;

import java.util.List;
import model.Community;
import model.User;
import model.dao.MypageDAO;

public class MyPageManager {

    private MypageDAO mypageDAO;

    public MyPageManager() {
        this.mypageDAO = new MypageDAO();
    }

    // 사용자가 작성한 게시글 가져오기
    public List<Community> getUserPosts(int userId) {
        try {
            return mypageDAO.getUserPosts(userId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 사용자 정보 가져오기
    public User getUserById(int userId) {
        try {
            return mypageDAO.getUserById(userId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // 다른 필요한 메서드들을 추가로 구현해야 함
}
