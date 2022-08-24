import javax.swing.*;

public class Graphics extends JFrame{

    public Graphics(){
        this.add(new GameEngine()); //this.add(new GraphicsClass()) Graphics extends JPanel to allow additions to the JFrame.
        this.setTitle("Flip Cards Game");
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
