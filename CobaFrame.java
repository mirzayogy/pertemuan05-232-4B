import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class CobaFrame extends JFrame {

    JButton btn1 = new JButton("Tambah");
    JLabel label1 = new JLabel("Nama ");

    public static void main(String[] args) {
        CobaFrame cf = new CobaFrame();
        cf.setSize(600, 480);
        cf.setTitle("Coba Frame");
        cf.setLocationRelativeTo(null);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cf.setVisible(true);
    }
}
