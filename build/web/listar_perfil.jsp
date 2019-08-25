<%-- 
    Document   : listar_perfil
    Created on : 03/04/2018, 15:19:05
    Author     : Guilherme
--%>
<%@page import="model.Perfil"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        
        <script type="text/javascript">
            function confirmarExclusao(id, nome){
                if(confirm('Deseja excluir o perfil ' + nome+ '?')){
                    location.href="gerenciar_perfil.do?acao=deletar&idperfil="+id;
                }
            }
        </script>    
       
        
    </head>
    <body class="margem">
         <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
            
        </div>
        
            <div class="container">

               <h3>Lista de Perfis</h3>
               <a href="form_perfil.jsp" class="btn btn-primary">Novo Cadastro</a><br><br>


                <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Perfil</th>
                        <th>Opções</th>
                    </tr>

                    <jsp:useBean id="perfil" class="model.Perfil"/>
                    <c:forEach var="p" items="${perfil.listar}">

                     <tr>
                        <td>${p.idperfil}</td>
                        <td>${p.perfil}</td>
                        <td>
                            <a class="btn btn-outline-warning" href="gerenciar_perfil.do?acao=alterar&idperfil=${p.idperfil}">
                                Alterar
                            </a>
                            <button class="btn btn-outline-danger" onclick="confirmarExclusao(${p.idperfil},'${p.perfil}')">
                                Excluir
                            </button>  
                            <a class="btn btn-outline-dark" href="gerenciar_menu_perfil.do?acao=gerenciar&idperfil=${p.idperfil}">
                                Gerenciar
                            </a>    
                        </td>
                     </tr>   
                   </c:forEach>


                </table>    
            
        </div>
    </body>
</html>
