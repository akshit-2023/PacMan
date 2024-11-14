import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount=21;
        int columnCount=19;
        int tileSize=32;
        int boardWidth=columnCount*tileSize;
        int boardHeight=rowCount*tileSize;

        JFrame frame=new JFrame("Pac Man");
        
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);//Center the frame
        frame.setResizable(false);//Frame is not resizable
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame=new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);

    }
}
