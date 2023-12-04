package controller.mypage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

public class MyMatchingController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 매칭 페이지에 필요한 데이터를 가져와서 request에 추가
        String matchingData = "매칭 데이터"; // 임의의 데이터
        request.setAttribute("matchingData", matchingData);
        
        // 가져온 데이터를 활용하여 매칭 페이지로 이동
        return "/mypage/myMatching.jsp";
    }
}