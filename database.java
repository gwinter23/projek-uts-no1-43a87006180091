/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ar
 */
public class Koneksi {
    
    //public static Connection con;
    //public static Statement stmt;
        
    public Koneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Koneksi Driver berhasil!");
        } catch (Exception e) {
            System.err.println("Koneksi Driver gagal!" + e.getMessage() );
        }
    }
