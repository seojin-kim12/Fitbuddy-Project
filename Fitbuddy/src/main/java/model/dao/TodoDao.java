package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dto.TodoDTO;
import model.dao.JDBCUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDao {
	private JDBCUtil jdbcUtil = null; // JDBCUtil 필드 선언

	public TodoDao() { // 생성자
		jdbcUtil = new JDBCUtil();
	}

//	public List<TodoDTO> getAllTodoPost() {
//
//	}

	public void insertTodo(TodoDTO todoPost) {
	
	}

	public void updateTodoPost(TodoDTO todoPost) {
	
	}

	public void deleteTodo(String postId) {

	}

	public TodoDTO getTodoPostById(String postId) {
		return null;
	}

}