<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ko-KR">
<head>
    <title>사용자 관리 - 회원 가입</title>
<!--     <link rel="stylesheet" href="/Fitbuddy-Project/Fitbuddy/src/main/webapp/WEB-INF/resources/css/signup.css"> -->
<!-- 	<link rel="stylesheet" href=Fitbuddy/css/signup.css">  -->
<!-- <link rel="stylesheet" href="/Fitbuddy/css/signup.css"> -->
<script>
        function displayErrorMessageAndRedirect(errorMessage) {
            document.getElementById('errorMessage').innerText = errorMessage;
            const myModal = new bootstrap.Modal(document.getElementById('errorMessageModal'));
            myModal.show();
            setTimeout(() => {
                window.location.href = "/Fitbuddy/user/register"; // 다시 등록 페이지로 리다이렉션
            }, 3000);
        }
    </script>
<style>
/* 가입 버튼 스타일 */
.join-button {
  width: 100%;
  height: 44px;
  background: #c2ac18;
  border-radius: 20px;
  text-align: center;
  line-height: 44px;
  cursor: pointer;
  color: black;
  font-size: 20px;
  font-weight: 500;
}
/* 회원가입 폼 스타일 */
.registration-form {
  width: 375px;
  padding: 50px 25px;
  position: absolute;
  color: white;
  font-size: 25px;
  font-weight: 600;
}
body {
  margin: 0;
  padding: 0;
  background: black;
  font-family: Inter, sans-serif;
  position: relative;
}

/* 상단 바 스타일 */
.top-bar {
  width: 375px;
  padding: 13.46px 25px 11.54px 25.96px;
  left: 7px;
  top: 0;
  position: absolute;
  justify-content: space-between;
  align-items: center;
  display: flex;
}

/* 로고 스타일 */
.logo {
  width: 200px;
  /* 원하는 크기로 조정 */
  height: 60px;
  /* 원하는 크기로 조정 */
  background: black;
  /* 배경색을 흰색으로 설정 */
}
/* 입력 필드 스타일 */
.input-field {
  width: 100%;
  height: 32px;
  padding: 7px 16px 6px;
  margin-bottom: 45px;
  border-radius: 6px;
  border: 1px #ededed solid;
  color: #787878;
  font-size: 16px;
  font-weight: 400;
}
</style>

</head>
<body>
<!-- 모달 영역 -->
<div class="modal" id="errorMessageModal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">에러 메시지</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p id="errorMessage"></p>
      </div>
    </div>
  </div>
</div>

    <h2>회원 가입</h2>
    <div class="top-bar">
            <!-- 로고 -->
        <div class="logo">
           <img class="logo" src="./images/logo(2).svg" alt="로고">
        </div>
    </div>
    <!-- <form method="POST" action="<c:url value=/'user/register'/>"> -->
    <form class="registration-form" method="POST" action="/Fitbuddy/user/register">
    <%
            // 비밀번호 불일치 메시지 출력
            Boolean passwordMismatch = (Boolean) request.getAttribute("passwordMismatch");
            if (passwordMismatch != null && passwordMismatch) {
        %>
            <div class="error-message">
                비밀번호가 일치하지 않습니다.
            </div>
        <% } %>

        <%
            // 이미 존재하는 사용자 메시지 출력
            String existingUserMessage = (String) request.getAttribute("existingUserMessage");
            if (existingUserMessage != null) {
        %>
            <div class="error-message">
                <%= existingUserMessage %>
            </div>
        <% } %>
    	<label for="name">이름:</label>
        <input type="text" id="name" name="nickname" class="input-field" placeholder="사용자 이름" required ><br><br> 
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
