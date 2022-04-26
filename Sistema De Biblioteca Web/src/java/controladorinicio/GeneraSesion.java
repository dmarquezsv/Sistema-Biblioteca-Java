/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorinicio;
import controladorinicio.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Daniel_Márquez
 */
@WebServlet(name = "GeneraSesion", urlPatterns = {"/GeneraSesion"})
public class GeneraSesion extends HttpServlet {
            
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String usuario = request.getParameter("carnet");
            String password = request.getParameter("contra");  
            
            try
            {
                Conexion con = new Conexion();
                 //buscará una coincidencia (count usuario), si es correcto
                 //podrá loguearse
                 con.setRs("select  * from  usuarios where Carnet = '"+usuario+"' and Contrasena='"+password+"'");
                 ResultSet rs = con.getRs();
                 
                 rs.next();
                 if (rs.getInt("IDroles")== 2 &&  rs.getInt("IDservicio")==0) // Docente
                 {
                    response.sendRedirect("home.jsp"); //Nos dirigie a la página web
                     request.getSession().setAttribute("usuario",rs.getString("Nombre"));
                     request.getSession().setAttribute("iduser",rs.getInt("IDusuario"));
                     request.getSession().setAttribute("cargo",rs.getInt("IDroles")); 
                   
                    
                 }else if(rs.getInt("IDroles")== 3 && rs.getInt("IDservicio") == 0) // Estudiante
                 {
                     response.sendRedirect("home.jsp"); // Nos dirige a la página web
                     request.getSession().setAttribute("usuario",rs.getString("Nombre"));
                     request.getSession().setAttribute("iduser",rs.getInt("IDusuario"));
                     request.getSession().setAttribute("cargo",rs.getInt("IDroles"));
                    
                     
                     
                 }
                 else if(rs.getInt("IDroles")== 2 && rs.getInt("IDservicio") == 2) // Docente si posee multa
                 {   request.getSession().setAttribute("usuario",rs.getString("Nombre"));
                     response.sendRedirect("sinacceso/amolestacion.jsp"); // Nos dirige a la página web
                 }
                 else if(rs.getInt("IDroles")== 3 && rs.getInt("IDservicio") == 2) // Estudiante se posee multa
                 {
                     request.getSession().setAttribute("usuario",rs.getString("Nombre"));
                     response.sendRedirect("sinacceso/amolestacion.jsp"); // Nos dirige a la página web sin acceso
                 }
                 else if(rs.getInt("IDroles")== 2 && rs.getInt("IDservicio") == 1) //Docente no activo
                 {
                      response.sendRedirect("sinacceso/desactivo.html"); // Nos dirige a la página web sin acceso
                 }
                 else if(rs.getInt("IDroles")== 3 && rs.getInt("IDservicio") == 1)//Estudiante no activo
                 {
                     response.sendRedirect("sinacceso/desactivo.html"); // Nos dirige a la página web sin acceso
                 }
                 else
                 {
                       response.sendRedirect("index.jsp"); // Nos dirige a la página web
                       
                       
                 }
                 rs.close(); // Cerramos la conexión
                  con.cerrarConexion();
                      
                
            }
            catch(SQLException e){
                out.print(e.getMessage());
                  response.sendRedirect("index.jsp");
             } 
     }finally{
         out.close();
        }
       
    
            
       
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
