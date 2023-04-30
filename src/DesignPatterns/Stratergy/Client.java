package DesignPatterns.Stratergy;

import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.findpath("DELHI", "AGRA", "WALK");
    }
}
