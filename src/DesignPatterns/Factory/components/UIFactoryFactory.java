package DesignPatterns.Factory.components;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case ANDROID -> {
                return new AndroidUIFactory();
            }
            case IOS -> {
                return new IosUIFactory();
            }
        }

//        if(supportedPlatform.equals(SupportedPlatform.ANDROID)){
//            return new AndroidUIFactory();
//        }
//        else if(supportedPlatform.equals(SupportedPlatform.IOS)){
//            return new IosUIFactory();
//        }
        
        return null;
    }
}
