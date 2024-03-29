package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankPlatforms.IciciBankAPI;

public class PhonePe {


    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter){
        this.bankAPIAdapter = new YesBankAPIAdapter();
    }

    public void transferMoney(){
        //1. Authenticate User
        //2. Check enough balance available
        //3. transfer the amount

        if(bankAPIAdapter.authenticate()){
            if(bankAPIAdapter.checkBalance() >= 0){
                if(bankAPIAdapter.transaction()){
                    System.out.println("Transaction is done");
                }
            }
        }
    }
}
