/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Perfil;
import model.Usuario;
import model.UsuarioDAO;

/**
 *
 * @author Administrador
 */
public class GerenciarCliente2 extends HttpServlet {

    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
            
            String mensagem = "";
            try{
                int idusuario  = Integer.parseInt(request.getParameter("idusuario"));
                Usuario u = new Usuario();
                if(request.getParameter("acao").equals("alterar")){
                    
                        Usuario novo = new Usuario();
                        novo = u.getCarregaPorId(idusuario);
                        //out.print(novo.getIdperfil());
                        if(novo.getIdusuario()>0){
                                RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_cliente_logado.jsp");
                            request.setAttribute("usuario", novo);
                            disp.forward(request,response);
                        }else{
                            mensagem = "Usuario não encontrado!";
                        }
                    
                }
                if(request.getParameter("acao").equals("deletar")){
                     
                        u.setIdusuario(idusuario);
                        if(u.deletar()){
                            mensagem = "Excluído com sucesso!";
                            
                        }else{
                            mensagem = "Erro ao excluir!";
                        }
                    
                }
                
                
                
                
                
                
            }catch(Exception e){
                out.print(e);
                //mensagem = "Erro ao excluir!";
            }
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='form_login.jsp';");
            out.println("</script>");
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            PrintWriter out = response.getWriter();
            String idusuario = request.getParameter("idusuario");
            String nome = request.getParameter("nome");
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            String cpf = request.getParameter("cpf");
            String endereco = request.getParameter("endereco");
            String estado = request.getParameter("estado");
            String cep = request.getParameter("cep");
            String telefone = request.getParameter("telefone");
            String celular = request.getParameter("celular");
            String email = request.getParameter("email");
            
            
            String idperfil = request.getParameter("idperfil");
            String mensagem = "";
            Usuario u = new Usuario();
            if(!idusuario.isEmpty()){
                u.setIdusuario(Integer.parseInt(idusuario));
            }
            u.setNome(nome);
            u.setLogin(login);
            u.setSenha(senha);
            
            u.setCpf(cpf);
            u.setEndereco(endereco);
            u.setEstado(estado);
            u.setCep(cep);
            u.setTelefone(telefone);
            u.setCelular(celular);
            u.setEmail(email);
           
           
            Perfil p = new Perfil();
            p.setIdperfil(Integer.parseInt(idperfil));
            u.setPerfil(p);
            
            try{
                if((nome.equals("")) || (nome.isEmpty()) ||
                    (login.equals(""))||(login.isEmpty()) ||
                     senha.equals("") || (senha.isEmpty())||
                     idperfil.equals("") || (idperfil.isEmpty())){
                    mensagem = "Campos obrigatórios devem ser preenchidos";
                }else{
                    if(u.gravar()){
                        mensagem = "Gravado com sucesso!";
                    }else{
                        mensagem = "Erro ao gravar no banco!";
                    }
                }                
            }catch(Exception e){
                out.print(e);
                mensagem = "Erro ao gravar no banco     ! ";
            }
            
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='minha_conta.jsp';");
            out.println("</script>");
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
