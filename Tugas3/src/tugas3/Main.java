/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author hibban mubarak
 */
public class Main {
    public static void main(String[] args) {
        // Contoh Motor Ninja H2
        MotorNinjaH2 ninja = new MotorNinjaH2("Kawasaki Ninja H2", 2, 2, "Pertamax Turbo");

        ninja.info();
        ninja.NyalakanMesin();
        ninja.TambahKecepatan(60);
        ninja.bergerak();
        ninja.belok("kanan");
        ninja.angkutbarang(1);
        ninja.TambahKecepatan(120);
        ninja.bergerak();
        ninja.KurangiKecepatan(100);
        ninja.angkutbarang(3);
        ninja.MatikanMesin();

        System.out.println("Jumlah roda: " + ninja.getJumlahRoda());
    }
}