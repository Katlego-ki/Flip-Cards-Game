import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class GameEngine extends JPanel implements ActionListener {

    public GameEngine(){
        this.setPreferredSize(new Dimension(1000, 800)); //SIZE OF PANEL OR "GAME SCREEN"
        this.setBackground(Color.GRAY);
        this.setFocusable(true);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                /*if(getClickCount() == 2 compare){
                    compare the 2 selected objects

                    if(object1 == object2){
                        leave them flipped over

                     } else {
                        flip them down again.

                        }
                    }*/


                /* Left click to cancel card selection.
                 */

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //Zoom in When mouse enters??
                //Zoom in "New Game" and "Quit" buttons
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //Zoom out (back to original size)??
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
