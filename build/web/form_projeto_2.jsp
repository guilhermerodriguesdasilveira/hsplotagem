<%-- 
    Document   : form_projeto_2
    Created on : 08/06/2018, 20:33:51
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recebendo projeto</title>
    </head>
    <body>
        
        <%
        
        String idpagamento = request.getParameter("idpagamento");
        String valor = request.getParameter("valor");
        
        String dataemissao = request.getParameter("dataemissao");
        
        String idprojeto = request.getParameter("idprojeto");
        String idusuario = request.getParameter("idusuario");
        
        
        
        out.print("idpagamento 1 ="+idpagamento+"<br>");
        out.print("valor 2 ="+valor+"<br>");
       
        out.print("emissao 3 ="+dataemissao+"<br>");
        out.print("projeto 4 ="+idprojeto+"<br>");
        out.print("cliente 5 ="+idusuario+"<br>");
        
        

        
        %>
        
       
        
    </body>
</html>
<%-- 

  <div class="row">
                    <div class="form-group col-sm-8">
                        <label for="cliente" class="control-label">Cliente</label>
                        <select id="idcliente" name="idcliente" class="form-control" required>
                            <option value="">Selecione o Cliente</option>
                            <jsp:useBean class="" id="cliente"/>
                            <c:forEach var="p" items="${cliente.listar}">
                                <option value="${p.idperfil}"
                                        <c:if test="${p.idperfil==usuario.perfil.idperfil}">
                                            selected
                                        </c:if>>
                                        ${p.perfil}
                                 </option>
                            </c:forEach>
                        </select>
                    </div>
                </div>



<%
        
        String idprojeto = request.getParameter("idprojeto");
        String servico = request.getParameter("servico");
        String descricao1 = request.getParameter("descricao1");
        String descricao2 = request.getParameter("descricao2");
        String dataemissao = request.getParameter("dataemissao");
        String idcliente = request.getParameter("idcliente");
        String datavalidadeano = request.getParameter("datavalidadeano");
        String datavalidademes = request.getParameter("datavalidademes");
        
        String data = datavalidadeano + "/"+datavalidademes ;
        
        
        out.print("idproj 1 ="+idprojeto+"<br>");
        out.print("serv 2 ="+servico+"<br>");
        out.print("des 3 ="+descricao1+"<br>");
        out.print("des 4 ="+descricao2+"<br>");
        out.print("emissao 5 ="+dataemissao+"<br>");
        out.print("cliente 6 ="+idcliente+"<br>");
        out.print("7 ="+datavalidademes+ "/" +datavalidadeano+"<br>");
        

        out.print("11 ="+data+"<br>");
        %>














<div class="row">
                    <div class="form-group col-sm-3">
                        <label for="datavalidade" class="control-label">data de validade</label>
                        <select id="datavalidade" name="datavalidademes" class="form-control" required>
                            <option value="">Mês</option>
                            <option value="01">01</option>
                            <option value="02">02</option>
                            <option value="03">03</option>
                            <option value="04">04</option>
                            <option value="05">05</option>
                        </select>
                        
                        
                    </div>
                      <div class="form-group col-sm-3">
                        
                        <select id="datavalidade" name="datavalidadeano" class="form-control" required>
                            <option value="">Ano</option>
                            <option value="2001">01</option>
                            <option value="2002">02</option>
                            <option value="2003">03</option>
                            <option value="2004">04</option>
                            <option value="2005">05</option>
                        </select>
                        
                        
                    </div>
                </div>







--%>