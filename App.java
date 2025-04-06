import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hey");
        int rowCount = 21;  
        int columnCount =19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        // Creates a JFrame window titled "Pac Man"
        JFrame frame = new JFrame("Pac Man");

        // Makes the window visible
       // frame.setVisible(true);

        // Sets the window size to boardWidth and boardHeight
        frame.setSize(boardWidth, boardHeight);

        // Centers the window on the screen
        frame.setLocationRelativeTo(null);

        // Prevents resizing of the window
        frame.setResizable(false);

        // Closes the application when the "X" button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Instance of PacMan class
        PacMan pacmanGame = new PacMan();

        //Adds game to Board
        frame.add(pacmanGame);

        //Fills the board with the game
        frame.pack();

        
        pacmanGame.requestFocus();

        // Makes the window visible
        frame.setVisible(true);
    }
}
