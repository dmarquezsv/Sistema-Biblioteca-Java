/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorinicio;

/**
 *
 * @author Daniel_Márquez
 */
public class persona {

    /**
     * @return the IDuser
     */
    public int getIDuser() {
        return IDuser;
    }

    /**
     * @param IDuser the IDuser to set
     */
    public void setIDuser(int IDuser) {
        this.IDuser = IDuser;
    }

    /**
     * @return the carnetUser
     */
    public String getCarnetUser() {
        return carnetUser;
    }

    /**
     * @param carnetUser the carnetUser to set
     */
    public void setCarnetUser(String carnetUser) {
        this.carnetUser = carnetUser;
    }
    
    private int IDuser;
    private String carnetUser;
    
    public  persona()
    {
    }
    
    public persona (int IDuser , String carnetUser)
    {
        this.IDuser = IDuser;
        this.carnetUser = carnetUser;
    }
    
}
