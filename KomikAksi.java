import model.Buku;
import model.Komik;

public class KomikAksi {
    public static void main(String[] args) {
        Komik k = new Komik();
        k.getJudul(); // ini ada di superclass
        k.setJudul("One Piece"); // ini ada di superclass
        k.setChapter("1115");

        Buku b = new Buku();
        b.setJudul("The Alchemist");
        
        // b.setChapter("1"); ini tidak bisa, karena miliknya subclass
    }
}
