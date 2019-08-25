<%-- 
    Document   : form_menu_perfil
    Created on : 27/05/2018, 21:16:23
    Author     : Guilherme
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <script type="text/javascript">
            function confirmarExclusao(idmenu, nome, idperfil){
                if(confirm('Deseja desvincular o menu ' +nome+ '?')){
                    location.href='gerenciar_menu_perfil.do?acao=desvincular&idperfil='+idperfil+'&idmenu='+idmenu;
                }
            }
        </script>  
        
    </head>
    <body>
        
         <div>
            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
            
        </div>
        
        <div class="container">
            
            <h1>Gerenciamento de Menu e Perfil</h1>
            <form action="gerenciar_menu_perfil.do" method="post">
                <input type="hidden" id="idperfil" name="idperfil" value="${perfil.idperfil}"/>
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="perfil" class="control-label">Perfil: ${perfil.perfil}</label>
                        
                    </div>
                </div>
                
                <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="idmenu" class="control-label">Menu</label>
                        <select id="idmenu" name="idmenu" class="form-control" required>
                            <option value="">Selecione o Menu</option>
                            <c:forEach var="m" items="${perfil.naoMenus}">
                                <option value="${m.idmenu}">
                                    ${m.menu}
                                </option>
                            </c:forEach>    
                        </select>
                    </div>
                </div>
                    
                <div class="row">
                    <button class="btn btn-success">Gravar</button>
                    <a href="listar_perfil.jsp" class="btn btn-warning">Voltar</a>
                </div>
            </form>
                        
            <h2> Menus Vinculados </h2>
            <table class="table table-hover">
                <tr>
                    <th>ID</th>
                    <th>Menu</th>
                    <th>Link</th>
                    <th>Desvincular</th>
                </tr>
                
                <c:forEach var="m" items="${perfil.menus}">
                
                 <tr>
                    <td>${m.idmenu}</td>
                    <td>${m.menu}</td>
                    <td>${m.link}</td>
                    
                    <td>
                        <button class="btn btn-outline-danger" onclick="confirmarExclusao(${m.idmenu},'${m.menu}', ${perfil.idperfil})">
                            <img src="imagens/icon/delete.png" width="20%" height="20px"/>
                        </button>    
                    </td>
                 </tr>   
               </c:forEach>
                 
            
                 
                 
                 
                 
            </table>    
            
            
            
        </div>
    </body>
</html>

