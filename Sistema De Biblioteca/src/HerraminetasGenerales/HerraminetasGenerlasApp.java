/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerraminetasGenerales;
import FormulariosAdministrador.*; // Importamos los formularios del administrador
// Importamos paquetes para utilizar en los iconos
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Daniel_Márquez
 */
public class HerraminetasGenerlasApp {
    
    
     // Variables privada 
    private Image fondo;
    private int color1 = 18 ,color2 = 18,color3=92; //Colores para aplicar al boton
    private String Fuente = "Yu Gothic UI Light"; // Tipo de letra
    private  int TamanoLetra = 24; // Tamaño de la letra
    private int ColorLetra1 = 255, ColorLetra2 = 255, ColorLetra3= 255;  // Color de la letra
    
     // Meotodo para añadir un icono al menu
    public void Icono( JLabel imgIconoAdmin)
    {
        ImageIcon imagen= new ImageIcon("src/Imagenes/administrador.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imgIconoAdmin.getWidth(),imgIconoAdmin.getHeight(),Image.SCALE_DEFAULT));
        imgIconoAdmin.setIcon(icono);
    }
    
    // Metodo para añadir el icono del  bibliotecario
    public void IconoBibli( JLabel imgiconoBibli)
    {
        ImageIcon imagen= new ImageIcon("src/Imagenes/Libro.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imgiconoBibli.getWidth(),imgiconoBibli.getHeight(),Image.SCALE_DEFAULT));
        imgiconoBibli.setIcon(icono); 
    }
    
    public void IconoSalida( JLabel Iconosalida)
    {
        ImageIcon imagen= new ImageIcon("src/Imagenes/salirxd.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Iconosalida.getWidth(),Iconosalida.getHeight(),Image.SCALE_DEFAULT));
        Iconosalida.setIcon(icono);
    }
    
    // Metodo para cambiar el color de menu
    public void ColorMenu (JPanel jpMenuAdmin )
    {
        jpMenuAdmin.setBackground(new java.awt.Color(18, 18, 92)); // Cambiar Color
    }
    
    // Metodo para cambiar el fondo del formulario
    public void ColorFondo( JPanel JFrame  )
    { 
        JFrame.setBackground(new java.awt.Color(255,255,255)); // Cambiar el color
    }
    
    // Cambios de colores Botones del Administrador  
    public void ColorBotones ( JButton jbCrearuUsuarios , JButton jbVerRegisLibro , JButton jbRepLibro)
    {       
        jbCrearuUsuarios.setBackground(new java.awt.Color(color1, color2,color3)); // Color del Boton
        jbCrearuUsuarios.setFont(new java.awt.Font(Fuente, 0, TamanoLetra));//Tipo de letra y Tamaño 
        jbCrearuUsuarios.setForeground(new java.awt.Color(ColorLetra1, ColorLetra1, ColorLetra1)); // Color de la letra
        jbCrearuUsuarios.setMargin(new java.awt.Insets(0, 0, 0, 0)); // Margen
        
        jbVerRegisLibro.setBackground(new java.awt.Color(color1, color2,color3)); // Color del Boton
        jbVerRegisLibro.setFont(new java.awt.Font(Fuente, 0, TamanoLetra));//Tipo de letra y Tamaño 
        jbVerRegisLibro.setForeground(new java.awt.Color(ColorLetra1, ColorLetra1, ColorLetra1)); // Color de la letra
        jbVerRegisLibro.setMargin(new java.awt.Insets(0, 0, 0, 0)); // Margen
        
        jbRepLibro.setBackground(new java.awt.Color(color1, color2,color3)); // Color del Boton
        jbRepLibro.setFont(new java.awt.Font(Fuente, 0, TamanoLetra));//Tipo de letra y Tamaño 
        jbRepLibro.setForeground(new java.awt.Color(ColorLetra1, ColorLetra1, ColorLetra1)); // Color de la letra
        jbRepLibro.setMargin(new java.awt.Insets(0, 0, 0, 0)); // Margen
        

    }
    
    
    
    
}
