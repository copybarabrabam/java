<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
// 방법 1 : 회원인증정보 속성 삭제
session.removeAttribute("User id");
session.removeAttribute("UserName");

// 방법 2 : 모든 속성 한 꺼번에 삭제
session.invalidate();

// 속성 삭제 후 페이지 이동
response.sendRedirect("LoginForm.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>	
</html>