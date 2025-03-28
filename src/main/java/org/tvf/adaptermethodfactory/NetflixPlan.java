package org.tvf.adaptermethodfactory;

public abstract class NetflixPlan {
    protected int price;

    abstract int getPrice();

    public int getFinalAmount(int months) {
        return price * months;
    }
}
