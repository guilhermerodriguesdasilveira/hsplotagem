<%-- 
    Document   : form_pagamento
    Created on : 24/05/2018, 22:32:42
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
        
        <div class="container">
            
            <center> <h2> Formulário para inserir um Pagamento  </h2> </center>
            
            
            <form action="gerenciar_pagamento.do" method="post">
                <input type="hidden" id="idpagamento" name="idpagamento" value="${pagamento.idpagamento}"/>
                
                <input type="text" class="form-control" id="dataemissao" 
                               name="dataemissao" required maxlength="45" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${pagamento.dataemissao}"/>"/>
                
                <div class="row">
                    <div class="form-group col-sm-4">
                        <label for="valor" class="control-label">Valor</label>
                          <input type="text" class="form-control" id="valor" 
                               name="valor" required maxlength="45" value="<fmt:formatNumber pattern="#,##0.00" value="${pagamento.valor}" />"/> 
                    </div>
                </div>
                

                    
                              
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="projeto" class="control-label">Projeto</label>
                        <select id="idprojeto" name="idprojeto" class="form-control" required>
                            <option value="">Selecione o projeto</option>
                            <jsp:useBean class="model.Projeto" id="projeto"/>
                            <c:forEach var="p" items="${projeto.listar2}">
                                <option value="${p.idprojeto}" 
                                        
                                        <c:if test="${p.idprojeto==pagamento.projeto.idprojeto}">
                                            selected
                                        </c:if>
                                            >
                                        ${p.idprojeto}
                                        ${p.servico}
                                       
                                 </option>
                                 
                            </c:forEach>
                        </select>
                    </div>
                </div>
                           
                            
                           
                            
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="usuario" class="control-label">Selecione o projeto novamente</label>
                        <select id="idusuario" name="idusuario" class="form-control" required>
                            <option value="">Selecione o projeto</option>
                           
                            <c:forEach var="p" items="${projeto.listar2}">
                                <option value="${p.idusuario}" 
                                        
                                        <c:if test="${p.idusuario==pagamento.usuario.idusuario}">
                                            selected
                                        </c:if>
                                            >
                                        ${p.idprojeto}
                                        ${p.servico}
                                        
                                 </option>
                                 
                            </c:forEach>
                        </select>
                    </div>
                </div>
                
                          
                    
                
         
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    
                    <a href="listar_pagamento.jsp" class="btn btn-warning">Voltar</a>
                </div>
                
            </form>
            
                    
                    
                    
        </div>
    </body>
</html>

