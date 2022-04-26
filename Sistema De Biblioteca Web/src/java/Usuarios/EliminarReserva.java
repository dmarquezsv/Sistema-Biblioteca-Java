/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
@WebServlet(name = "EliminarReserva", urlPatterns = {"/EliminarReserva"})
public class EliminarReserva extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8"); //Uso para tildes
        PrintWriter out=response.getWriter();
        ResultSet rs = null; ResultSet rs2 = null;   Connection conexion = null; // Sentencia para utilizar la conexión con la base de datos
        String idregUSER =request.getParameter("IDRegistro2");
        try 
        {
             Class.forName("com.mysql.jdbc.Driver"); // Driver par utilizar las conexion de la base de datos
             conexion = DriverManager.getConnection ("jdbc:mysql://localhost/bibli","root", ""); // Ubicación de la base de datos y persimo para ejecutar la base de datos
             Statement s = conexion.createStatement(); //Sentencia para Eliminar el empleado  por medio de su carnet.
             s.executeUpdate("DELETE FROM reserva WHERE IDreserva='"+idregUSER+"'");
             conexion.close(); // Cerramos la conexión
              response.sendRedirect("ReporPresyReser.jsp");
            
        } catch (Exception e) 
        {
            //Error si no puedo leer el driver
            out.println("ERROR:No encuentro el driver de la BD: "+ e.getMessage());
        }
        finally
        {
            out.close(); // Cerramos la conexión  
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
