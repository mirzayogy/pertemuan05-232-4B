public class Mahasiswa{
    String nama;
    int umur;
    String tanggalLahir;
    double tinggiBadan;
    String email;
    String npm;
    double ipk;
    int jumlahSks;

    public Mahasiswa(){
        this.npm = "NPM MASIH KOSONG";
        this.nama = "NAMA MASIH KOSONG";
        System.out.println("Pembuatan Objek Baru");
    }

    public Mahasiswa(String npm, String nama){
        this.npm = npm;
        this.nama = nama;
        System.out.println("Pembuatan Objek DENGAN PARAM");
    }

    void read(){
        String selectSQL = "SELECT * FROM mahasiswa";
        System.out.println(selectSQL);
    }

    void deleteAll(){
        String deleteSQL = "DELETE FROM mahasiswa";
        System.out.println(deleteSQL);
    }

    void delete(String npm){
        String deleteSQL = "DELETE FROM mahasiswa WHERE npm=" + npm;
        System.out.println(deleteSQL);
    }

    void create(String npm, String nama, String email){
        String insertSQL = "INSERT INTO mahasiswa (npm, nama, email) VALUES (" +
            "'"+npm+"',"+
            "'"+nama+"',"+
            "'"+email+"')";
        System.out.println(insertSQL);
    }

    void create(){
        String insertSQL = "INSERT INTO mahasiswa (npm, nama, email) VALUES (" +
                "'" + this.npm + "'," +
                "'" + this.nama + "'," +
                "'" + this.email + "')";
        System.out.println(insertSQL);
    }

    void cetakInformasi(){
        System.out.println("Nama : " +nama);
        System.out.println("NPM : " +npm);
        System.out.println("IPK : " +ipk);
        System.out.println("jumlahSKS : " +jumlahSks);
    }

    void menginputData(){

    }

    void cetakKhs(){

    }
}