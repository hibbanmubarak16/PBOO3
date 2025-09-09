/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author hibban mubarak
 */
public class Perpustakaan {
    // Overload 1
    public void pinjamBuku(String judul) {
        System.out.println("Meminjam buku: " + judul);
    }

    // Overload 2
    public void pinjamBuku(String judul, int lamaHari) {
        System.out.println("Meminjam buku: " + judul + " selama " + lamaHari + " hari.");
    }

    // Overload 3
    public void pinjamBuku(String judul, int lamaHari, boolean perpanjangan) {
        if (perpanjangan) {
            System.out.println("Perpanjangan peminjaman buku: " + judul + " selama " + lamaHari + " hari.");
        } else {
            System.out.println("Meminjam buku baru: " + judul + " selama " + lamaHari + " hari.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Perpustakaan umum: menyediakan koleksi buku fisik.");
    }
}
