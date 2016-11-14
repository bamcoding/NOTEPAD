<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/view/haeder/header.jsp"></jsp:include>
<h1>새 메모</h1>
<form method="post" action="<c:url value="/doWrite"/>">
	<input type="text" name="subject" id="subject" placeholder="제목을 입력하세요."/><br/>
	<textarea name="content" id="content" placeholder="제목을 입력하세요."></textarea><br/>
<input type="submit" value="등록" />
</form>
</body>
</html>

