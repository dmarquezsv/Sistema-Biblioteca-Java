/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeBibliotecario;
// Importamos el paquete Formularios del Bibliotecario
import FormulariosBibliotecario.*;

/**
 *
 * @author Daniel_Márquez
 */
public class classDirgirFormBibli {
    
    // Creamos los diferentes metodos con sus respectivo objeto de los form
    
    // Metodo para dirigir al formualario del menu del bibliotecario
    public void MenuBibli()
    {
        FormMenuBibliotecario MenuBibliotecario = new FormMenuBibliotecario();
        MenuBibliotecario.setVisible(true);
    }
    
    //Metodo para direccionar al form Devolución
    public void DireccionarDevolucion()
    {
        FormDevolucion IrDevolucion = new FormDevolucion(); // Creamos el objeto
        IrDevolucion.setVisible(true); // Mostramos la pantalla
    }
    
    // Metodo para direccionar FORM prestamos
    
    public void DireccionarPrestamos()
    {
        FormRegisroPrestamos IrPrestamos = new FormRegisroPrestamos();
        IrPrestamos.setVisible(true);
    }
    
    // Metodo para direccionar FORM PAGO
    public void DireccionarPago()
    {
        FormRegistracionPago IrPago = new FormRegistracionPago();
        IrPago.setVisible(true);
    }
    
    // Metodo para direccionar FORM Registro libro
    public void DireccionarRegistroLibro()
    {
        FormRegistrarLibro IrRegistroLibro = new FormRegistrarLibro();
        IrRegistroLibro.setVisible(true);
    }
    
    // Metodo para direccionar Form solicitudes
    public void DireccionarSolicitudes()
    {
        FormSolicitudes IrSolicitudes = new FormSolicitudes();
        IrSolicitudes.setVisible(true);
    }
    
    //Metodo para dirreccionar el form pago de un libro
    public void  DireccionarPagoBook()
    {
        FormRegistracionPagoLibro IrPagoBook = new FormRegistracionPagoLibro();
        IrPagoBook.setVisible(true);
    }
    
    
}
