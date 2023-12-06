<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="todomain.css"> <!-- CSS 파일 연결 -->
    <style>
      #container {
        width: 375px;
        min-height: 667px;
        margin: 0px auto;
        text-align: center;
        background: black; /* 검정색 배경 추가 */
        position: relative;
        overflow: auto;
        border: 1px solid black;
      }

      /* image 1 */
      #logo {
        position: absolute;
        width: 145px;
        height: 81px;
        left: 123px;
        top: 50px;
        background: url(image);
      }

      /* 로그아웃 */
      #logout {
        position: absolute;
        width: 48px;
        height: 16px;
        left: 308.25px;
        top: 77px;
        font-family: 'Inter';
        font-style: normal;
        font-weight: 600;
        font-size: 12px;
        line-height: 16px;
        /* identical to box height */
        color: #FFFFFF;
      }

      /* TO DO 작성 + */
      #writing {
        position: absolute;
        width: 126px;
        height: 28px;
        left: 132px;
        top: 149px;
        font-family: 'Inter';
        font-style: normal;
        font-weight: 600;
        font-size: 20px;
        line-height: 24px;
        color: #FFFFFF;
      }

      /*날짜 추가(글 박스)*/
      #box {
        box-sizing: border-box;
        position: absolute;
        height: 41px;
        left: 23px;
        right: 22px;
        top: 195px;
        background: #000000;
        border: 2px solid #FFFFFF;
        border-radius: 10px;
      }

      /* 2023년 9월 25일 월요일 - 박스안 글씨 */
      #boxtitle {
        position: absolute;
        width: 100%;
        height: 100%;
        left: 0;
        top: 0;
        font-family: 'Inter';
        font-style: normal;
        font-weight: 400;
        font-size: 18px;
        line-height: 41px;
        color: #FFFFFF;
        text-align: center;
        display: flex; /* 수직 가운데 정렬을 위해 flex 사용 */
        justify-content: center; /* 수직 가운데 정렬을 위해 flex 사용 */
        align-items: center; /* 수직 가운데 정렬을 위해 flex 사용 */
      }

      #div1 {
        top: 170px;
      }

      /* 새로운 TO DO 항목 스타일 */
      .todo {
        box-sizing: border-box;
        height: 41px;
        width: calc(100% - 50px);
        margin: 0 auto;
        background: #000000;
        border: 2px solid #FFFFFF;
        border-radius: 10px;
        margin-bottom: 10px;
        display: flex;
        justify-content: center;
        align-items: center;
        color: #FFFFFF;
        font-family: 'Inter';
        font-style: normal;
        font-weight: 400;
        font-size: 18px;
        line-height: 41px;
        text-align: center;
      }

      #footer_box {
        width: 375px;
        height: 97px;
        box-sizing: border-box;
        position: absolute;
        background: #ffffff;
        border: 1px solid #d9d9d9;
        box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
        padding-top: 10px;
        top: 570px;
      }
    </style>
    <title>Document</title>
  </head>
  <body>
    <div id="container">
      <div id="logout">로그아웃</div>
      <div id="writing">TO DO 작성+</div>
      <div id="todoList"></div>
      <!-- TO DO 항목을 표시할 컨테이너 추가 -->
      <!-- <div id="box">
            <div id="boxtitle">2023년 9월 25일 월요일</div>
        </div> -->

      <div id="footer_box">
        <img id="link" src="./images/link.svg" />&nbsp;&nbsp;&nbsp;
        <img id="talk" src="./images/talk.svg" />&nbsp;&nbsp;&nbsp;
        <img id="main" src="./images/main.svg" />&nbsp;&nbsp;&nbsp;
        <img id="note" src="./images/note.svg" />&nbsp;&nbsp;&nbsp;
        <img id="my" src="./images/my.svg" />
      </div>
    </div>

    <!-- Java 코드를 사용하는 부분 -->
    <%-- Java 코드를 사용할 부분에는 여기에 작성하십시오. --%>

  </body>
</html>
