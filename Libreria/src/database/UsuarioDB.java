/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import libreria.Usuario;

/**
 *
 * @author Rubén Guerra
 */
public class UsuarioDB {
    private Conexion c;
    private Connection cx;
    private Statement con;
    private ResultSet rs;
    
    public UsuarioDB() throws SQLException{
        c=new Conexion();
        c.setConexion();
        cx=c.getConexion();
        con=c.getConsulta();
        rs=c.getResultSet();
    }
    
    public void registrar(Usuario u){
      try{
          String sql_query="INSERT INTO usuario(idUsuario,IP,Nombre) value(?,?,?)";
          PreparedStatement statement=cx.prepareStatement(sql_query);

          String Id = Integer.toString(u.getIdUsuario());
          statement.setString(1,Id);
          statement.setString(2,u.getIP());
          statement.setString(3,u.getNombre());
          
          statement.executeUpdate();
          statement.close();
      }catch(Exception e){
           System.out.println(e.toString());
      }
    }
    
    public Usuario consultar(String nombre){
       String IP="";
       int idUsuario=0;
       Usuario u=new Usuario();
       try{
           con=cx.createStatement();
           rs=con.executeQuery("Select * from usuario WHERE idUsuario='"+nombre+"';");
           while (rs.next()) {
                idUsuario=rs.getInt("Usuario");  
                IP=rs.getString("IP");
                nombre=rs.getString("Nombre");
           }
           u=new Usuario(idUsuario,IP,nombre);
       }catch(Exception e){
           System.out.println(e.toString());
       }
       return u;
    }    
}
