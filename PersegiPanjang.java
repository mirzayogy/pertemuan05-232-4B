public class PersegiPanjang {
    double panjang;
    double lebar;

    void cetakLuas() {
        System.out.println(this.panjang * this.lebar);
    }

    void cetakKeliling() {
        System.out.println(2 * this.panjang + 2 * this.lebar);
    }

    double hitungLuas(double p, double l){
        return p*l;
    }
}
