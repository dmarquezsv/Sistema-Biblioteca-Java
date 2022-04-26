/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeBibliotecario;
import FormulariosBibliotecario.*;
import java.awt.*;
import javax.swing.*;
import java.util.regex.Pattern; //Validar
import java.util.regex.Matcher;
/**
 *
 * @author Daniel_Márquez
 */
public class HerramientasBibli {
    
    //Metodos para limpiar las cajas de textos 
    
    public void LimpiartxtRegistroBook(JTextField codigo, JTextField Titulo, JTextField autor, JTextField Cantidad, JTextField Dias, JTextField costo)
    {
        codigo.setText("");
        Titulo.setText("");
        autor.setText("");
        Cantidad.setText("");
        Dias.setText("");
        costo.setText("");
        

    }// Fin del metodos
    
    // Metodo para valida el codigo del libro
    
   public static boolean ValidarCodigoBook(String carnet)
     {
         boolean status = false;
         
         String patterCarnet ="^([A-Z]){3}([0-9]){3}$" ;
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
  
   
     public static boolean ValidarEntradaCosto(String carnet)
     {
         boolean status = false;
         
         String patterCarnet ="^\\$(\\d|-)?(\\d|,)*\\.?\\d*$" ;
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
   
     // Metodo para habiliar los texbox
     public  void ActivarTextBox( JTextField Codigo , JTextField libro , JComboBox Categoria , JTextField autor , JTextField Cantidad , JTextField prestamos , JTextField costo)
     {      
         Codigo.setEnabled(true);
         libro.setEnabled(true);
         Categoria.setEnabled(true);
         autor.setEnabled(true);
         Cantidad.setEnabled(true);
         prestamos.setEnabled(true);
         costo.setEnabled(true);
 
     }
     
     // Metodo para desahabiltar los textbox
     
     public void DesactivarTextBox(JTextField Codigo , JTextField libro , JComboBox Categoria , JTextField autor , JTextField Cantidad , JTextField prestamos , JTextField costo)
     {
         Codigo.setEnabled(false);
         libro.setEnabled(false);
         Categoria.setEnabled(false);
         autor.setEnabled(false);
         Cantidad.setEnabled(false);
         prestamos.setEnabled(false);
         costo.setEnabled(false);
         
     }
     
     // Metodo para descativar los botones
     
     public void DesactivarBotones( JButton registrar , JButton actualizar , JButton Eliminar , JButton Borrar )
     {
         registrar.setEnabled(false);
         actualizar.setEnabled(false);
         Eliminar.setEnabled(false);
         Borrar.setEnabled(false);
         
     }
     
     // Metodo para activar los botones
     public void ActivarBotones( JButton registrar , JButton actualizar , JButton Eliminar , JButton Borrar)
     {
         registrar.setEnabled(true);
         actualizar.setEnabled(true);
         Eliminar.setEnabled(true);
         Borrar.setEnabled(true);
         
     }
     
     public void HabilitarDosBotones(JButton registrar  , JButton Borrar )
     {    registrar.setEnabled(true);
          Borrar.setEnabled(true);
     }
     
     public void DesactivarDosBotones(JButton registrar  , JButton Borrar )
     {    registrar.setEnabled(false);
          Borrar.setEnabled(false);
     }
     
     
     
   
   
   
   
    
}



