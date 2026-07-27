package bank;

public class ICICI extends Bank{
    public double calculateCharge(double amount){
        return transactionFee + (amount * 0.02);
    }
}