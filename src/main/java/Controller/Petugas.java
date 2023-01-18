/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pembeli;

/**
 *
 * @author Khairil Anwar Hrp
 */
public class Petugas {
    private String namaPetugas;
    private Pembeli[] pembeli;
    private int index, jumlah;
    
    public void bacaPembeli(){
        System.out.println("Nama Petugas  : "+namaPetugas);
        System.out.println(" ");
        for (int i=0; i<= index; i++){
            pembeli[i].DataPembeli();
        }        
    }   
    
    public Pembeli hapusPembeli(){
        Pembeli temp = pembeli[index];
        index = index -1;
        return temp;
    }
    
    public void tambahPembeli(Pembeli x){
        index = index +1;
        pembeli[index]= x;
    }
    
    public Petugas(String nP,int j){
        namaPetugas = nP;
        jumlah = j;
        pembeli = new Pembeli[jumlah];
        for(int i =0;i <pembeli.length; i++){
            pembeli [i]=null;            
        }
        index = -1;
    }
}
