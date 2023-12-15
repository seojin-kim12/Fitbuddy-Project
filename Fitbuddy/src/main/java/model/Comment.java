package model;

import java.util.Date;

public class Comment {
    private int commentId;
    private int postId;  // 댓글이 속한 게시글의 ID
    private String content;
    private Date commentDate;
    private String userName;  // 댓글 작성자의 이름

}