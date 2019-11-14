/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3.input;

import java.util.Scanner;

/**
 *
 * @author NIM  : A2.1900069
 *         Nama : Ferry Yoga Perkasa
 *         Kelas: TI-1A
 */
public class Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.print("Masukan nama anda: ");
         Scanner scanner = new Scanner(System.in);
         
         String nama = scanner.next();
         System.out.println("Nama anda adalah " +nama);
    }
    
}
