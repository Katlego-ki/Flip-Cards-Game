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

        for(int k = 0; k < 4; k++){
            for(int i = 0; i < 4; i++){
                g.setColor(Color.DARK_GRAY);
                g.fillRect(150*(i+1),150*(k+1)-50, 100,100);

                //Assign card numbers
                String cardNumber = String.format("%d",4*k + i + 1);
                g.setColor(Color.BLACK);
                g.setFont(new Font("Arial", Font.BOLD, 20));
                g.drawString(cardNumber,150*i+193, 150*(k+1)+5);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
