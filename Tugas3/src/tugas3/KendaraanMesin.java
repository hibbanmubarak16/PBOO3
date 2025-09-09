/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author hibban mubarak
 */
public abstract class KendaraanMesin extends KendaraanDarat{
    protected String bahanbakar;
    public KendaraanMesin(String nama, int kapasitas, int jumlahRoda,String bahanbakar) {
        super(nama, kapasitas, jumlahRoda);
        this.bahanbakar = bahanbakar;
    }
    public abstract void NyalakanMesin();
    public abstract void MatikanMesin();
}
