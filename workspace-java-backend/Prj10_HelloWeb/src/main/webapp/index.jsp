<%@page import="controller.TodoCtrl"%>
<%@ include file="header.jsp" %>


<%@ include file="modulo.jsp" %>


<%
	if (request.getParameter("desc") != null){
		TodoCtrl td = new TodoCtrl();
		td.addTodo(request.getParameter("desc"));
//		out.print(request.getParameter("desc"));
	}


%>


<%@ include file="footer.jsp" %>
