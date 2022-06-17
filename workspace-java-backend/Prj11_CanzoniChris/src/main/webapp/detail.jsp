
<!DOCTYPE html>
<%@page import="dao.CanzoneDAO"%>
<%@page import="model.Canzone"%>
<html>
<head>
<meta charset="utf-8">
<title>Dettaglio</title>
</head>
<body>
<h1>Dettaglio</h1>
<%
Canzone c = new Canzone(1,"titolo","autore","genere",2022);
if(request.getParameter("id")!=null && request.getParameter("id").length()>0){
int id = Integer.parseInt(request.getParameter("id"));

CanzoneDAO repo = new CanzoneDAO();
c = repo.getCanzoneById(id);



}
%>
<p>Titolo <%= c.getTitolo() %></p>
<p>Cantante <%= c.getCantante() %></p>
<p>Genere <%= c.getGenere() %></p>
<p>Anno <%= c.getAnno() %></p>

<p><a href="https://www.google.com/search?q=<%= c.getTitolo() %>" target="_blank"> More info: <%= c.getTitolo() %> </a></p>
<a href="lista.jsp" title="lista" class="pulsante">Torna a lista</a>





</body>
</html>