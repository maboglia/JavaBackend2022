<!DOCTYPE html>
<%@page import="dao.CanzoneDAO"%>
<%@page import="model.Canzone"%>
<html>
<head>
<meta charset="utf-8">
<title>Elenco</title>
</head>
<body>
<h1>ELENCO</h1>
<a href="http://localhost:8080/Prj11_Canzoni/" title="canzoni web" class="pulsante">canzoni web</a>


<ul>

<% CanzoneDAO cd = new CanzoneDAO();%>


<%for(Canzone c : cd.getCanzoni()) {%>

	<li> <a href="detail.jsp?id=<%= c.getId() %>" target="_blank"> <%= c.getTitolo() %> </a></li>	
	
<% } %>

</ul>





</body>
</html>