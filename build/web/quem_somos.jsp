<%-- 
    Document   : quem_somos
    Created on : 01/04/2018, 15:34:32
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
             <%@include file="nav_area_restrita.jsp" %>
            
             <%@include file="banner.jsp" %>

             <%@include file="menu.jsp" %>
             
             <center>
                 <h2>Quem Somos?</h2>
                 
                 <div class="container">
                    <h4>
                        A HS Digitalização e Desenho <small> CNPJ nº 06.193.897/0001-01 é 
                        uma empresa que trabalha com plotagem e projetos arquitetônicos. 
                        Mantém como conceito a qualidade e a excelência nas realizações 
                        de seus projetos. Foi fundada em março de 2004 pelo Jose Hamilton 
                        Farias Mourão, há 14 anos está localizada em Brasília no Setor de Rádio e 
                        TV Norte quadra 702 conjunto P sala 1118 edifício Brasília Rádio Center, perto 
                        do Brasília shopping e ao lado da rede globo.
                        </small>
                    </h4>
                 </div>
             </center>
        </div>
             
             <img height="150px">  
            
        <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>
    </body>
</html>
