<%-- 
    Document   : meus_pagamentos
    Created on : 15/06/2018, 09:53:56
    Author     : Guilherme
--%>

<%@page import="model.Usuario"%>
<%@page import="controller.GerenciarLogin"%>
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
        
        <script type="text/javascript">
            function confirmação(){
                if(confirm('O Pagamento já foi realizado obrigado!')){
                    location.href='meus_pagamentos.jsp';
                }
            }
        </script>  
        
    </head>
    <body class="margem">
        
        <div>
            


            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
                <center><h3> Meus Pagamentos  </h3></center>
            
        </div>
             <div class="container">
                    
            <form class="form-horizontal">
                 
 
                 <div class="form-row">

                  <div class="form-group col-md-2">
                    <label for="idusuario"><b>Idusuario</b></label>
                    <label>${ulogado.idusuario} </label>
                  </div>
                  
                  <div class="form-group col-md-6">
                    <label for="idprojeto"><b>Nome</b></label>
                    <label>${ulogado.nome} </label>
                  </div>

                </div>
                  
                 

                  
             </form>
                    
                 
                  <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Valor</th>
                        
                        <th>Data da Emissão</th>
                        <th>Projeto</th>
                        <th>Situação</th>
                        <th>Opção</th>
                    </tr>
                    
                    
                    <jsp:useBean id="pagamento" class="model.Pagamento"/>
                    <c:forEach var="p" items="${pagamento.listar2}">

                     <tr>
                        <td>${p.idpagamento}</td>
                        
                        <td><fmt:formatNumber  pattern="#,##0.00" value="${p.valor}" /></td>
                        
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.dataemissao}"/></td>
                        
                        <td>${p.idprojeto}</td>
                        
                        <td>
                             <c:if test="${p.situacao==true}">
                                 Em Aberto
                            </c:if>
                             <c:if test="${p.situacao==false}">
                                 Autorizado
                            </c:if>
                        </td>
                        <td>
                            <c:if test="${p.situacao==true}">
                                <a class="btn btn-outline-success" href="gerenciar_pagamento2.do?acao=efetuar&idpagamento=${p.idpagamento}">
                                    Efetuar Pagamento
                                </a>  
                                
                                    
                                    
                                    
                            </c:if>    
                            <c:if test="${p.situacao==false}">
                               
                                    <button class="btn btn-outline-success" onclick="confirmação()" >
                                        <img src="imagens/icon/visto.png" width="20%" height="20px"/>
                                    </button>
                                
                            </c:if>
                            
                           
                                
                        </td>
                     </tr>   
                   </c:forEach>

                </table>  
        
             </div>
        <img height="80px"> 
         
        <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>
                    
    </body>
</html>
