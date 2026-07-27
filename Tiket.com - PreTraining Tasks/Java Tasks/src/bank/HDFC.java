package bank;

public class HDFC extends Bank{
    public double calculateCharge(double amount){
        return transactionFee + (amount * 0.015);
    }
}