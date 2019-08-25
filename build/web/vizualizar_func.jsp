<%-- 
    Document   : vizualizar_func
    Created on : 11/04/2018, 11:04:27
    Author     : Guilherme
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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


        <%
            String idfunc = request.getParameter("idfunc");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                final String URL = "jdbc:mysql://localhost:3306/db_teste";
                final String USER = "root";
                final String SENHA = "";

                Connection conn = DriverManager.getConnection(URL, USER, SENHA);
                String sql = "SELECT * FROM funcionario,estados,perfil where funcionario.id_perfil = perfil.id_perfil and funcionario.id_estado = estados.id_estado and id_func = " + idfunc;
                Statement stm = conn.createStatement();
                ResultSet rs = stm.executeQuery(sql);

                while (rs.next()) {


        %>



        <div>

            <%@include file="banner2.jsp" %>

            <%@include file="menu_restrito.jsp" %>

            <center><h2> Vizualizar Funcionário </h2></center>
        </div>

        <div class="container">

            <form name="form">
                   
                    <div class="form-row">
                      <div class="form-group col-md-6">
                        <label for="inputNome"><b>Nome:</b></label>
                        <label><%= rs.getString("nome") %> </label>
                      </div>

                      <div class="form-group col-md-4">
                        <label for="selecione_perfil"><b>Perfil Selecionado:</b> </label>
                        <label><%=rs.getString("perfil")%>  </label>
                      </div>
                     </div>

                      <div class="form-row"> 
                      <div class="form-group col-md-4">
                        <label for="inputCPF"><b>CPF: </b></label>
                       <label><%=rs.getString("cpf")%></label>
                      </div>

                      <div class="form-group col-md-4">
                        <label for="inputRG"><b>RG: </b></label>
                        <label><%=rs.getString("rg")%>  </label>
                      </div>
                      <div class="form-group col-md-4">
                         <label for="example-date-input"><b>Data Nascimento:</b></label>
                         <label><%=rs.getString("datenasc")%></label>
                      </div> 
                      
                     </div> 
                      
                      
                      <div class="form-row"> 
                      <div class="form-group col-md-3">
                        <label for="inputTelefone"><b>Telefone: </b></label>
                       <label><%=rs.getString("Telefone")%></label>
                      </div>

                      <div class="form-group col-md-3">
                        <label for="inputCelular"><b>Celular: </b></label>
                        <label><%=rs.getString("celular")%>  </label>
                      </div>
                      
                      <div class="form-group col-md-3">
                        <label for="example-date-input"><b>Endereço:</b></label>
                         <label><%=rs.getString("endereco")%></label>
                      </div>
                      <div class="form-group col-md-3">
                         <label for="inputEstado"><b>Estado:</b></label>
                         <label><%=rs.getString("estado")%></label>
                      </div> 
                     </div> 

                      
                       <div class="form-row"> 
                       <div class="form-group col-md-6">
                        <label for="inputEmail">E-mail (Login):</label>
                        <label><%= rs.getString("email")%></label>
                      </div>    

                      <div class="form-group col-md-3">
                        <label for="inputPassword">Senha:</label>
                         <label><%= rs.getString("senha")%></label>
                      </div>

                     </div>          




                    </form>
        </div>

    </body>
    <%
                    }
                    }catch(Exception e){// 
                        out.print(e);
                    }
                
                %>
</html>
