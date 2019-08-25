<%-- 
    Document   : form_perfil
    Created on : 03/04/2018, 15:18:53
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Perfil" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
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
            
        </div>
        
        <div class="container">
            
            <center> <h2> Cadastro de Perfil </h2> </center>
           
            

            <form action="gerenciar_perfil.do" method="post">
                <input type="hidden" id="idperfil" name="idperfil" value="${perfil.idperfil}"/>
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="perfil" class="control-label">Perfil</label>
                          <input type="text" class="form-control" id="perfil" 
                               name="perfil" required maxlength="45" value="${perfil.perfil}"/>
                    </div>
                </div>
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    
                    <a href="listar_perfil.jsp" class="btn btn-warning">Voltar</a>
                </div>
                
            </form>
            
        </div>
    </body>
</html>

