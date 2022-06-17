<!DOCTYPE html>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>

<html>
<head>
<meta charset="utf-8">
<title>Elenco</title>
</head>
<body>
<h1>ELENCO</h1>
<a href="http://localhost:8080/Prj12_LibreriaWeb/" title="libri" class="pulsante">libri</a>


<ul>

<% List<Libro> libri = (List<Libro>)request.getAttribute("ElencoLibri");%>


<%for(Libro l : libri) {%>

	<li> <a href="detail.jsp?id=<%= l.getId() %>" target="_blank"> <%= l.getTitolo() %> </a></li>	
	
<% } %>

</ul>





</body>
</html>