import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    GameFrame() {
         panel = new GamePanel();
         this.add(panel);
         this.setResizable(false);
         this.setTitle("Pong");
         this.setBackground(Color.BLACK);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.pack();
         this.setVisible(true);
         this.setLocationRelativeTo(null);
    }
}
