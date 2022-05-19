/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_ud13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW
 */
public class ConsultasBD {

    private Connection conexion;
    private Statement st;
    public ConsultasBD() throws InstantiationException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL="jdbc:mysql://localhost:3306/universidad?useSSL=false";
            this.conexion=DriverManager.getConnection(URL,"root","root");
            this.st= conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public Connection getConnection() {
        return conexion;
    }

    public Statement getStatement() {
        return st;
    }
    
    public ResultSet realizarConsulta(String consulta) throws SQLException{
        return this.st.executeQuery("Select * from "+consulta+";");
    }
    
    public void cerrar(){
        try {
            this.st.close();
            this.conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    
    
    

    
    
}
