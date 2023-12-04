package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.User;
import model.service.ExistingUserException;
import model.service.UserManager;

public class RegisterUserController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (request.getMethod().equals("GET")) {
            // 회원 가입 폼 요청 시 폼으로 이동
            return "/user/registerForm.jsp";
        }
        
        // 비밀번호와 비밀번호 확인이 일치하는지 확인
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        if (!password.equals(confirmPassword)) {
            // 비밀번호와 비밀번호 확인이 일치하지 않는 경우
            request.setAttribute("passwordMismatch", true);
            return "/user/registerForm.jsp";
        }

        // POST 요청: 회원 정보가 parameter로 전송됨
        User user = new User(
        	request.getParameter("name"),
            request.getParameter("password"),
            request.getParameter("gender")
        );

        try {
            // UserManager를 사용하여 사용자 생성
            UserManager manager = UserManager.getInstance();
            manager.create(user);
            return "redirect:/user/login"; // 회원 가입 성공 시 사용자 리스트 화면으로 리다이렉트--> 로그인페이지로
        } catch (ExistingUserException e) {
            // 회원 가입 실패 시 다시 회원 가입 폼으로 이동
            request.setAttribute("registerFailed", true);
            request.setAttribute("exception", e);
            request.setAttribute("user", user);
            return "/user/registerForm.jsp";
        }
    }
}
