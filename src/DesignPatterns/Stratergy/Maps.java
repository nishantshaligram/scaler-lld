package DesignPatterns.Stratergy;

public class Maps {
    public void findpath(String source, String destination, String mode){
        PathCalculatorStrategy pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.findPath(source, destination);
    }
}
