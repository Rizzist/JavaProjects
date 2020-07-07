package com.company;

public class Delux extends Hamburger{
    private boolean chips;
    private boolean drinks;

    public Delux(String rolltype, String meat, boolean chips, boolean drinks) {
        super(rolltype, "Beef", false, false, false);
        this.chips = chips;
        this.drinks = drinks;
    }

    @Override
    public String getPrice() {
        String base = super.getPrice();
        String out = "The base price is " + String.valueOf(base);
        if (chips) {
            base += 1;
            out += "\n\t Chips Addon: +1.00$";
        }
        if (drinks) {
            base += 2;
            out += "\n\t Drinks Addon: +2.00$";
        }
        out += "\nTotal Price is: " + String.valueOf(base);
        return out;
    }
}
