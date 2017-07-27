import java.awt.BasicStroke;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
class Surface extends JPanel {
 
    private void doDrawing(Graphics g) {
 
        Graphics2D g2d = (Graphics2D) g.create(); 
        
        
        //Bo đoạn thẳng bằng CAP
        BasicStroke frame = new BasicStroke(8, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL);
        g2d.setStroke(frame);  
        
        //Đáy khung        
        g2d.drawLine(40 , 300, 220, 300);        
        g2d.drawLine(260, 300, 440, 300);
        g2d.drawLine(480, 300, 660, 300);
        //Cột dọc
        g2d.drawLine(130, 100, 130, 300);
        g2d.drawLine(350, 100, 350, 300);
        g2d.drawLine(570, 100, 570, 300);
        
    }
 
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        doDrawing(g);
    }
}
 
public class Frame extends JFrame {
 
    public Frame() {
 
        initUI();
    }
 
    private void initUI() {
 
        add(new Surface());
 
        setTitle("Tháp Hà Nội");
        setSize(720, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 
                Frame ex = new Frame();
                ex.setVisible(true);
            }
        });
    }
}