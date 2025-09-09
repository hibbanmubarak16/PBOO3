/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author hibban mubarak
 */
public abstract class Transportasi {
     String nama;
     int kapasitas;
    
    public Transportasi(String nama, int kapasitas){
        this.nama = nama;   
        this.kapasitas = kapasitas;
    }
    public abstract void bergerak();
    public void info(){
        System.out.println("Transportasi: " + nama + "dengan kapasitas" + kapasitas + "orang" );
    }
    }
