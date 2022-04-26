/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesLogin;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import java.sql.*;

/**
 *
 * @author Daniel_Márquez
 */
public class pool {
    //creamos las variables que nos permitiran la coneccion a nuestra base de datos
    public  DataSource dataSource;
    //nombre de la ase de datos
    public String db = "bibli" ;
    //url de la base
    public String url ="jdbc:mysql://localhost/"+db;
    //usuario y contraseña que permitira el acceso a la base de datos
    public String user="root";
    public String pass="";
    
    //constructor de la clase para inicial el metodo inicializarDataSource
    public pool(){
            
        inicializarDataSource();
        
    }
    //metodo que establece la concecion a la base de datos
    private void inicializarDataSource(){
    //instanciamos el objeto BasicDataSource para poder utilizar las variables creadas anteriormente
        BasicDataSource basicDataSource = new BasicDataSource();
       //parametro de driver que se encuentra en la libreria agregada al inicio mysql-connector-java-5.1.16
        basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(pass);
        basicDataSource.setUrl(url);
        //conexiones maximas que pueden existir en el pool
        basicDataSource.setMaxActive(50);
        
        
        dataSource = (DataSource) basicDataSource;
    }
    
    
}
