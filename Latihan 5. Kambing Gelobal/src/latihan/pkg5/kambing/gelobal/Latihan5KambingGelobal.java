/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.kambing.gelobal;

/**
 *
 * @author NIM  : A2.1900069
 *         Nama : Ferry Yoga Perkasa
 *         Kelas: TI-1A
 */
public class Latihan5KambingGelobal {
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    
//Method untuk menampilkan jumlah kambing
public void getJumlahKambing() {
    System.out.println("Jumlah kambing: " +jumlahKambing);
}

public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Latihan5KambingGelobal kambingSusu = new Latihan5KambingGelobal() ;
        
        // Menampilkan jumlah kambing yang ada saar program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
