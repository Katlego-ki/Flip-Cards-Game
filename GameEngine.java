import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameEngine extends JPanel implements ActionListener {
    public GameEngine(){
        this.setPreferredSize(new Dimension(1000, 800)); //SIZE OF PANEL OR "GAME SCREEN"
        this.setBackground(Color.GRAY);
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);


            }
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        for(int k = 0; k < 4; k++){
            for(int i = 0; i < 4; i++){
                g.fillRect(150*(i+1),150*(k+1)-50, 100,100);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
