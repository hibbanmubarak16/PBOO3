/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author hibban mubarak
 */
public class MainPerpus {
    public static void main(String[] args) {
        // Objek Perpustakaan Umum (Overload berlaku)
        Perpustakaan perpusUmum = new Perpustakaan();
        perpusUmum.pinjamBuku("Laskar Pelangi");
        perpusUmum.pinjamBuku("Bumi Manusia", 14);
        perpusUmum.pinjamBuku("Negeri 5 Menara", 7, true);
        perpusUmum.infoPerpustakaan();

        System.out.println("\n==============================\n");

        // Objek Perpustakaan Digital (Override berlaku)
        PerpustakaanDigital perpusDigital = new PerpustakaanDigital();
        perpusDigital.pinjamBuku("Clean Code", 30);
        perpusDigital.pinjamBuku("Artificial Intelligence", 14, false);
        perpusDigital.infoPerpustakaan();
    }
}