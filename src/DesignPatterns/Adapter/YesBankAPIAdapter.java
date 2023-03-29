package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankPlatforms.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double checkBalance() {
        return yesBankAPI.checkBalance();
    }

    @Override
    public boolean authenticate() {
        return yesBankAPI.authenticateUser();
    }

    @Override
    public boolean transaction() {
        return yesBankAPI.transaction();
    }
}
