
	<%@page import="model.Oggetto"%>
<%@page import="java.util.List"%>
<h1>Tabella ${titolo}</h1>
<!-- commento html -->
<table>
  <tr>
    <th>Articolo</th>
    <th>Prezzo</th>
  </tr>
  
  <% List<Oggetto> articoli = (List<Oggetto>) request.getAttribute("oggettiContrabbando");  %>
  
  <% for (Oggetto articolo: articoli){ %>
  <tr>
    <td><%= articolo.getNome() %></td>
    <td><%= articolo.getPrezzo() %></td>
  </tr>
  <% } %>
</table>
