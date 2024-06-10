package model;

public class Buku {
    private String judul;
    private double harga;
    private String penulis;
    private double diskon;

    //overloading
    public Buku(){

    }

    public Buku(String judul){
        this.judul = judul;
    }

    public Buku(String judul, double harga) {
        this.judul = judul;
        this.harga = harga;
    }

    public Buku(String judul, double harga, String penulis) {
        this.judul = judul;
        this.harga = harga;
        this.penulis = penulis;
    }

    public Buku(double diskon, String penulis){
        this.penulis = penulis;
        this.diskon = diskon;
    }

    public Buku(String judul, String penulis){

    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getJudul(){
        return this.judul;
    }

    //overloading
    public void hapus(){

    }

    public void hapus(int id){

    }

    public void hapus(String kelas) {

    }

    // public void hapus(String nama) {

    // }
}
