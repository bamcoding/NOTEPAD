<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="/WEB-INF/view/haeder/header.jsp"></jsp:include>

<form method="post" action="<c:url value="/doEdit"/>">
	<input type="hidden" name="id" value="${notepad.id }">
	<label for="subject">제목 : </label>
	<input type="text" name="subject" id="subject" value="${notepad.subject }"/><br/>
	<label for="content">내용 : </label>
	<textarea name="content" id="content">${notepad.content }</textarea><br/>
<input type="submit" value="등록" />
</form>
</body>
</html>

