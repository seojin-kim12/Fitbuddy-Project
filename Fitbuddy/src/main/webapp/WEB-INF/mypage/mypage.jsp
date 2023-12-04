<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
    <!-- 여기에 필요한 스타일시트 링크 등을 추가할 수 있습니다. -->
</head>
<body>
    <!-- 프로필(이름, 이미지) 영역 -->
    <div class="profile-section">
        <h2>프로필</h2>
        <jsp:include page="profile.jsp"/>
			<c:if test="${userId eq param.uid}">
				<jsp:include page="profile_edit.jsp"/>
			</c:if>
		<hr/>
    </div>

    <!-- 오늘 일정 불러오기 영역 -->
    <div class="schedule-section">
        <h2>오늘 일정</h2>
        <div class="schedule-info">
            <!-- 여기에 오늘 일정을 표시하는 내용 추가 -->
            <a href="">일정 정보 바로가기</a>
            <div class="schedule-post">
                <!-- 여기에 한 개의 게시글 내용 추가 -->
                <c:if test="${userId eq param.uid}">
					<jsp:include page="mySchedule.jsp"/>
				</c:if>
            </div>
        </div>
        
    </div>

    <!-- 매칭결과 영역 -->
    <div class="matching-section">
        <h2>매칭 결과</h2>
        <div class="matching-info">
            <!-- 게시글 한 개만 보이고, 전체 보기로의 링크 추가 -->
            <a href="">매칭 게시글 전부 보기</a>
            <div class="single-post">
                <!-- 여기에 한 개의 게시글 내용 추가 -->
                <c:if test="${userId eq param.uid}">
					<jsp:include page="myMatching.jsp"/>
				</c:if>
            </div>
        </div>
    </div>

    <!-- 나의 게시글 불러오기 영역 -->
    <div class="my-posts-section">s
        <h2>나의 게시글</h2>
        <div class="my-posts-info">
        	<a href="">나의 게시글 전부 보기 링크</a>
        	<div class="single-post">
        		<c:if test="${userId eq param.uid}">
					<jsp:include page="myPost.jsp"/>
				</c:if>
			</div>  
        </div>
    </div>

    <!-- 나의 댓글 불러오기 영역 -->
    <div class="my-comments-section">
        <h2>나의 댓글</h2>
        <div class="my-comments-info">
           <a href="">나의 댓글 전부 보기 링크</a>
        	<div class="single-post">
        		<c:if test="${userId eq param.uid}">
					<jsp:include page="myComment.jsp"/>
				</c:if>
			</div>  
        </div>
    </div>
</body>
</html>
