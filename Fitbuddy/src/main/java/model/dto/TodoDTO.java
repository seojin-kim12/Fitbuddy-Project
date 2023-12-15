package model.dto;

public class TodoDTO {
	private int userId;
	private String title;
	private String content;
	private int todocheck;
	private String createdAt;
	private int todopostId;
	
	public TodoDTO() {
    }
	
	public TodoDTO(int userId, String title, String content, int todocheck, String createdAt, int todopostId) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.todocheck = todocheck;
        this.createdAt = createdAt;
        this.todopostId = todopostId;
    }
	
	public int getUserId() { return userId; }
	public void setUserId(int userId) { this.userId = userId; }
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getContent() { return content; }
	public void setContent(String content) { this.content = content; }
	
	public int getTodocheck() { return todocheck; }
	public void setTodocheck(int todocheck) { this.todocheck = todocheck; }
	
	public String getCreatedAt() { return createdAt; }
	public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
	
	public int getTodopostId() { return todopostId; }
	public void setTodopostId(int todopostId) { this.todopostId = todopostId; }
}
