package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankPlatforms.IciciBankAPI;

public class IciciBankAPIAdapter implements BankAPIAdapter{

    private IciciBankAPI iciciBankAPI;

    public IciciBankAPIAdapter() {
        this.iciciBankAPI = new IciciBankAPI();
    }

    @Override
    public double checkBalance() {
        return iciciBankAPI.queryBalance();
    }

    @Override
    public boolean authenticate() {
        if(iciciBankAPI.checkUser() == 1){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean transaction() {
        if(iciciBankAPI.transfer() == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
