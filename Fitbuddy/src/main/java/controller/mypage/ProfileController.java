package controller.mypage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.User; 
import model.service.MyPageManager; 

public class ProfileController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userIdParameter = request.getParameter("userId"); 
        
        if (userIdParameter != null && !userIdParameter.isEmpty()) {
            int userId = Integer.parseInt(userIdParameter); 
            
            MyPageManager myPageManager = new MyPageManager();
            User userProfile = myPageManager.getUserById(userId);
            
            if (userProfile != null) {
                request.setAttribute("userProfile", userProfile);
            } else {
                // 사용자 프로필이 없을 경우 로그로 확인
                System.out.println("User profile is null for userId: " + userId);
            }
        } else {
            // 사용자 아이디 파라미터가 없을 경우 로그로 확인
            System.out.println("No userId parameter found in request.");
        }
        
        return "/mypage/profile.jsp"; 
    }
}