package com.Bridgelab;



import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class SnakeLadder {
    static Logger logger = Logger.getLogger(SnakeLadder.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Welcome to Snake and Ladder Simulation");
    }
}