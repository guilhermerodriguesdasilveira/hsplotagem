<%-- 
    Document   : form_login
    Created on : 27/05/2018, 21:17:50
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
    <body class="margem">
        <div >
            
             <%@include file="nav_area_restrita.jsp" %>
            
             <%@include file="banner.jsp" %>
                
             <%@include file="menu.jsp" %>
            
        </div>
        
        
        <div class="container">
            <%
                String mensagem = (String)request.getSession().getAttribute("mensagem");
                if(mensagem != null){
                    request.getSession().removeAttribute("mensagem");
                
            
            %>
            
            <div clas="alert alert-info"><%=mensagem%></div>
            <%
                }
            %>
           
            <div class="container">
            
                

            
            <div class="container">
                
                
                 <div class="row">
                     
                     <div class="col-3"></div>
                 
                    <div class="col-6">
                        <form action="gerenciar_login.do" method="post">
                        <h1 class="h1 mb-3 font-weight-normal">Login</h1>

                        <label for="inputLogin" class="control-label">Login</label>
                        <input type="text" id="login" class="form-control" 
                               name="login" placeholder="Login" required autofocus/>

                        <label for="inputSenha" class="control-label">Senha</label>
                        <input type="password" id="inputSenha" class="form-control" 
                               name="senha" placeholder="Senha" required/>

                        <div class="checkbox mb-3">
                          <label>
                            <input type="checkbox" required> Não sou robo
                          </label>
                        </div>

                        <button class="btn btn-lg btn-success btn-block" type="submit">Entrar</button>
                        <br>
                        <a href="cadastro_cliente.jsp" class="btn btn-lg btn-primary btn-block" > Não sou cadastro</a>

                        <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>       
                   
                        </form>
                    </div>
                      
                 </div>
             </div>
            
            
            
            
        </div>
    </body>
</html>

