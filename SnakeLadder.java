package Snakladder;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class SnakeLadder {
    static Logger logger = Logger.getLogger(SnakeLadder.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Welcome to Snake and Ladder Simulation");
        int player = 0;
        //assigning 0 th position to both the players
        int[] playerPosition = {0, 0};
        int dieroll;
        //assigning dieroll count of both the players 0
        int[] dierollcount = {0, 0};
        //checking both the players simultaneously using arrays 2-D concept
    }
}