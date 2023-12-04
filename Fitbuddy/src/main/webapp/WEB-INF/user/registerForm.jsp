<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ko-KR">
<head>
    <title>사용자 관리 - 회원 가입</title>
<!--     <link rel="stylesheet" href="/Fitbuddy-Project/Fitbuddy/src/main/webapp/WEB-INF/resources/css/signup.css"> -->
	<link rel="stylesheet" href=Fitbuddy/css/signup.css"> 
</head>
<body>
    <h2>회원 가입</h2>
    <div class="top-bar">
            <!-- 로고 -->
        <div class="logo">
           <img class="logo" src="./images/logo(2).svg" alt="로고">
        </div>
    </div>
    <!-- <form method="POST" action="<c:url value=/'user/register'/>"> -->
    <form class="registration-form" method="POST" action="/Fitbuddy/user/register">
    	<label for="name">이름:</label>
        <input type="text" id="name" name="name" class="input-field" placeholder="사용자 이름" required ><br><br> 
        <label for="password">비밀번호:</label>
        <input type="password" id="password" class="input-field" name="password" placeholder="비밀번호" required><br><br>
        <label for="confirmPassword">비밀번호 확인:</label>
		<input type="password" id="confirmPassword" class="input-field" name="confirmPassword"><br><br>
        <label for="gender">성별</label>
        <select id="gender" name="gender">
    		<option value="male">남성</option>
    		<option value="female">여성</option>
		</select><br><br>
        <input type="submit" value="회원 가입" class="join-button" >
    </form>
</body>
</html>
