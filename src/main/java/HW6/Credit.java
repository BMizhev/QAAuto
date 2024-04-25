package HW6;

public class Credit {
    private double fullAmount;
    private double percentage;
    private double monthPayment;

    public Credit (double amount, double percent, double singlePayment){
        fullAmount = amount;
        percentage = percent;
        monthPayment = singlePayment;
    }
    //getter
    public double getFullAmount() {
        return fullAmount;
    }
    public double getPercentage() {
        return percentage;
    }
    public double getMonthPayment() {
        return monthPayment;
    }
    //setter
    public void setMonthPayment(double singleMonthPayment){
        monthPayment = singleMonthPayment;
    }
}
