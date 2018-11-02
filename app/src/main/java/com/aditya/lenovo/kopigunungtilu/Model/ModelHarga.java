package com.aditya.lenovo.kopigunungtilu.Model;
import java.io.Serializable;


public class ModelHarga implements Serializable{

    private String bahan,jenis,processing,size,Harga;


    public ModelHarga(String bahan, String jenis, String processing,String size,String Harga) {
        this.bahan = bahan;
        this.jenis = jenis;
        this.processing = processing;
        this.size = size;
        this.Harga = Harga;
    }

    public String getHarga() {
        return Harga;
    }

//    public void setHarga(String harga) {
//
//        this.Harga = harga;
//    }
    //
    public String getBahan() {
        return bahan;
    }

//    public void setBahan(String bahan) {
//
//        this.bahan = bahan;
//    }

    public String getJenis() {

        return jenis;
    }

//    public void setJenis(String jenis) {
//
//        this.jenis = jenis;
//    }

    public String getProcessing() {

        return processing;
    }

//    public void setProcessing(String processing) {
//
//        this.processing = processing;
//    }

    public String getSize() {

        return size;
    }

//    public void setSize(String size) {
//
//        this.size = size;
//    }


}
