<%-- 
    Document   : produtos
    Created on : 05/09/2017, 22:13:13
    Author     : roger
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="../devsisweb/js/libs/twitter-bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../devsisweb/js/libs/jquery/jquery.slim.min.js" type="text/javascript"></script>
        <script src="../devsisweb/js/libs/twitter-bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <div class="container">
            
            <div class="row">
                <c:forEach var="produto" items="${produtos}" varStatus="stat">

                        <div class="col-xs-1 col-md-4">
                            <p>${produto.nome}</p>
                            <p>${produto.descricao}</p>
                            <p>${produto.preco}</p>
                        </div>
                        
                </c:forEach>
            </div>
            
        </div>
    </body>
</html>
