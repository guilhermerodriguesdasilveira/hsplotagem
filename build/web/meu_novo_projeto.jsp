<%-- 
    Document   : meu_novo_projeto
    Created on : 21/06/2018, 16:32:45
    Author     : Guilherme
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="model.Projeto" %>

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
        <%
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String mostra_data = sdf.format(data);
        
                %>
        
        <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
                <center><h3> Formulário para cadastro de Projeto <%= mostra_data %></h3></center>
                 
        </div>
        
        <div class="container">
            
            <form action="gerenciar_projeto2.do" method="post">
                <input type="hidden" id="idprojeto" name="idprojeto" value="${projeto.idprojeto}"/>
                <input type="hidden" id="dataemissao"  name="dataemissao" value="<%= mostra_data %>"/>
                <input type="hidden" id="idusuario" name="idusuario" value="${ulogado.idusuario}"/>
                
                
                
                
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="servico" class="control-label">Serviço</label>
                          <input type="text" class="form-control" id="servico" 
                               name="servico" required maxlength="45" value="${projeto.servico}"/>
                    </div>
                </div>
                    
                    

                <div class="form-group">
                    <label for="descricao1" class="control-label">Descrição</label>
                    <textarea class="form-control" rows="5" maxlength="250" id="descricao1" name="descricao1" >${projeto.descricao1}</textarea>
                </div>
                
                  
                            
                            
                    
                    <button type="button" class="btn btn-primary" data-toggle="collapse" data-target="#demo">Mostrar mais uma descrição</button>
                    <div id="demo" class="collapse">
                      
                        <div class="form-group" >
                            <label for="descricao2" class="control-label">Descrição</label>
                            <textarea class="form-control" rows="5" maxlength="200" id="descricao2" name="descricao2" >${projeto.descricao2}</textarea>
                        </div>
                        
                    </div>
                    
                     
                    
                     <br><br>
                <div class="row">
                    
                    <button class="btn btn-success">Gravar</button>
                    
                    <a href="meus_projetos.jsp" class="btn btn-danger">Voltar</a>
                </div>
                
            </form>

             
                    
        </div>
       <img height="80px"> 
         
        <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>                 
    </body>
</html>
