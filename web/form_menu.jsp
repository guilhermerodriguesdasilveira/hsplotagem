<%-- 
    Document   : form_menu
    Created on : 27/05/2018, 21:16:59
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Menu" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="estilo/estilo.css">
        <link rel="icon" type="image/png" href="imagens/icon/hsplot2.png">
        
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
                <script src="jquery/jquery-3.2.1.slim.min.js" ></script>
                <script src="popper.js/dist/umd/popper.min.js" ></script>
                <script src="bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body class="margem">
        
         <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
        </div>
        
        <div class="container">
            <h1>Cadastro de Menu</h1>
            <form action="gerenciar_menu.do" method="post">
                <input type="hidden" id="idmenu" name="idmenu" value="${menu.idmenu}"/>
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="menu" class="control-label">Menu</label>
                        <input type="text" class="form-control" id="menu" 
                               name="menu" required maxlength="45" value="${menu.menu}"/>
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="link" class="control-label">Link</label>
                        <input type="text" class="form-control" id="link" 
                               name="link" required maxlength="45" value="${menu.link}"/>
                    </div>
                </div>
                
                
                    
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    <a href="listar_menu.jsp" class="btn btn-warning">Voltar</a>
                </div>
            </form>
            
        </div>
    </body>
</html>
