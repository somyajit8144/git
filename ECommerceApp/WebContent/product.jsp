<%@ page import="java.util.List" %>
<%@ page import="com.ecommerce.model.Product" %>
<%
    List<Product> products = (List<Product>) request.getAttribute("products");
%>
<html>
<head><title>Product Listing</title></head>
<body>
<h2>Products</h2>
<table border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Price</th><th>Description</th>
    </tr>
    <% for(Product p : products) { %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getPrice() %></td>
        <td><%= p.getDescription() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>
