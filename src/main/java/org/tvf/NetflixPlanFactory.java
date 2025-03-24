package org.tvf;

public class NetflixPlanFactory {
    public static NetflixPlan getNetflixPlan(String planType) {
        if (planType.equalsIgnoreCase("basic")) {
            return new Basic();
        } else if (planType.equalsIgnoreCase("standard")) {
            return new Premium();
        } else if (planType.equalsIgnoreCase("premium")) {
            return new Premium();
        }

        return null;
    }
}
