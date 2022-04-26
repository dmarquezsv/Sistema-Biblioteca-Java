/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesLogin;
import FormularioInicio.*;
import ClasesDeAdministrador.*;
import ClasesDeBibliotecario.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import HerraminetasGenerales.*;



/**
 *
 * @author Daniel_Márquez
 */
public class MetodosLogin {
    
    //instanciamos el pool de direcciones y dirigir formulario donde se encuentran todas las direcciones de las plataformas a utilzar
    pool metodosPool = new  pool();
    public static String Cargo;
    
    //Instanciamos los formularios del Administrador y Bibliotecario lo que serian el menu
     classDirgirFormBibli DirecionarBiblo = new classDirgirFormBibli();
     classDirigirForm DirecionarAdmin = new classDirigirForm();
     ClassRegresoLogin Login = new ClassRegresoLogin();
     
     
     
     // Variablica publica mostrar el nombre del usuario.
     public static String NombreUser;
     
    
   
   
     
     public int ValidarIngreso(){
     // Extraemos los datos digitados por el usuariio en el formulario login
     String usuario = FormularioLogin.txtUsuarioLogin.getText();
     String clave = String.valueOf(FormularioLogin.txtContrasenaLogin.getPassword());
     
     int resultado = 0;
     
     // Consulta para determinar si los datos ingresados por el usuario tiene coincidencia con los datos  de la base de datos
     String SQL ="select * from usuarios where Carnet = '"+usuario+"' and Contrasena='"+clave+"'";
     Connection conect = null;
     
         try 
         {
            conect = metodosPool.dataSource.getConnection();
            Statement st = conect.createStatement();
            ResultSet rs = st.executeQuery(SQL); // Si existe el usuarios procedemos a verificar el cargo.
            
            if(rs.next())
            {
              resultado = 1;
              String Consulta = "select IDroles, Nombre from usuarios where Carnet = '"+usuario+"' and Contrasena='"+clave+"'";
              Statement st2 = conect.createStatement();
                ResultSet rs2 = st2.executeQuery(Consulta);
                rs2.next();
                //JOptionPane.showMessageDialog(null,  "esto es el rs"+rs2.getString("IdRol"));
                //ya validado que el usurario existe en la base de datos se dirigira a cualquiera de las areas para desarrollar su trabajo 
                //dependiendo del rol asignado al momento de que el 
                //administrador los crea.
                  NombreUser = rs2.getString("Nombre");
                
                
                switch(rs2.getString("IDroles"))
                {
                    case "0": // administrador
                       JOptionPane.showMessageDialog(null, "has iniciado sesion");
                       DirecionarAdmin.menuAdmin(); // Nos dirigimos al menu del administrador
                       break;
                       
                    case "1": // Bibliotecario 
                      JOptionPane.showMessageDialog(null, "has iniciado sesion");   
                    DirecionarBiblo.MenuBibli();// Nos dirigimos al menu del Bibliotecario.
                    break;
                    
                    case "2":
                        JOptionPane.showMessageDialog(null, "Acceso Denegado para Docentes");
                        Login.RegresarLogin(); 
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "Acceso Denegado para Estudiante");
                        Login.RegresarLogin();
                        break;
                    
                    
                        
                    
                    
                }
                
            }
             
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error de conexión" + "- " + ex);
         }
         finally
         {
              try {
             conect.close();
         } catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null, "Error de conexion" + e);
         }
         }
     
     return  resultado;
     }
     

    
    
}
