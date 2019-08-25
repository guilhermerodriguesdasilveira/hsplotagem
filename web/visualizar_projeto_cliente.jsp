<%-- 
    Document   : visualizar_projeto_cliente
    Created on : 22/06/2018, 22:28:49
    Author     : Guilherme
--%>
<%@page import="model.Projeto"%>


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
                        
                      <div class="form-group col-md-10">
                        <label for="inputNome"><b>Serviço:</b></label>
                        <label> ${compra.servico} </label>
                      </div>
                      
                      
                      
                     </div>
                      
                      <div class="form-row">
                      
                        <div class="form-group col-md-2">   </div>
                        
                      
                      
                      <div class="form-group col-md-5">
                        <label for="inputNome"><b>Data da Emissão:</b></label>
                        <label> ${compra.dataemissao} </label>
                      </div>
                      
                      <div class="form-group col-md-5">
                        <label for="inputNome"><b>Situação:</b></label>
                        
                        <label> <c:if test="${compra.situacao==true}">
                                 Em Aberto
                            </c:if>
                             <c:if test="${compra.situacao==false}">
                                 Autorizado
                            </c:if>
                        </label>
                        
                      </div>
                      
                     </div>
                      
                      
                      
                      <div class="form-row">
                          <div class="form-group col-md-2">   </div>
                          
                      <div class="form-group col-md-10">
                        <label for="inputNome"><b>Descrição 1º:</b></label>
                        <label> ${compra.descricao1} </label>
                      </div>
                      
                     </div>
                      
                       <div class="form-row">
                          <div class="form-group col-md-2">   </div>
                          
                      <div class="form-group col-md-10">
                        <label for="inputNome"><b>Descrição 2º:</b></label>
                        <label> ${compra.descricao2} </label>
                      </div>
                      
                     </div>
                      
                    <div class="form-row">
                      <div class="form-group col-md-3">   </div>
                      
                      <div class="form-group col-md-6">
                        
                          
                          <a href="meus_projetos.jsp" class="btn btn-block btn-warning">Voltar</a>
                      </div>
                      
                     </div>
                      
                    </form>
                   
        </div>
                    
         <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>
                      
    </body>
</html>

