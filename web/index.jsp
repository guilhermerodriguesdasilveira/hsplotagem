<%-- 
    Document   : menu
    Created on : 31/03/2018, 22:10:47
    Author     : Administrador
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
             
         
        </div>
             
             <div class="container">
                <div class="row">

                    <div class="col-md-4" >
                        <center>
                        <img src="imagens/icon/impressora3.png" class="rounded-circle" alt="Cinque Terre" width="150" height="150" > 
                        
                        <h4>Grafica Rápida </h4>
                        <p>
                            Realizamos serviços de fotocópia e impressão, produzindo desde 
                            pequenas cópias a pedidos em grande escala.
                            
                        </p>
                        </center>
                    </div>

     
                    <div class="col-md-4" >
                        <center>
                        <img src="imagens/icon/arquitetura2.png" class="rounded-circle" alt="Cinque Terre" width="150" height="150" > 
                        
                        <h4>Projetos</h4>
                        <p>
                            Realizamos projeto arquitetônico podendo ainda ser aplicado à diferentes tipos de 
                            ambiente e de necessidades, como residenciais, comerciais e corporativos.
                            Focando em melhoria na qualidade de vida e funcionalidade do ambiente. 
                            
                        </p>
                        </center>
                    </div>
                    
                    <div class="col-md-4" >
                        <center>
                        <img src="imagens/icon/plotagem.png" class="rounded-circle" alt="Cinque Terre" width="150" height="150" > 
                        
                        <h4>Plotagem</h4>
                        <p>
                            Plotagem é uma impressão em tamanhos grandes, através de um 
                            equipamento denominado plotter. Este equipamento possui uma grande qualidade
                            de impressão podendo imprimir em grandes áreas.
                        </p>
                        </center>
                    </div>

                 </div>

                    
                 </div>
             
             
             
            <hr>
            <div class="container">
                <h3>Peça seu orçamento</h3>
                <center>
                <p>Faça seu cadastro e peça seu orçameto agora!</p>
                <p> <a href="form_login.jsp" class="btn btn-success">Acesse</a> </p>
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
