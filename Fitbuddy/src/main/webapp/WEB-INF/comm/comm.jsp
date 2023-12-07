<%@page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>커뮤니티 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel=stylesheet href="<c:url value='/css/comm.css' />" type="text/css">
<script>
function commCreate() {
    if (commForm.content.value == "") {
        alert("내용을 입력하십시오.");
        commForm.content.focus();
        return false;
    } 
    commForm.submit();
}

function commList(targetUri) {
    commForm.action = targetUri;
    commForm.submit();
}
</script>
</head>
<body>
<br>
<!-- registration form  -->
<form name="commForm" method="POST" action="<c:url value='/community/create' />">
    <div id="container">
        <div id="back" onClick="location.href='commmain.html'">
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
            <div id="whiteBox">
                <div id="date">
                    <fmt:formatDate value="<%= new java.util.Date() %>" pattern="yyyy년 MM월 dd일" var="commDate" />
                </div>
	      
                <!-- 커뮤니티 생성이 실패한 경우 exception 객체에 저장된 오류 메시지를 출력 -->
                <c:if test="${creationFailed}">
                    <font color="red"><c:out value="${exception.getMessage()}" /></font>
                </c:if>
                <table class="commTable">
                    <tr height="40">
                        <td class="commCell">
                            <input type="text" style="width: 240" name="img" 
    							<c:if test="${creationFailed}">value="${comm.img}"</c:if>>
                        </td>
                    </tr>
                    <tr height="40">
                        <td class="commCell">
                            <input type="text" style="width: 240" name="content" 
    							<c:if test="${creationFailed}">value="${comm.content}"</c:if>>
                        </td>
                    </tr>	 
                </table>
            </div>
        </div>

        <table style="width: 100%">
            <tr>
                <td align="left">
                    <input type="button" value="생성" onClick="commCreate()"> &nbsp;
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
