package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.Controller;
import model.service.UserManager;
import model.User;

public class LoginController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userId = request.getParameter("userId");
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");

        try {
            UserManager manager = UserManager.getInstance();
            boolean loginSuccess = manager.login(request, userId, nickname, password);

            if (loginSuccess) {
                // 로그인 성공 시 사용자 정보 가져오기
                User loggedInUser = manager.findUser(userId, nickname);

                // 세션에 사용자 정보 저장
                HttpSession session = request.getSession();
                session.setAttribute("loggedInUser", loggedInUser); // 사용자 정보 전체를 세션에 저장

                // 로그 정보 출력
                System.out.println("User session saved: " + loggedInUser.getNickname()); // 저장 로그

                // 추가된 부분: 세션 정보 확인
                if (loggedInUser != null) {
                    System.out.println("Session User Info: " + loggedInUser.getNickname());
                } else {
                    System.out.println("Session User Info is NULL");
                }

                // 로그인 성공 시 "/"로 리다이렉트
                return "redirect:/";
            } else {
                request.setAttribute("loginFailed", true);
                return "/user/loginForm.jsp";
            }
        } catch (Exception e) {
            request.setAttribute("loginFailed", true);
            request.setAttribute("exception", e);
            return "redirect:/user/loginform";
        }
    }
}