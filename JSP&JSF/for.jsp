<%-- 
    Document   : index.jsp
    Created on : 13 de nov. de 2021, 07:48:36
    Author     : jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! int fontSize; %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loop For</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        
        <% for (fontSize = 1; fontSize <= 6; fontSize++) {%>
        <font color="red" size="<%= fontSize %>"> Exemplo de JSP </font>
        <br />
        <%}%>
        
    </body>
</html>
