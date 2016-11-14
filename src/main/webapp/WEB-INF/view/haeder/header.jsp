<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value="/js/jquery-3.1.1.min.js"/>"></script>
<title>메모장</title>
</head>
<style>
#NP {
	text-align :center;
	background: black;
	color:white;
}
#NP a{
	text-decoration: none;
	color:white;
}
#NP a:HOVER{
	font-weight:bold;
	border-bottom: 1px solid white;
}

#NP table {
	width:300px;
	border-collapse:collapse;
	margin :auto;
}

#NP table tr{
	border-top: 1px solid white; 
}
#NP table td:FIRST-CHILD {
	width:50px;
	border-right:1px dashed gray; 
}

#NP textarea{
	margin:10px;
	height :300px;
	background: gray;
	color: white;
	width: 300px;
}
#NP textarea:FOCUS {
	border:2px solid #0275e2;
}
#NP input[type=text]{
	margin:10px;
	background: gray;
	color: white;
	width: 300px;
}
#NP input[type=text]:FOCUS {
	border:2px solid #0275e2;
}
#NP input[type=button],#NP input[type=submit]{
	margin:20px;
	width:100px;
	height:50px;
	border-top:3px solid #cccccc;
	color : white;
	background: black;
	font-size: 15px;
	font-weight: bold;
}

</style>
<body id="NP">