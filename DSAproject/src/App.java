import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException, FontFormatException {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame, BorderLayout.CENTER);
        frame.add(pacmanGame.getSidePanel(), BorderLayout.WEST);

        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        pacmanGame.requestFocus();
        frame.setVisible(true);
    }
}
