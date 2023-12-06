package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.Controller;
import model.service.UserManager;

public class LoginController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	String nickname = request.getParameter("nickname");
		String password = request.getParameter("password");
		System.out.println("Attempting login with nickname: " + nickname + ", password: " + password);
		
		try {
			// 모델에 로그인 처리를 위임
			UserManager manager = UserManager.getInstance();
			boolean loginSuccess = manager.login(nickname, password);
	
			if (loginSuccess) {
                // 세션에 사용자 아이디 저장
                HttpSession session = request.getSession();
                session.setAttribute(UserSessionUtils.USER_SESSION_KEY, nickname);

                // 로그인 성공 시 "/"로 리다이렉트
                return "redirect:/";
            } else {
            	System.out.println("Login failed. Check credentials.");
                // 로그인 실패 시 loginform.jsp로 이동
                request.setAttribute("loginFailed", true);
                return "redirect:/user/loginform";
            }			
		} catch (Exception e) {
			/* UserNotFoundException이나 PasswordMismatchException 발생 시
			 * 다시 login form을 사용자에게 전송하고 오류 메세지도 출력
			 */
            request.setAttribute("loginFailed", true);
			request.setAttribute("exception", e);
			return "redirect:/user/loginform";			
		}	
    }
}
