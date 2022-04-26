/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import javax.sql.*; // Importatmos la libreria para ejecutar  sintaxis sql
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Daniel_Márquez
 */
@WebServlet(name = "IngresarReserva", urlPatterns = {"/IngresarReserva"})
public class IngresarReserva extends HttpServlet {

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
         PrintWriter out=response.getWriter();
        // Hacemos la conexión con la base de datos
         ResultSet rs = null; ResultSet rs2 = null;   Connection conexion = null; // Senetencia par autilizar conexiones de base de datos
        // Variables que vamos aguardar los datos que es extraido por el formulario
        String IDLibroReservaForm = request.getParameter("LibroReservar1");
        String IDLibroEstadoForm = request.getParameter("EstadoLibro1");
        String IDUsuarioForm = request.getParameter("nUsuario1");
        String Pedido = request.getParameter("CantidadReservar1");
        String FechaPedidoForm = request.getParameter("fecha1");
        
        int p1 = Integer.parseInt(IDLibroReservaForm);
        int p2 = Integer.parseInt(IDLibroEstadoForm);
        int p3 = Integer.parseInt(IDUsuarioForm);
        int p4 = Integer.parseInt(Pedido);
     
        
        try 
        {
            
            Class.forName("com.mysql.jdbc.Driver"); //Driver para tener acceso a la base de datos
            conexion = DriverManager.getConnection ("jdbc:mysql://localhost/bibli","root", "");  // Creamos la ruta de la base de datos.
            Statement s = conexion.createStatement(); // sintaxis para realizar la consulta
            // Insertmos los datos correspondiente que extraemos del formulario  por medio de la consulta sql
            s.executeUpdate("insert into reserva (IDlibro,IDestado,IDusuario,Canitidad,FechaPedido) values ('"+p1+"','"+p2+"','"+p3+"','"+p4+"','"+FechaPedidoForm+"')");
           rs = s.executeQuery ("select * from reserva");   // Actualizamos la tabla
          conexion.close(); // Cerramos la conexión
          response.sendRedirect("ReporPresyReser.jsp"); // Nos direccionara a la misma página
        } catch (Exception e)
        {   
              out.println("<p>Error al ingresar los datos:" + e + "</p>");
            
        
        }finally
        {
          out.close(); // Cerrar la conexión  
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
