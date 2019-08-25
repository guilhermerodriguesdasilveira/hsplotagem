<%-- 
    Document   : minha_conta
    Created on : 10/06/2018, 19:40:32
    Author     : Guilherme
--%>

<%@page import="model.Usuario"%>
<%@page import="controller.GerenciarLogin"%>
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
        
         <script type="text/javascript">
            function confirmarExclusao(id, nome){
                if(confirm('Deseja excluir o usuario ' + nome+ '?')){
                    location.href="gerenciar_cliente2.do?acao=deletar&idusuario="+id;
                }
            }
        </script>
        
        
    </head>
    <body class="margem">
        
        <div>
            


            
             <%@include file="banner2.jsp" %>

             <%@include file="menu_restrito.jsp" %>
             
                <center><h3> Minha Conta  </h3></center>
            
        </div>
             <div class="container">
                 
             <form class="form-horizontal">
                
                 <div class="form-row">

                  <div class="form-group col-md-6">
                    <label for="inputNome"><b>Login:</b></label>
                    <label>${ulogado.login} </label>
                  </div>
                  
                  <div class="form-group col-md-3">
                    <label for="nome"><b>Perfil:</b> </label>
                    <label>${ulogado.perfil}  </label>
                  </div>

                 
                </div>
                 
                 
                 <div class="form-row">

                  <div class="form-group col-md-6">
                    <label for="inputNome"><b>Nome:</b></label>
                    <label>${ulogado.nome} </label>
                  </div>
                  
                  <div class="form-group col-md-3">
                    <label for="nome"><b>CPF:</b> </label>
                    <label>${ulogado.cpf}  </label>
                  </div>

                  
                </div>
                  
                  
                  
                  <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputNome"><b>Endereço:</b></label>
                    <label>${ulogado.endereco} </label>
                  </div>

                  <div class="form-group col-md-3">
                    <label for="nome"><b>Estado:</b> </label>
                    <label>${ulogado.estado}  </label>
                  </div>
                  
                  <div class="form-group col-md-3">
                    <label for="nome"><b>Cep:</b> </label>
                    <label>${ulogado.cep}  </label>
                  </div>
                </div>
                  
                  
                  
                  <div class="form-row">
                  <div class="form-group col-md-3">
                    <label for="inputNome"><b>Telefone:</b></label>
                    <label>${ulogado.telefone} </label>
                  </div>

                  <div class="form-group col-md-3">
                    <label for="nome"><b>Celular:</b> </label>
                    <label>${ulogado.celular}  </label>
                  </div>
                  
                  <div class="form-group col-md-6">
                    <label for="nome"><b>E-mail:</b> </label>
                    <label>${ulogado.email}  </label>
                  </div>
                </div>
                  
                  
                 
                  
                  
                        
                          
                  
             </form>
                  
                 <div class="container">
                     <a class="btn btn-outline-warning" href="gerenciar_cliente2.do?acao=alterar&idusuario=${ulogado.idusuario}">
                            Alterar
                        </a>
                        <button class="btn btn-outline-danger" onclick="confirmarExclusao(${ulogado.idusuario},'${ulogado.nome}')">
                            Excluir
                        </button>
                 </div>   
   
        
             </div>
   
         <img height="80px"> 
         
        <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>
    </body>
</html>
