<%-- 
    Document   : visualizar_compra
    Created on : 24/05/2018, 21:25:55
    Author     : Guilherme
--%>
<%@page import="model.Compra"%>


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
             
                <center><h3> Visualizar compra </h3></center>
            
        </div>
        
      
        
        
        <div class="container">
                <center><h3>  </h3></center>
               <form name="form">
                   
                    <div class="form-row">
                      
                        <div class="form-group col-md-2">   </div>
                        
                      <div class="form-group col-md-4">
                        <label for="inputNome"><b>Nº da Nota Fiscal:</b></label>
                        <label> ${compra.notafiscal} </label>
                      </div>
                      
                     </div>
                      
                      <div class="form-row">
                          <div class="form-group col-md-2">   </div>
                          
                      <div class="form-group col-md-4">
                        <label for="inputDate"><b>Data da Compra:</b></label>
                        <label> ${compra.datacompra} </label>
                      </div>
                      
                      <div class="form-group col-md-6">
                        <label for="inputValor"><b>Valor:</b></label>
                        <label> ${compra.valor} </label>
                      </div>
                      
                     </div>
                      
                    <div class="form-row">
                      <div class="form-group col-md-2">   </div>
                      
                      <div class="form-group col-md-6">
                        
                          
                          <a href="listar_compra.jsp" class="btn btn-block btn-warning">Voltar</a>
                      </div>
                      
                     </div>
                      
                    </form>
                   
        </div>
                    
        
    </body>
</html>
