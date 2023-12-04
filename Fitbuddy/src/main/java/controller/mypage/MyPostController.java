package controller.mypage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class MyPostController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 게시글 페이지에 필요한 데이터를 가져와서 request에 추가
        String postData = "게시글 데이터"; // 임의의 데이터
        request.setAttribute("postData", postData);
        
        // 가져온 데이터를 활용하여 게시글 페이지로 이동
        return "/mypage/myPost.jsp";
    }
}
