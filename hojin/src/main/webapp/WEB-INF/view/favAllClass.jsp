<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와츠유어하비</title>
</head>
<body>
<%	int quanBlock = Integer.parseInt((request.getAttribute("quanBlock")).toString()); 
	String favTitle1 = request.getAttribute("FavTITLE1").toString();
	String favTitle2 = request.getAttribute("FavTITLE2").toString();
	String favTitle3 = request.getAttribute("FavTITLE3").toString();
%>
	<div class="top">
		<h1><a href="/hojin/main">와츠유어하비</a></h1>
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
		<hr color ="blue" size="5px">
	</div>
	
	<div id="pageIndex">
		<% for(int i=1;i<=quanBlock;++i){ %>
			<span><a href="/hojin/favAll?selBlock=<%= i %>">[<%= i %>] </a></span>
		<%} %>
	</div>



</body>
</html>