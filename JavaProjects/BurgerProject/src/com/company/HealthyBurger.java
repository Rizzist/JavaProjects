package com.company;

public class HealthyBurger extends Hamburger{
    private String rolltype = "Brown Rye";
    private boolean veg;
    private boolean sauce;

    public HealthyBurger(String rolltype, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean veg, boolean sauce) {
        super(rolltype, meat, lettuce, tomato, carrot);
        this.veg = veg;
        this.sauce = sauce;
    }

    @Override
    public String getPrice() {
        double base = Double.valueOf(super.getPrice());
        String out = "The base price is " + String.valueOf(base);

        if (super.isCarrot()) {
            base += 2.50;
            out += "\n\t Veggie Addon: +2.50$";
        }

        if (super.isLettuce()) {
            base += 0.50;
            out += "\n\t Lettuce Addon: +0.50$";
        }

        if (super.isTomato()) {
            base += 2.25;
            out += "\n\t Tomato Addon: +2.25$";
        }

        if (veg) {
            base += 3;
            out += "\n\t Veggie Addon: +3.00$";
        }
        if (sauce) {
            base += 2;
            out += "\n\t Sauce Addon: +2.00$";
        }
        out += "\nTotal Price is: " + String.valueOf(base);
        return out;
    }
}
