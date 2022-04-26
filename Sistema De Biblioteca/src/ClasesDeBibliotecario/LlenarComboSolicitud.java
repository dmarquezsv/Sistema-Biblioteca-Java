/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesDeBibliotecario;

/**
 *
 * @author Daniel_Márquez
 */
public class LlenarComboSolicitud {

    /**
     * @return the idsolicitud
     */
    public int getIdsolicitud() {
        return idsolicitud;
    }

    /**
     * @param idsolicitud the idsolicitud to set
     */
    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    /**
     * @return the NombreSolcitud
     */
    public String getNombreSolcitud() {
        return NombreSolcitud;
    }

    /**
     * @param NombreSolcitud the NombreSolcitud to set
     */
    public void setNombreSolcitud(String NombreSolcitud) {
        this.NombreSolcitud = NombreSolcitud;
    }
    
     @Override
     public String toString()
     {
         return NombreSolcitud;
     }
     
    
   private int idsolicitud;
   private String NombreSolcitud;
    
}
