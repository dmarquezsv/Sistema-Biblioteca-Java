/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBDD;

import java.sql.*;// Importamos librria BDD

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel_Márquez
 */
// Conexión con la base de datos 
public class conexionSQL {
    Connection conectar = null;
      private Statement s =null;
    private ResultSet rs=null;
    private String query="";
   public Connection conexion()
   {
       try {
           Class.forName("com.mysql.jdbc.Driver"); // Los driver para utilizar con la base de datos 
           conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bibli","root",""); //
          
   
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error Conexión" + e.getMessage()); // Error al concetar con la base de datos
       }
       
       return conectar;
   }
   
   //Metodo que permite obtener los valores del resulset
 public ResultSet getRs() {
 return rs;
 }
 
 //Metodo que permite fijar la tabla resultado de la pregunta
 //SQL realizada
 public void setRs(String consulta) {
 try {
 this.rs = s.executeQuery(consulta);
 } catch (SQLException e2) {
 System.out.println("ERROR:Fallo en SQL: "+e2.getMessage());
 }
 }
 //Metodo que recibe un sql como parametro que sea un update,insert.delete
 public void setQuery(String query) throws SQLException {
 this.s.executeUpdate(query);
 }
 //Metodo que cierra la conexion
 public void cerrarConexion() throws SQLException{
 conectar.close();
 }
    
    
    
}

