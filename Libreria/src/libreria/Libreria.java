/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.sql.SQLException;

/**
 *
 * @author Rubén Guerra
 */
public class Libreria {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Usuario usuario= new Usuario(2,"192.168.10.11","Ale");
        usuario.registrar();
    }
    
}
