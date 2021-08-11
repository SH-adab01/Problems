
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class Main extends javax.swing.JFrame {

  public Main() {
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setSize(600, 600);
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    Line2D lin = new Line2D.Float(100, 100, 250, 260);
    g2.draw(lin);
  }

  public static void main(String args[]) {
    new Main().setVisible(true);
  }
}

