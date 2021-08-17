package battleship_eclipse;

import java.util.Scanner;

/**
 * Main Player class will be doing all of the things that players do.  Players will have
 * ships.  Players will take shots, set up the board and play the game.
 */
public class Player {
    private String name;
    private int numShipsLeft = 5;

    private Ship carrier;
    private Ship battleship;
    private Ship cruiser;
    private Ship submarine;
    private Ship destroyer;
    private Ship[] fleet = new Ship[5];
    private GameBoard fleetPosition;
    private GameBoard chartShots;

    /**
     * Constructor initializing name of player and setting up
     * fleet of ships.
     * @param name the players name
     */
    public Player (String name) {
        this.name = name;

        //initialize all ships in the player's fleet
        carrier = new Ship("Carrier", 5);
        battleship = new Ship("Battleship", 4);
        cruiser = new Ship("Cruiser", 3);
        submarine = new Ship("Submarine", 3);
        destroyer = new Ship("Destroyer", 2);

        //Create the player's GameBoard where his/her fleet will reside
        fleetPosition = new GameBoard();
        //Create the player's chart for keeping track of hits & misses scored against opponent
        chartShots = new GameBoard();

        //store fleet as array for easy access during setup phase and checking for hits/misses
        createFleet();

    }

   //Initialize the fleet for easy access
    public void createFleet() {
        fleet[0] = carrier;
        fleet[1] = battleship;
        fleet[2] = cruiser;
        fleet[3] = submarine;
        fleet[4] = destroyer;
    }

    /**
     * Will be choosing coordinates for ship placement setting up fleet's position
     * @param in takes Scanner object for use in input collection
     */
    public void setUpFleet() {
        /*
        todo need to set up mechanism for getting ship coordinates
        validating the input and then checking that ship placement is valid
        i.e. ships cannot be placed next to each other
         */

        //cycle through ships to place prompting for each ships placement

        // prompt for current ship

        // get input

        // validatePosition() make sure chosen location is valid -- if not go back to prompt for current ship

        // set location once validated chosen location

        // update players fleetPosition Gameboard
        /*
        todo make exception to handle when the input doesn't match the regex "[A-J]([1-9]|10)"
         */
        

    }

    /**
     * Mechanism for taking shots against opponents fleet
     * @param in Scanner object to be used for user input
     */
    public boolean fireShot() {
         /*
        todo need to set up mechanism for taking shot input
        validating the input and then checking that ship placement is valid
        i.e. ships cannot be placed next to each other
         */

        // prompt for shot coordinates

        // check for hits / misses

        return true;
    }

    public static void playBattleship() {
        
        Player player1;
        Player player2;

        //Get player names

     
        player1 = new Player(UserInput.inputString("Player 1, Enter your name: "));
        
        player2 = new Player(UserInput.inputString("Player 2, Enter your name: "));

        player1.fleetPosition.displayField();

        //player 1 setUpFleet
        //player1.setUpFleet();

        //player 2 setUpFleet
        //player2.setUpFleet();

        //game loop
        System.out.println(player1.name);
        System.out.println(player2.name);
        //will be done with scanner here
        
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Ship[] getFleet() {
		return fleet;
	}

	public void setFleet(Ship[] fleet) {
		this.fleet = fleet;
	}

	public GameBoard getFleetPosition() {
		return fleetPosition;
	}

	public void setFleetPosition(GameBoard fleetPosition) {
		this.fleetPosition = fleetPosition;
	}
}
