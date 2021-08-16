package battleship_eclipse;
/**
 * the blueprint for the game board on which battleship will be played
 */
public class GameBoard {
    private char[][] field = {{'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'},
                            {'~','~','~','~','~','~','~','~','~','~'}};
    private final char HIT = 'X';
    private final char MISS = 'M';
    private final char FOG = '~';


    public void displayField() {
        char[] letters = {'A','B','C','D','E','F','G','H','I','J'};
        System.out.println("   1   2   3   4   5   6   7   8   9   10");
        for(int i = 0; i < 10; i++) {
            System.out.print(letters[i] + "  ");
            for(int j = 0; j < 10; j++) {
                System.out.print(field[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
