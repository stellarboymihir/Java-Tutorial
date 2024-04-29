package chapter6;

/*
So, a phone bill should have an ID, a base class, a number of allotted minutes
and a number of minutes used.




You should also include three constructors
a default one
one that accepts the ID only
one that accepts all fields


Now no matter which of these constructors you use, all fields should be set eventually.
Then you can also create a different class that instantiates the PhoneBill and
prints out an itemized bill.
 */

public class PhoneBillCalculator {
    public static void main(String[] args) {
        PhoneBill bill = new PhoneBill(123456);
        bill.setMinutesUsed(1000);
        bill.printedItemizedBill();
    }


}
