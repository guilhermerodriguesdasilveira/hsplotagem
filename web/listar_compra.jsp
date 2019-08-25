<%-- 
    Document   : compra
    Created on : 23/05/2018, 20:16:55
    Author     : Guilherme
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
             
                <center><h3> Lista dos Registros das Compras </h3></center>
                 
        </div>
        
        <div class="container">
            
            <a href="form_compra.jsp" class="btn btn-primary">Nova Compra</a>
            
                
            <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Nº da Nota Fiscal</th>
                        <th>Data da Compra</th>
                        <th>Valor</th>
                        <th>Opção</th>
                    </tr>
                    
                    
                    <jsp:useBean id="compra" class="model.Compra"/>
                    <c:forEach var="c" items="${compra.listar}">

                     <tr>
                        <td>${c.idcompra}</td>
                        <td>${c.notafiscal}</td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${c.datacompra}"/></td>
                        <td><fmt:formatNumber  pattern="#,##0.00" value="${c.valor}" /></td>
         
                        <td>
   
                            <a class="btn btn-outline-success" href="gerenciar_compra.do?acao=visualizar&idcompra=${c.idcompra}">
                                Visualizar
                            </a>
                              
                            <a class="btn btn-outline-warning" href="gerenciar_compra.do?acao=alterar&idcompra=${c.idcompra}">
                                Alterar
                            </a>
                             
                              
                        </td>
                     </tr>   
                   </c:forEach>


                </table>   
                    
        </div>
    </body>
</html>
