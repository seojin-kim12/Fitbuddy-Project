package controller.mypage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class ProfileController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 프로필 페이지에 필요한 데이터를 가져와서 request에 추가
        // 예시로 userId라는 파라미터로 사용자 아이디를 받아오는 로직을 넣어보겠어요.
        String userId = request.getParameter("name");
        request.setAttribute("userId", userId); // 사용자 아이디를 request에 추가
        
        // 가져온 데이터를 활용하여 프로필 페이지로 이동
        return "/mypage/profile.jsp"; // 뷰 페이지로 이동
    }
}
