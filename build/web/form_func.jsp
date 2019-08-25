<%-- 
    Document   : form_func
    Created on : 08/04/2018, 13:45:36
    Author     : Guilherme
--%>


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
             
             <center><h2> Formulário para Cadastrar Funcionário </h2></center>
        
        </div>
             
              <div class="container">
           
            <form action="gerenciar_funcionario.do" method="post">
                
                <input type="hidden" id="idusuario" name="idusuario" value="${usuario.idusuario}"/>
                
                <input type="hidden" id="idperfil" name="idperfil" value="3"/>
                
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
                               name="telefone" required maxlength="22" value="${usuario.estado}"/>
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
                    <a href="listar_func.jsp" class="btn btn-warning">Voltar</a>
                </div>
            </form>
            
        </div>
    </body>
</html>

