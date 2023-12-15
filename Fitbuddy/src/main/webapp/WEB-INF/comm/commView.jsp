<%@page contentType="text/html; charset=utf-8" %>
<%@page import="model.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>commView</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel=stylesheet href="<c:url value='/css/commView.css' />" type="text/css">
    <title>커뮤니티-글 상세 조회</title>
 </head>
  
  <body>
    <div id="back" onClick="location.href='main_logout.html'">
        <img src="<c:url value='/images/back.png' />" />
    </div>
    <div id="logo">
        <img src="<c:url value='/images/commlogo.png' />" style="width: 110px" />
    </div>
    <div id="logout">
        <img src="<c:url value='/images/comm_logout.png' />" />
     </div> 
      <hr style="height: 2px; margin-top: 40px; background-color: white" />

      <div id="scroll">
        <div id="my">
          <div id="name">${view.userName}</div>
          <div id="profile"><img src="<c:url value='${view.profile}' />" /></div>
          <div id="image">${view.img}</div>
          <div id="date">${view.commDate}</div>
          <div id="content">${view.content}</div>
          <hr style="
              height: 2px;
              margin-top: 15px;
              margin-bottom: 40px;
              background-color: white;
            "/>
      	</div>
	</div>
     <!-- 댓글 부분 추후 추가 -->
           
</body>
</html>
