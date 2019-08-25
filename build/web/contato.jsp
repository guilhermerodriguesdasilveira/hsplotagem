<%-- 
    Document   : contato
    Created on : 01/04/2018, 17:58:28
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
        
        <style>
           #map {
               height: 400px;
               width: 100%;
            }
        </style>
        
        <title>HS Plotagem & Desenho</title>
    </head>
 

    <body class="margem">
        <div>
             <%@include file="nav_area_restrita.jsp" %>
            
             <%@include file="banner.jsp" %>

             <%@include file="menu.jsp" %>
             <div class="container">
                <center>
                    <h2>Contato</h2>

                    <h6>Endereço:</h6>
                    <p>Setor de Rádio e TV Norte <br> 
                       Quadra 702 Conjunto P Sala 1118 <br>
                       Edifício Brasília Rádio Center</p>
                    
                    <h6>E-mail:</h6>
                    <p><a href="mailto:hsplot@gmail.com">hsplot@gmail.com </a></p>
                    
                    <h6>Telefones:</h6>
                    <p>Fixo (61) 3326-8448<br>
                       WhatsApp (61) 9 8347-1766</p>
                    
                    <h6>Onde estamos?</h6>

                    <div id="map"></div>
                    <script>
                      function initMap() {
                        var hs = {lat: -15.784028, lng: -47.888252};
                        var map = new google.maps.Map(document.getElementById('map'), {
                          zoom: 13,
                          center: hs
                        });
                        var marker = new google.maps.Marker({
                          position: hs,
                          map: map
                        });
                      }
                    </script>
                    <script async defer
                    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC9DA2SJ8vL-Q_Wmr5446WONZ3aVThzFVw&callback=initMap">
                    </script>

                    
                </center>
             </div>
        </div>
    </body>
</html>
