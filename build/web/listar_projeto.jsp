<%-- 
    Document   : listar_projeto
    Created on : 23/05/2018, 20:43:40
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
             
                <center><h3> Lista de Projetos </h3></center>
            
        </div>
          
        <div class="container">
            
            <a href="form_projeto.jsp" class="btn btn-primary">Novo Projeto</a>
            
                
            <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Serviço</th>
                        <th>Data da Emissão</th>
                        <th>Cliente</th>
                        <th>Situação</th>
                        <th>Opção</th>
                    </tr>
                    
                    
                    <jsp:useBean id="projeto" class="model.Projeto"/>
                    <c:forEach var="p" items="${projeto.listar}">

                     <tr>
                        <td>${p.idprojeto}</td>
                        <td>${p.servico}</td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.dataemissao}"/></td>
                        
                        <td>  ${p.usuario.nome} </td>
               
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
                                <a class="btn btn-outline-success" href="gerenciar_projeto.do?acao=visualizar&idprojeto=${p.idprojeto}">
                                    Visualizar
                                 </a>
                             
                                <a class="btn btn-outline-warning" href="gerenciar_projeto.do?acao=alterar&idprojeto=${p.idprojeto}">
                                    Alterar
                                 </a>
                             
                                <a class="btn btn-outline-danger" href="gerenciar_projeto.do?acao=deletar&idprojeto=${p.idprojeto}">
                                    Excluir
                                </a>
                            </c:if>    
                            <c:if test="${p.situacao==false}">
                               
                                <a class="btn btn-outline-success" href="gerenciar_projeto.do?acao=visualizar&idprojeto=${p.idprojeto}">
                                    Visualizar
                                </a>
                            </c:if>
                            
                           
                                
                        </td>
                     </tr>   
                   </c:forEach>

                </table>  
        </div>
             
    </body>
</html>
