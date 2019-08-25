<%@page import="model.Menu"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <link rel="stylesheet" href="datatables/jquery.dataTables.min.css"/>
        <script type="text/javascript">
            function confirmarExclusao(id, nome){
                if(confirm('Deseja excluir o menu ' + nome+ '?')){
                    location.href="gerenciar_menu.do?acao=deletar&idmenu="+id;
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
            
            <center>
                <h3>Lista de Menus</h3>
            </center>
            <a href="form_menu.jsp" class="btn btn-primary">Novo Cadastro</a>
            <br /><br />
            <table class="table table-striped table-bordered table-hover display" id="listaMenu">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Menu</th>
                    <th>Link</th>
                    <th>Opções</th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th>ID</th>
                    <th>Menu</th>
                    <th>Link</th>
                    
                    <th>Opções</th>
                </tr>
                </tfoot>
                <jsp:useBean id="menu" class="model.Menu"/>
                <tbody>
                <c:forEach var="m" items="${menu.listar}">
                
                 <tr>
                    <td>${m.idmenu}</td>
                    <td>${m.menu}</td>
                    <td>${m.link}</td>
                    
                    <td>
                        <a class="btn btn-outline-warning" href="gerenciar_menu.do?acao=alterar&idmenu=${m.idmenu}">
                            Alterar
                        </a>
                        <button class="btn btn-outline-danger" onclick="confirmarExclusao(${m.idmenu},'${m.menu}')">
                            Excluir
                        </button>    
                    </td>
                 </tr>   
               </c:forEach>
                </tbody>  
            
            </table>    
            
        </div>
    </body>
    <script type="text/javascript" src="datatables/jquery.js"> </script>
    <script type="text/javascript" src="datatables/jquery.dataTables.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#listaMenu").dataTable({
              "bJQueryUI": true,
                "oLanguage": {
                    "sProcessing":   "Processando...",
                    "sLengthMenu":   "Mostrar _MENU_ registros",
                    "sZeroRecords":  "Não foram encontrados resultados",
                    "sInfo":         "Mostrando de _START_ até _END_ de _TOTAL_ registros",
                    "sInfoEmpty":    "Mostrando de 0 até 0 de 0 registros",
                    "sInfoFiltered": "",
                    "sInfoPostFix":  "",
                    "sSearch":       "Pesquisar:",
                    "sUrl":          "",
                    "oPaginate": {
                        "sFirst":    "Primeiro",
                        "sPrevious": "Anterior",
                        "sNext":     "Próximo",
                        "sLast":     "Último"
                    }
                }  
            })
            
        });
        
    </script>    
    
</html>
