/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamakanan;


public class ModelMakanan {
    private String nama;
    private String jenis;
    private int harga;
    
    /**
     *
     * @param nama
     * @param jenis
     * @param harga
     */
    public ModelMakanan(String nama, String jenis, int harga){
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public String getJenis(){
        return jenis;
    }
        
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
}