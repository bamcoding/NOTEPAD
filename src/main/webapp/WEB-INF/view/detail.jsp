<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/haeder/header.jsp"></jsp:include>
<h1>상세보기</h1>
<table>
<tr><td>
${notepad.subject }
</td></tr>

<tr><td>
${notepad.content }
</td></tr>
</table>
<input type="button" value="수정" onclick="location.href='<c:url value="/edit/${notepad.id}"/>'"/>
<input type="button" value="삭제" onclick="location.href='<c:url value="/delete/${notepad.id}"/>'"/>
<input type="button" value="리스트보기" onclick="location.href='<c:url value="/"/>'"/>
</body>
</html>