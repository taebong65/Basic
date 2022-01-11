<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/login.css">
</head>
<body>
<div id="wrap">
        <div class="headerBox">
            <h1>로그인</h1>
            <button class="btn_close">>닫기</button>

        </div><!--.headerBox-->
      <hr>
    <div id="container">
        <span id="notice">아모레퍼시픽 뷰티포인트 통합회원 <br>
              아이디로 로그인해주세요</span>

        <form id="login_box">
           <input type="text" id="loginid" autocomplete="off" placeholder="아이디 입력"> 
           
            <input type="text" id="loginpw" autocomplete="off" placeholder="비밀번호 입력(영문,숫자,특수문자 조합)">
            
            <button type="submit" id="dologin" onclick="alert('반갑습니다')">로그인</button>
        </form>


        <labe class="id_saved"> <input type="checkbox">아이디 저장</labe>

        <ul class="etc_login">
            <li>
                <button type="button" id="mobile-login"><img src="resources/img/btn_login_mobile.png" alt=""> <span> 휴대폰 <br> 로그인</span> </button>
            </li>
            <li>
                <button type="button" id="kakao-login"><img src="resources/img/btn_login_ka.png" alt=""> <span>카카오 <br> 로그인</span></button>
            </li>
            <li>
                <button type="button" id="mobile-login"><img src="resources/img/btn_login_na.png" alt=""> <span>네이버 <br> 로그인</span></button>
            </li>
            <li>
                <button type="button" id="mobile-login"><img src="resources/img/btn_login_fb.png" alt=""> <span>페이스북</span> <br>로그인</button>
            </li>

        </ul><!--.etc_login-->

        <ul class="bottom_menu">
            <li>
                <p>
                    <a href="#">아이디 찾기</a>
                    <a href="#">비밀번호 찾기</a>
                    <a href="#">비회원 주문/조희</a>
                    
                </p>
                
            </li>
           
        </ul>

        
        <button class="join_membership">
            <span>아직 회원이 아니세요?</span>
            <em>
                회원가입
            </em>
            <span class="arrow">

            </span>
        </button>
    </div><!--#container-->


    </div><!--#wrap-->

</body>
</html>