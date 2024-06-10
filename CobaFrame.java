import javax.swing.JFrame;

public class CobaFrame extends JFrame {
    public static void main(String[] args) {
        CobaFrame cf = new CobaFrame();
        cf.setSize(600, 480);
        cf.setTitle("Coba Frame");
        cf.setLocationRelativeTo(null);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cf.setVisible(true);
    }
}
