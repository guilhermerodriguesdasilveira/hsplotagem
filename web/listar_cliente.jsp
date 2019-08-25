<%-- 
    Document   : listar_cliente
    Created on : 07/04/2018, 17:41:45
    Author     : Guilherme
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
            function confirmarExclusao(id, nome){
                if(confirm('Deseja excluir o usuario ' + nome+ '?')){
                    location.href="gerenciar_cliente.do?acao=deletar&idusuario="+id;
                }
            }
        </script>  
    </head>
    <body class="margem">
        
        <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
             <center><h2> Lista de Clientes </h2></center>
        </div>
        <div class="container">
            
            <a href="form_cliente.jsp" class="btn btn-primary">Novo Cadastro de Cliente</a><br><br>
                
            <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Login</th>
                        <th>Opções</th>
                    </tr>
                   
                    
                <jsp:useBean id="usuario" class="model.Usuario"/>
                <c:forEach var="u" items="${usuario.listar2}">
                
                 <tr>
                    <td>${u.idusuario}</td>
                    <td>${u.nome}</td>
                    <td>${u.email}</td>
                    <td>${u.login}</td>
                    
                    
                     
                    <td>
                        <a class="btn btn-outline-warning" href="gerenciar_cliente.do?acao=alterar&idusuario=${u.idusuario}">
                            Alterar
                        </a>
                        <button class="btn btn-outline-danger" onclick="confirmarExclusao(${u.idusuario},'${u.nome}')">
                            Excluir
                        </button>
                    </td>       
                 </tr>   
               </c:forEach>



                </table>  
        </div>
                
                
                
              
                
                    
    </body>
</html>
