/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author hibban mubarak
 */
public class MotorNinjaH2 extends KendaraanMesin implements Bermuatan, Beroda, KendaliKecepatan {
    private int KecepatanSekarang = 0;
    public MotorNinjaH2(String nama, int kapasitas, int jumlahRoda, String bahanbakar) {
        super(nama, kapasitas, jumlahRoda, bahanbakar);
    }

    @Override
    public void NyalakanMesin() {
        System.out.println(nama + " mesin supercharged dinyalakan! Bahan bakar: " + bahanbakar);
    }

    @Override
    public void MatikanMesin() {
        System.out.println(nama + " mesin dmatikan.");
        KecepatanSekarang = 0;
    }

    @Override
        public void belok(String arah) {
        System.out.println(nama + " miring dan belok ke arah " + arah);
    }


    @Override
    public void bergerak() {
        System.out.println(nama + " melaju di jalan raya dengan kecepatan " + KecepatanSekarang + " km/jam.");
    }

    @Override
    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public void angkutbarang(int jumlah) {
        if (jumlah > 2) {
            System.out.println(nama + " tidak bisa mengangkut " + jumlah + " barang, maksimal hanya 2 (tas/sadel).");
        } else {
            System.out.println(nama + " membawa " + jumlah + " barang kecil.");
        }
    }

    @Override
    public void TambahKecepatan(int kmh) {
        KecepatanSekarang += kmh;
        System.out.println(nama + " menambah kecepatan menjadi " + KecepatanSekarang + " km/jam");
    }

    @Override
    public void KurangiKecepatan(int kmh) {
        KecepatanSekarang = Math.max(0, KecepatanSekarang - kmh);
        System.out.println(nama + " mengurangi kecepatan menjadi " + KecepatanSekarang + " km/jam");
    }
}
    
