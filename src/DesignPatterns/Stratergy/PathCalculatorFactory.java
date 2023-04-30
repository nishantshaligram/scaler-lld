package DesignPatterns.Stratergy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculator(String mode){
        if(mode.equals("CAR")){
            return CarPathCalculator.getInstance();
        } else if(mode.equals("BIKE")) {
            return BikePathCalculator.getInstance();
        } else {
            return WalkPathCalculator.getInstance();
        }
    }
}
