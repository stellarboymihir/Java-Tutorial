package chapter6;

/* And then, it should also be able to calculate the overage, calculate the tax,
and calculate the total.
And then, it should also be able to print an itemized bill. */

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allotedMinutes;
    private int minutesUsed;

    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allotedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allotedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allotedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allotedMinutes = allotedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(){
        this.baseCost = baseCost;
    }

    public int getAllotedMinutes(){
        return allotedMinutes;
    }

    public void setAllotedMinutes(int allotedMinutes){
        this.allotedMinutes = allotedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if (minutesUsed <= allotedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allotedMinutes;
        return overageMinutes - overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return  taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printedItemizedBill(){
        System.out.println("Id: " + id);
        System.out.println("Base Rate: " + baseCost);
        System.out.println("OverageFee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
    }
}
