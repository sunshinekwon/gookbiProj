<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와츠유어하비</title>
</head>
<body>
<%
	String favTitle1 = request.getAttribute("FavTITLE1").toString();
	String favTitle2 = request.getAttribute("FavTITLE2").toString();
	String favTitle3 = request.getAttribute("FavTITLE3").toString();
	
	String allTitle1 = request.getAttribute("AllTITLE1").toString();
	String allTitle2 = request.getAttribute("AllTITLE2").toString();
	String allTitle3 = request.getAttribute("AllTITLE3").toString();
	
%>
	<div class="top">
		<h1>와츠유어하비</h1>
		<hr color ="blue" size="5px">
	</div>

	<div class="middle">
	    <div><h2>인기클래스</h2></div>
		<span><table>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=favTitle1 %>">${ FavTITLE1 }</a></th>
			</tr>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=favTitle1 %>">${ FavCURR1IMG1 }</a></th>
			</tr>
		</table></span>
		<span><table>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=favTitle2 %>">${ FavTITLE2 }</a></th>
			</tr>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=favTitle2 %>">${ FavCURR1IMG2 }</a></th>
			</tr>
		</table></span>
		<span><table>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=favTitle3 %>">${ FavTITLE3 }</a></th>
			</tr>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=favTitle3 %>">${ FavCURR1IMG3 }</a></th>
			</tr>
		</table></span>
		<span><a href="/hojin/favAll">더보기</a></span>
		<hr color ="blue" size="5px">
	</div>

	
	<div>
	<h2>전체클래스</h2>
		<span><table>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=allTitle1 %>">${ AllTITLE1 }</a></th>
			</tr>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=allTitle1 %>">${ AllCURR1IMG1 }</a></th>
			</tr>
		</table></span>
		<span><table>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=allTitle2 %>">${ AllTITLE2 }</a></th>
			</tr>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=allTitle2 %>">${ AllCURR1IMG2 }</a></th>
			</tr>
		</table></span>
		<span><table>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=allTitle3 %>">${ AllTITLE3 }</a></th>
			</tr>
			<tr>
				<th><a href="/hojin/oneClass?selectTitle=<%=allTitle3 %>">${ AllCURR1IMG3 }</a></th>
			</tr>
		</table></span>
	</div>


</body>
</html>