/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author hibban mubarak
 */
public abstract class KendaraanDarat extends Transportasi {

    protected final int jumlahRoda;
    
    public KendaraanDarat(String nama, int kapasitas, int jumlahRoda) {
        super(nama, kapasitas);
        this.jumlahRoda = jumlahRoda;
    }
    public abstract void belok(String arah);
}
