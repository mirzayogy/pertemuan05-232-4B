public class Aksi {
    public static void main(String[] args) {
        //Class object = new Constructor()
        Mahasiswa mirza = new Mahasiswa();

        mirza.nama="Mirza";
        mirza.npm="007";
        mirza.ipk=3.89;
        mirza.jumlahSks=144;

        mirza.cetakInformasi();

        Mahasiswa yogy = new Mahasiswa();
        yogy.cetakInformasi();
    }
}
