/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeAdministrador;
import FormulariosAdministrador.*;
import java.awt.*;
import javax.swing.*;
import java.util.regex.Pattern; //Validar
import java.util.regex.Matcher;
/**
 *
 * @author Daniel_Márquez
 */
public class HerraminetasAdmin {


    
    // Metodo para limpiar las cajas de textos 
    
    public void LimpiartxtRegistroUser( JTextField nombre , JTextField carnet , JTextField password , JTextField correo , JTextField telefono)
    {
        nombre.setText("");
        carnet.setText("");
        password.setText("");
        correo.setText("");
        telefono.setText("");
    }
    
    
    // Metodo para validar un correo
     public static boolean validarEmail(String email)
     {
         boolean status = false;
         
         String patterEmail ="^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" ;
         Pattern pattern = Pattern.compile(patterEmail);
         Matcher matcher = pattern.matcher(email);
         
         if (matcher.matches()) 
         {
             status = true;
             
         }else
         {
             status = false;
         }
         
         return  status;
         
     
     }
  
     // Metodos para validar carnet del usuario
     public static boolean ValidarCarnet(String carnet)
     {
         boolean status = false;
         
         String patterCarnet ="^([A-Z]){2}([0-9]){6}$" ;
         Pattern pattern = Pattern.compile(patterCarnet);
         Matcher matcher = pattern.matcher(carnet);
         
         if (matcher.matches()) 
         {
             status = true;
             
         }else
         {
             status = false;
         }
         
         return  status;
     }
    
     //Metodos para validar el número Telefonico.
     
     public static boolean ValidarTelefono(String Telefono)
     {
          boolean status = false;
         
         String patterTelefono ="^([0-9]){8}$" ;
         Pattern pattern = Pattern.compile(patterTelefono);
         Matcher matcher = pattern.matcher(Telefono);
         
         if (matcher.matches()) 
         {
             status = true;
             
         }else
         {
             status = false;
         }
         
         return  status;
     
     }
    
    
    
    
    
}
