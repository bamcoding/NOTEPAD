<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/view/haeder/header.jsp"></jsp:include>
<h1>메모</h1>
<body>
<table>
<c:forEach var="notepadList" items="${notepadList.notepadList}">
	<c:set var="number" value="${fn:split(notepadList.id,'-')}"/>
	<fmt:parseNumber type="number" value="${number[2]}" var="number"/>
	<tr>
	<td>
	${number}
	</td>
	<td><a href="<c:url value="/detail/${notepadList.id}"/>">${notepadList.subject }</a>
	<br/>
	${notepadList.createdDate }
	</td>
	</tr>
</c:forEach>
</table>
<input type="button" value="글쓰기" onclick="location.href='<c:url value="/write"/>'"/>

<form id="searchForm">
${page }
</form>

</body>
</html>

