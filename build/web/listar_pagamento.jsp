<%-- 
    Document   : listar_pagamento
    Created on : 23/05/2018, 20:43:18
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
        
         <script type="text/javascript">
            function confirmação(){
                if(confirm('O Pagamento já foi realizado !')){
                    location.href='listar_pagamento.jsp';
                }
            }
        </script>  
        
    </head>
    <body class="margem">
        
        <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
                <center><h3> Lista de Pagamentos </h3></center>
            
        </div>

             <div class="container">
            
                 <a href="form_pagamento.jsp" class="btn btn-primary">Novo Pagamento</a>
                 
               
            
            <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Valor</th>
                        <th>Data de Emissão</th>
                       
                        <th>Nome</th>
                        <th>Situação</th>
                        <th>ID Projeto</th>
                        <th>Opção</th>
                    </tr>
                   
                      <jsp:useBean id="pagamento" class="model.Pagamento"/>
                    <c:forEach var="pag" items="${pagamento.listar}">

                     <tr>
                        <td>${pag.idpagamento}</td>
                        <td><fmt:formatNumber  pattern="#,##0.00" value="${pag.valor}" /></td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${pag.dataemissao}"/></td>
                        
                        <td>${pag.usuario.nome}</td>
                        
                        <td>
                             <c:if test="${pag.situacao==true}">
                                 Em Aberto
                            </c:if>
                             <c:if test="${pag.situacao==false}">
                                 Pago
                            </c:if>
                        </td>
                        
                        <td>${pag.idprojeto}</td>
                        
                        <td>
                            <c:if test="${pag.situacao==true}">
                                
                             
                                <a class="btn btn-outline-warning" href="gerenciar_pagamento.do?acao=alterar&idpagamento=${pag.idpagamento}">
                                    Alterar
                                 </a>
                             
                                <a class="btn btn-outline-danger" href="gerenciar_pagamento.do?acao=deletar&idpagamento=${pag.idpagamento}">
                                    Excluir
                                </a>
                            </c:if>    
                            <c:if test="${pag.situacao==false}">
                               
                                <button class="btn btn-outline-success" onclick="confirmação()" >
                                        <img src="imagens/icon/visto.png" width="20%" height="20px"/>
                                </button>
                                
                            </c:if>
                            
                           
                                
                        </td>
                     </tr>   
                   </c:forEach>

                    
            </table>
        </div> 
        
    </body>
</html>

                    