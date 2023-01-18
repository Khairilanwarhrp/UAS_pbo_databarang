/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Main;

import Controller.Petugas;
import Model.Barang;
import Model.Pembeli;

/**
 *
 * @author Khairil Anwar Hrp
 */
public class DataPembeli {
    public static void main(String[] args){
        Barang b1 = new Barang ("susu bubuk","2 dus");
        Pembeli p1 = new Pembeli(b1,"ilham","jakarta");
        Petugas pgs= new Petugas ("joyo",10);
        pgs.tambahPembeli(p1);
        pgs.bacaPembeli();
    }
}
