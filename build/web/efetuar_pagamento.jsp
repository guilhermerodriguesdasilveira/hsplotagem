<%-- 
    Document   : efetuar_pagamento
    Created on : 22/06/2018, 23:13:53
    Author     : Guilherme
--%>

<%@page import="model.Pagamento" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
   
            <center> <h2> Formulário efetuar um Pagamento  </h2> </center>
            
            
            <div class="container">
                 
             <form class="form-horizontal" action="gerenciar_pagamento.do" method="post">
                 <input type="hidden" id="idpagamento" name="idpagamento" value="${pagamento.idpagamento}"/>
             
                 <div class="form-row">

                  <div class="form-group col-md-4">
                    <label for="inputNome"><b>Data Emissão:</b></label>
                    <label><fmt:formatDate pattern="dd/MM/yyyy" value="${pagamento.dataemissao}"/> </label>
                  </div>
                  
                  <div class="form-group col-md-6">
                    <label for="nome"><b>Valor:</b> </label>
                    <label><fmt:formatNumber pattern="#,##0.00" value="${pagamento.valor}" />  </label>
                  </div>

                  
                </div>
                  
            
                
            </form>
            
                    
                    
                    
        </div>
    </body>
</html>
