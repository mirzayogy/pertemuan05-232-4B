import model.Buku;

public class BukuAksi {
    public static void main(String[] args) {
        Buku b = new Buku();
        // b.judul = "Manusia Setengah Salmon";
        b.setJudul("Manusia Setengah Salmon");
        System.out.println(b.getJudul());
    }
}
