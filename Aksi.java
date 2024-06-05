public class Aksi {
    public static void main(String[] args) {
        //Class object = new Constructor()
        Mahasiswa mirza = new Mahasiswa();

        mirza.nama="Mirza";
        mirza.npm="007";
        mirza.ipk=3.89;
        mirza.jumlahSks=144;

        mirza.cetakInformasi();

        Mahasiswa yogy = new Mahasiswa("002","Yogy");
        yogy.cetakInformasi();

        mirza.read();
        mirza.delete("1");
        mirza.create("001","mirza","mirza@email.com");
        mirza.create();

        //Class
        //object
        //atribut
        //method/behavior
        //parameter
        //constructor

        //1. definisi
        //2. penulisan
        //3. pengenalan
    }
}
