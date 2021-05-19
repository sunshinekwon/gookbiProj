<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클래스 상세</title>
</head>
<body>
	<div><h1><a href="/hojin/main">와츠유어하비</a></h1>
		<hr color ="blue" size="5px"></div>
	<div>
		<table>
			<tr>
				<td colspan="3">${ TITLE } ${ CLS_DATE } ${ CNT }</td>
				<td rowspan="3">${ INTRO }<br>${ ITEM }</td>
			</tr>
			<tr>
				<td>${ CURR1IMG }</td>
				<td>${ CURR2IMG }</td>
				<td>${ CURR3IMG }</td>
			</tr>
			<tr>
				<td>${ CURR1CONT }</td>
				<td>${ CURR2CONT }</td>
				<td>${ CURR3CONT }</td>
			</tr>
			<tr>
				<td colspan="4">${ NICKNAME } ${ MENTOR }</td>
			</tr>
		</table>
	</div>
</body>
</html>