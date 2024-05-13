public class Paksi {
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 3;
        p1.lebar = 2;
        p1.cetakLuas();
        p1.cetakKeliling();

        System.out.println(p1.hitungLuas(78, 32));
    }
}
