/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author Rubén Guerra
 */
public class Conexion {
    private Connection conexion;
    private Statement consulta;
    private ResultSet resulset;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void cerrarConexion(){
        try{
            conexion.close();
        }catch(Exception e){
            System.out.println("Popo");
        }
    }   
    
    public void setConexion() throws SQLException{
        conexion=null;
        try{
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
            consulta=conexion.createStatement();
            //System.out.println("Conexion Exitosa");10enpoo
        }catch(SQLException e){
            System.out.println("Exception SQL: "+e.getMessage());
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public Statement getConsulta(){
        return consulta;
    }
    
    public ResultSet getResultSet(){
        return resulset;
    }
}
