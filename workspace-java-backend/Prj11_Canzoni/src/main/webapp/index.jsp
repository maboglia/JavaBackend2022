<!DOCTYPE html>
<%@page import="dao.CanzoneDAO"%>
<%@page import="model.Canzone"%>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<h1>Funziona?</h1>

<ul>
<% CanzoneDAO cd = new CanzoneDAO(); %>

<% for (Canzone c : cd.getCanzoni()) { %>
	<li> <a href="https://www.google.com/search?q=<%= c.getTitolo() %>" target="_blank"> <%= c.getTitolo() %> </a> </li>
<% } %>

</ul>

<script type="text/javascript">

</script>

</body>
</html>