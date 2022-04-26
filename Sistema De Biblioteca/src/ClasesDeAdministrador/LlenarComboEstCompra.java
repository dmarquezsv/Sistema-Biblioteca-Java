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
public class LlenarComboEstCompra {

    /**
     * @return the IDestaCompra
     */
    public int getIDestaCompra() {
        return IDestaCompra;
    }

    /**
     * @param IDestaCompra the IDestaCompra to set
     */
    public void setIDestaCompra(int IDestaCompra) {
        this.IDestaCompra = IDestaCompra;
    }

    /**
     * @return the NombreEstaCompra
     */
    public String getNombreEstaCompra() {
        return NombreEstaCompra;
    }

    /**
     * @param NombreEstaCompra the NombreEstaCompra to set
     */
    public void setNombreEstaCompra(String NombreEstaCompra) {
        this.NombreEstaCompra = NombreEstaCompra;
    }
    
     @Override
    public String toString() {
        return  NombreEstaCompra;
    }
    
    private int IDestaCompra;
    private String NombreEstaCompra;
}
