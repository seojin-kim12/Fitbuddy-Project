// CommentController.java
package controller.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controller.Controller;
import model.Comment;
import model.dao.CommentDao;

public class CommentController implements Controller {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        return "/comm/commentResult.jsp";  
    }
}
