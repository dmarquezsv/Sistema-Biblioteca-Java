/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeAdministrador;

/**
 *
 * @author Daniel_Márquez
 */
public class LlenarComboCargo {

    /**
     * @return the idcargo
     */
    public int getIdcargo() {
        return idcargo;
    }

    /**
     * @param idcargo the idcargo to set
     */
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    /**
     * @return the NombreCargo
     */
    public String getNombreCargo() {
        return NombreCargo;
    }

    /**
     * @param NombreCargo the NombreCargo to set
     */
    public void setNombreCargo(String NombreCargo) {
        this.NombreCargo = NombreCargo;
    }
    
     @Override
    public String toString() {
        return  NombreCargo;
    }
    
   private int idcargo;
   private String NombreCargo;
   
    
}
