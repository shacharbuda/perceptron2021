import java.awt.*;
import javax.swing.JFrame;


public class Drawing extends Canvas {
    static final int width = Consts.WIDTH;
    static final int height = Consts.HEIGHT;
    Point[] pnts;

    public Drawing(Point[] pnts) {
        this.pnts = pnts;
        this.run();
    }

    public void run() {
        Canvas canvas = this;
        JFrame frame = new JFrame("");
        canvas.setSize(width, height);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // Flip so fits to a real axis system (start from bottom left)
        Graphics2D g2d = (Graphics2D)g.create();
        g2d.scale(1, -1);
        g2d.translate(0, -getHeight());

        g2d.drawLine(0, 0, width, height);
        for (Point pnt: this.pnts) {
            g2d.setColor(pnt.color());
            g2d.fillOval(pnt.x, pnt.y, 5, 5);
        }
    }
}
