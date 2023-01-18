/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Khairil Anwar Hrp
 */
public class Pembeli {
    private Barang barang;
    private String namaPembeli ,alamat;

    public Pembeli(Barang barang, String namapembeli, String alamat) {
        this.barang = barang;
        this.namaPembeli = namapembeli;
        this.alamat = alamat;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public String getNamapembeli() {
        return namaPembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void DataPembeli(){
        System.out.println("Nama Pembeli  : "+namaPembeli);
        System.out.println("Alamat        : "+alamat);
        barang.TampilData();
        
        
    }
}
 