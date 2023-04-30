package DesignPatterns.Stratergy;

public class WalkPathCalculator implements PathCalculatorStrategy {
    private static WalkPathCalculator instance;

    public WalkPathCalculator(){

    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Path from "+source+" to "+destination+" using Walk");
    }

    public static WalkPathCalculator getInstance(){
        if(instance == null){
            synchronized (WalkPathCalculator.class){
                if(instance == null){
                    instance = new WalkPathCalculator();
                }
            }
        }
        return instance;
    }
}
