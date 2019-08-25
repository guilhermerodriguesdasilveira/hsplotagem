<%-- 
    Document   : form_cliente
    Created on : 04/04/2018, 20:21:45
    Author     : Guilherme
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Usuario" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
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
    <body>
        <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
                <center><h3> Cadastro de Cliente </h3></center>
            
        </div>
        
        
        <div class="container">
           
            <form action="gerenciar_cliente.do" method="post">
                
                <input type="hidden" id="idusuario" name="idusuario" value="${usuario.idusuario}"/>
                
                <input type="hidden" id="idperfil" name="idperfil" value="2"/>
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="nome" class="control-label">Nome</label>
                        <input type="text" class="form-control" id="nome" 
                               name="nome" required maxlength="45" value="${usuario.nome}"/>
                    </div>
                </div>
                    
                 <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="cpf" class="control-label">CPF</label>
                        <input type="text" class="form-control" id="cpf" 
                               name="cpf" required maxlength="45" value="${usuario.cpf}"/>
                    </div>
                </div>
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="endereco" class="control-label">Endereco</label>
                        <input type="text" class="form-control" id="endereco" 
                               name="endereco" required maxlength="45" value="${usuario.endereco}"/>
                    </div>
                </div>
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="estado" class="control-label">Estado UF</label>
                        <input type="text" class="form-control" id="estado" 
                               name="estado" required maxlength="2" value="${usuario.estado}"/>
                    </div>
                </div>
                    
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="cep" class="control-label">Cep</label>
                        <input type="text" class="form-control" id="cep" 
                               name="cep" required maxlength="20" value="${usuario.cep}"/>
                    </div>
                </div>
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="telefone" class="control-label">telefone</label>
                        <input type="text" class="form-control" id="telefone" 
                               name="telefone" required maxlength="22" value="${usuario.telefone}"/>
                    </div>
                </div>
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="celular" class="control-label">Celular</label>
                        <input type="text" class="form-control" id="celular" 
                               name="celular" required maxlength="22" value="${usuario.celular}"/>
                    </div>
                </div>
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="email" class="control-label">E-mail</label>
                        <input type="email" class="form-control" id="email" 
                               name="email" required maxlength="40" value="${usuario.email}"/>
                    </div>
                </div>
                    
                    
                    
                    
                    
                    
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="login" class="control-label">Login</label>
                        <input type="text" class="form-control" id="login" 
                               name="login" required maxlength="45" value="${usuario.login}"/>
                    </div>
                </div>
                 <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="senha" class="control-label">Senha</label>
                        <input type="password" class="form-control" id="senha" 
                               name="senha" required maxlength="45" value="${usuario.senha}"/>
                    </div>
                    
                    
                    
                    
                    
                </div> 
                            
                    
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    <a href="listar_cliente.jsp" class="btn btn-warning">Voltar</a>
                </div>
            </form>
            
        </div>
    </body>
</html>
