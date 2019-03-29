/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import database.UsuarioDB;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Rubén Guerra
 */
public class Usuario {
    private int idUsuario;
    private String IP;
    private String nombre;
    private String entrada;
    Scanner reader = new Scanner (System.in);
    
    public Usuario(){
        this(0,"","");
    }
    
    public Usuario(int idUsuario,String IP,String nombre){
        this.idUsuario=idUsuario;
        this.IP=IP;
        this.nombre=nombre;
    }
    
    public Usuario(Usuario u){
        idUsuario=u.idUsuario;
        IP=u.IP;
        nombre=u.nombre;
    }
    
    public void setIdUsuario(int idu){
        idUsuario=idu;
    }
    
    public void setIP(String ip){
        IP=ip;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }
    
    public String getIP(){
        return IP;
    }
    
    public String getNombre(){
        return nombre;
    }  
    
    public void registrar() throws SQLException{
        UsuarioDB udb=new UsuarioDB();
        udb.registrar(this);
        System.out.println("Nombre: ");
        entrada = reader.nextLine();
        //udb.consultar(entrada);
        System.out.println(udb.consultar(entrada));
    }
    
    /*public Cuenta logIn(int pin,String cuenta) throws SQLException{
        CuentaDB cdb=new CuentaDB();
        Cuenta c=cdb.login(pin,cuenta);
        System.out.println(c);
        return c;
    }*/
    
    public void logOut(){
        System.exit(0);
    }
    
    @Override
    public String toString(){
        return "idUsuario: " + idUsuario +
               "\nNombre: " + nombre +
               "\nApepa: "+ IP;
    }
    
    public void destroy(){
        nombre=null;
        IP=null;
        System.gc();
    }
}
