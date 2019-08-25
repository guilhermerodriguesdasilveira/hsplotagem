<%-- 
    Document   : administracao
    Created on : 02/04/2018, 10:01:41
    Author     : Guilherme
--%>

<%@page import="model.Usuario"%>
<%@page import="controller.GerenciarLogin"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
        <link rel="icon" type="image/png" href="imagens/icon/hsplot2.png">
        
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
                <script src="jquery/jquery-3.2.1.slim.min.js" ></script>
                <script src="popper.js/dist/umd/popper.min.js" ></script>
                <script src="bootstrap/js/bootstrap.min.js"></script>
                  
        <title>HS Plotagem & Desenho</title>
    </head>
    <body class="margem">
        
        <div>

            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
                <center><h3> Seja Bem Vindo
                    <c:if test="${ulogado != null}">${ulogado.nome}</c:if>
                    </h3></center>
            
        </div>
             
                    <img height="250px">    
           
       <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>
        
    </body>
</html>
