/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerraminetasGenerales;
//Importamos el paquete donde se encunetra login 
import FormularioInicio.*;

/**
 *
 * @author Daniel_Márquez
 */
public class ClassRegresoLogin {
    
    // METODO PARA DIRECCIONAR AL FORMULARIO DEL LOGIN
   public void RegresarLogin()
   {
     FormularioLogin RegresoLogin = new FormularioLogin();
     RegresoLogin.setVisible(true);
   }
    
}
