/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.main;

import com.app.uts.crud.CRUD;
import java.util.Scanner;

/**
 *
 * @author ar
 */

public class UTS_SEMESTER4 {
    public static void main(String[] args) {
      
             Scanner input = new Scanner(System.in);
    
             CRUD crud = new CRUD();
        
    System.out.println("\n===MENU UTAMA"====");
    System.out.println("1. CRUD ABSEN");
    System.out.println("0. Keluar");
    System.out.println("KEMBALI ");
    System.out.println("PILIHAN> ");

            int pilihan = Integer.parseInt(input.nextLine());
            
            switch(pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    crud.showMenu();
                    break;

                default:
                    System.out.println("Pilihan Anda Salah!");
                
        }
    }
}
