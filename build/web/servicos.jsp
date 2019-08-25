<%-- 
    Document   : servicos
    Created on : 01/04/2018, 16:48:14
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
             
             
        </div>
             
        <div class="container">
            <center>
                <h1>Serviços</h1>
            </center>
            <!-- Columns are always 50% wide, on mobile and desktop -->
            <div class="row">
              <div class="col-md-6" > 
                   <center>
                     <img src="imagens/Projeto_de_Instalacao.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236" > 
                     
                       <h3>PROJETOS DE INSTALAÇÕES:</h3>
                       
                       <p>Elétrica</p>
                       <p>Telefone</p>
                       <p>Hidráulicas</p>
                       <p>Sanitária</p>
                       <p>Águas Pluviais</p>
                   
                   </center>
              </div>
                
              <div class="col-md-6" > 
                  <center>
                    <img src="imagens/projeto_combate.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236"  > 
                    
                    <h3>PROJETO DE COMBATE A INCÊNDIO:</h3>
                    <p>Hidrante, Iluminação de Emergência, Sinalização</p>
                    <p>Sistemas de Proteção e Descarga Atmosférica (SPDA)</p>
                    <p>Gás Liquefeito de Petróleo (GLP)</p>
                    <p>Pressurização de Escadas</p>
                    <p>Rota de fuga</p>
                    <p>Sprinklers</p>
                    
                  </center>
              </div>
              
                
            </div>
                <div class="row"> 
                <div class="col-md-6" > 
                  <center>
                    <img src="imagens/projeto_arquitetonico.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236" > 
                    
                    <h3>PROJETOS DE ARQUITETURA:</h3>
                    <p>Construção</p>
                    <p>As Built</p>
  
                  </center>
                </div>
                
               <div class="col-md-6" > 
                  <center>
                    <img src="imagens/projeto3d.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236" > 
                    
                    <h3>PROJETOS 3D</h3>
                    <p>SketchUp</p>
                    
                  </center>
                </div>
                
                </div>
                
                <div class="row"> 
                <div class="col-md-6" > 
                  <center>
                    <img src="imagens/laudo_tecnico.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236" > 
                    
                    <h3>LAUDOS TÉCNICOS:</h3>
                    <p>Habite-se</p>
                    <p>Alvará de funcionamento</p>
                    <p>Aterramento e continuidade elétrica</p>
                    <p>Estanqueidade</p>
                    
                  </center>
                </div>
                
                <div class="col-md-6" > 
                  <center>
                    <img src="imagens/ppci.png" class="rounded-circle" alt="Cinque Terre" width="304" height="236" > 
                    
                    <h2>PPCI</h2>
                    <h3>(PLANO DE COMBATE A INCÊNDIO)</h3>
  
                  </center>
                </div>
                </div>
                
                <div class="row"> 
                <div class="col-md-3">  </div>
                
                <div class="col-md-6" > 
                  <center>
                    <img src="imagens/copia_digitalizacao.jpg" class="rounded-circle" alt="Cinque Terre" width="304" height="236" > 
                    
                    <h3>DIGITALIZAÇÃO E COPIADORA:</h3>
                    <p>Documentos de Pequeno e Grande porte</p>
                    
                  </center>
                </div>
                
                 <div class="col-md-3">  </div>
                 </div>
            
        </div>
 
           
             <img height="100px">  
            
        <footer id="contact" class="footer">
            <div class="container-fluid">
                <%@include file="rodape.jsp"%>
            </div>
        </footer>
    </body>
</html>
