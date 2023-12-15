package controller.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import model.Community;
//import model.Comment;
import model.dao.CommDao;
import model.dao.CommentDao;
import model.service.UserManager;


public class ViewCommunityController implements Controller {
	@Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    
			String postIdParam = request.getPathInfo().substring(1); 
			int postId = Integer.parseInt(postIdParam);
			UserManager manager = UserManager.getInstance();
			System.out.println("Debug코드 Post ID: " + postId);

			
            Community community = manager.findPostById(postId);

 
            request.setAttribute("community", community);
       
            // 게시글 댓글 목록 조회
//            CommentDao commentDao = new CommentDao();
            // List<Comment> commentList = commentDao.findCommentsByPostId(postId);
            // request.setAttribute("commentList", commentList);

            return "/comm/commView.jsp";  // 게시글 보기
     
        }
}