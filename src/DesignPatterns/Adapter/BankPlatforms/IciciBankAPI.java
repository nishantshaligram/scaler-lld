package DesignPatterns.Adapter.BankPlatforms;

public class IciciBankAPI {
    public float queryBalance(){
        return 0.0f;
    }
    public int checkUser(){
        return 1;
    }
    public int transfer(){
        return 1;
    }
}
