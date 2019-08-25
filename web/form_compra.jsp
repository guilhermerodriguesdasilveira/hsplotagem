<%-- 
    Document   : form_compra
    Created on : 24/05/2018, 21:33:01
    Author     : Guilherme
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="model.Compra" %>

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
        
        <div class="container">
            
            <center> <h2> Registro de Compra</h2> </center>
            
            

            <form action="gerenciar_compra.do" method="post">
                <input type="hidden" id="idcompra" name="idcompra" value="${compra.idcompra}"/>
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="notafiscal" class="control-label">Nº da Nota Fiscal</label>
                          <input type="text" class="form-control" id="notafiscal" 
                               name="notafiscal" required maxlength="45" value="${compra.notafiscal}"/>
                    </div>
                </div>
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="datacompra" class="control-label">Data da Compra</label>
                          <input type="text" class="form-control" id="datacompra" 
                               name="datacompra" required maxlength="45" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${compra.datacompra}"/>"/>
                    </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="valor" class="control-label">Valor</label>
                          <input type="text" class="form-control" id="valor" 
                               name="valor" required maxlength="45" value="<fmt:formatNumber pattern="#,##0.00" value="${compra.valor}" />"/> 
                    </div>
                </div>
                
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    
                    <a href="listar_compra.jsp" class="btn btn-warning">Voltar</a>
                </div>
                
            </form>
            
        </div>
    </body>
</html>

<%--
    
        <%
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String mostra_data = sdf.format(data);
        
                %>
    
    
    <%= mostra_data %>

   <form action="gerenciar_compra.do" method="post">
                <input type="hidden" id="idcompra" name="idcompra" value="${compra.idcompra}"/>
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="notafiscal" class="control-label">Nº da Nota Fiscal</label>
                          <input type="text" class="form-control" id="notafiscal" 
                               name="notafiscal" required maxlength="45" value="${compra.notafiscal}"/>
                    </div>
                </div>
                    

                          <input type="hidden" id="datacompra"  name="datacompra" value="<%= mostra_data %>"/>
                 
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="valor" class="control-label">Valor</label>
                          <input type="text" class="form-control" id="valor" 
                               name="valor" required maxlength="45" value="<fmt:formatNumber pattern="#,##0.00" value="${compra.valor}" />"/> 
                    </div>
                </div>
                
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    
                    <a href="listar_compra.jsp" class="btn btn-danger">Voltar</a>
                </div>
                
            </form>
--%>