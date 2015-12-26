<%@ include file="head.jsp"%>
<body>
	<c:if test="${user_role != role}">
		<%
			response.sendRedirect("controller?command=main");
		%>
	</c:if>
	<div id="main_block"><%@ include file="service_jsp/header.jsp"%>
		<%@ include file="service_jsp/menu.jsp"%>
		<div id="window">profile</div>
		<%@ include file="service_jsp/footer.jsp"%>
	</div>
</body>
</html>