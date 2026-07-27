package bank;

public class Bank{
    protected double transactionFee = 10.0;

    public double calculateCharge(double amount){
        return transactionFee;
    }
}