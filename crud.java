*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.crud;

import com.app.uts.koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ar
 */

public class CRUD {
    
    static Connection koneksi = new databasef().konekToDB();
    static Statement stmt;
    static ResultSet rs;
    
    int tahun;
    String judul, pengarang, penerbit, idBuku;
    
    
    Scanner inputConsole = new Scanner(System.in);
    Scanner inputINT = new Scanner(System.in);
    
    //menu
    public void showmenu(){
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        
