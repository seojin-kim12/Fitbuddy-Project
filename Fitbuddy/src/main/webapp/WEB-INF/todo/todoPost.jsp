<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <<!-- CSS 파일 연결 -->
    <link rel=stylesheet href="<c:url value='/css/todoDetail.css' />" >
    <title>Document</title>
  </head>
  <body>
    <div id="container">
        <div id="logout">로그아웃</div>
        <div id="writing">2023년 9월 29일 월요일</div>
        <div id="todo">TO DO</div>

        <div id="todoList">
          <div id="todofirst"></div>
          <div id="todocheck">✓</div>
          <div id="todosecond"></div>
          <input id="todotext"></input> <!-- input 태그 수정 -->
          
          <div id="todoboxplus">+</div>
        </div>

        
    </div>


  </body>
</html>
