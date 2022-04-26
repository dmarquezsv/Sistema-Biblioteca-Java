/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeAdministrador;
// Importamos el paquete para direccionar al formulario
import FormulariosAdministrador.*;

/**
 *
 * @author Daniel_Márquez
 */
public class classDirigirForm {
    
    // Creamos todos las instancia de los formularios de
    // del apartado del interfaz
    
    // Metodo para ir al menu del administrador
    public void menuAdmin()
    {
        FormMenuAdmin MenuAdministrador = new FormMenuAdmin();// Creamos el objeto
        MenuAdministrador.setVisible(true); // Mostramos la venta del menu del admin
             
    }
    
   // Metodo que dirreccionar al venta Crear user
    public void DirigirCrearUser()
   {   FormCrearUser CrearUser = new FormCrearUser();
       CrearUser.setVisible(true);// Muestra la ventana
           
   }

    // Metodo para direccionar a la venta ver libros
    
    public void DirigirVerInfoLibro()
    {
        FormVerLibros VerLibro = new FormVerLibros();
        VerLibro.setVisible(true);// Muestra la ventana
       
    }
   
    
    //Metodo para direccionar a la venta de ver Reposición de libro
    public void DirigirResposicionLibro(){
        FormReposicionLibro ReposicionLibro = new FormReposicionLibro();
        ReposicionLibro.setVisible(true);// Muestra la venta
       
    }
    
 
   
   
    
}
