import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon();

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.black);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.add(label);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e){
        switch (e.getKeyChar()) {
            case 37:
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 39:
                label.setLocation(label.getX(), getY()+10);
                break;
            case 40:
                label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e){}

    @Override
    public void keyReleased(KeyEvent e){
        System.out.println("yy" + e.getKeyChar());
        System.out.println("yy" + e.getKeyCode());
    }
}
