<%@page import=”loja.FrotaCarro” %>
    <%@page import=”loja.Carro”%>

        <head>
            <style type=”text/css”>
                table,
                tr,
                td {
                    border: 1px solid black;
                }
            </style>
        </head>
        <html>

        <body>
            <table>
                <% FrotaCarros frota=new FrotaCarros(); for (Carro carro : frota.getCarros()) { %>
                    <tr>
                        <td>
                            <%=carro.getCor()%>
                        </td>
                        <td>
                            <%=carro.getMarca()%>
                        </td>
                    </tr>
                    <% } %>
            </table>
        </body>

        </html>