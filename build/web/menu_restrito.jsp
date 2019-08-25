<%-- 
    Document   : menu_restrito
    Created on : 02/04/2018, 10:02:45
    Author     : Guilherme
--%>
<%@page import="model.Usuario"%>
<%@page import="controller.GerenciarLogin"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
            
<%
    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado",ulogado);
%>

<nav class="navbar navbar-expand-sm navbar-light bg-light" >
    <a class="navbar-brand" href="administracao.jsp">HS PLOTAGEM</a>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
        <c:if test="${ulogado!=null && ulogado.perfil!=null}">
            <c:forEach var="menu" items="${ulogado.perfil.menus}">
                
                    <li class="nav-item">
                        <a class="nav-link" href="${menu.link}">${menu.menu}
                        </a>
                    </li>
                
            </c:forEach>
        </c:if>
        
    </ul>
    
    </div>
    
    
    
    <c:if test="${ulogado != null}"> <h6>Nome: <small>${ulogado.nome}</small>   Perfil: <small>${ulogado.perfil}</small> </h6>  </c:if>
    
     <form class="form-inline">
          <a class="btn btn-outline-danger my-2 my-sm-0" href="gerenciar_login.do">Sair</a>  
     </form>  
</nav>





<%--
<nav class="navbar navbar-expand-sm navbar-light bg-light" >
  
    <a class="navbar-brand" href="administracao.jsp">HS PLOTAGEM</a>
    
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
       
        <li class="nav-item active">
          <a class="nav-link" href="minha_conta.jsp">Minha Conta <span class="sr-only">(current)</span></a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="meus_projetos.jsp" >
              Meus Projetos
          </a>
             
        </li>
        <li class="nav-item">
          <a class="nav-link" href="meus_pagamentos.jsp" >
              Meus Pagamentos
          </a>
             
        </li>
      

        <li class="nav-item">
          <a class="nav-link" href="listar_func.jsp" >
              Funcionários
          </a>
             
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="listar_cliente.jsp" >
              Clientes
          </a>
             
        </li>
        
        
        <li class="nav-item">
          <a class="nav-link" href="listar_usuario.jsp" >
              Usuário
          </a>
             
        </li>
        
        
        <li class="nav-item ">
          <a class="nav-link " href="listar_compra.jsp">
            Compras
          </a>
          
        </li>
        
        <li class="nav-item ">
          <a class="nav-link " href="listar_projeto.jsp" >
            Projetos
          </a>
          
        </li>
        
        <li class="nav-item ">
          <a class="nav-link " href="listar_pagamento.jsp" >
            Pagamentos
          </a>
          
        </li>
        
        
        <li class="nav-item ">
          <a class="nav-link " href="listar_perfil.jsp" >
            Perfis
          </a>
          
        </li>
        
         
        <li class="nav-item ">
          <a class="nav-link " href="listar_menu.jsp" >
            Menus
          </a>
          
        </li>
        
      
        
      </ul>

    </div>
    <c:if test="${ulogado != null}"> <h6>Nome: <small>${ulogado.nome}</small>   Perfil: <small>${ulogado.perfil}</small> </h6>  </c:if>
    
     <form class="form-inline">
          <a class="btn btn-outline-danger my-2 my-sm-0" href="gerenciar_login.do">Sair</a>  
      </form>  
  </nav>
        
--%>    