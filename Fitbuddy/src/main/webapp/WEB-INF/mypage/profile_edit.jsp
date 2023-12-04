<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form id="profile-edit" action="/userinfoUpdate" class="mypage" method="post">
	<div class="img">
		<input type="file" id="file" name="profile" accept="image/*"></input>
	</div>
	<div class="info">
		<input type="text" class="name" name="name" placeholder="이름을 입력하세요" value="${uname}" required></input>
		<input type="submit" value="수정 완료"></input>
	</div>
</form>
</body>
</html>



<!-- 프로필 수정을 위한 코드 -->
<!-- <div class="profile-edit-form">
    여기에 프로필 수정 폼 표시
    <form action="프로필_수정_서블릿_URL" method="post">
        수정할 프로필 정보 입력 폼
        <input type="text" name="userName" placeholder="이름">
        <input type="file" name="profileImage" accept="image/*">
        <button type="submit">프로필 수정</button>
    </form>
</div> -->
