package DesignPatterns.Adapter;

public interface BankAPIAdapter {
    double checkBalance();
    boolean authenticate();
    boolean transaction();
}
