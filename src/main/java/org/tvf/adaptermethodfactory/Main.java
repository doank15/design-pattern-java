package org.tvf.adaptermethodfactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NetflixPlanFactory planFactory = new NetflixPlanFactory();

        System.out.println("Enter your subscription plan: ");
        String user_choice = sc.next();

        System.out.println("Enter how many months you wanna subscription the plan for: " );
        int n = sc.nextInt();

        NetflixPlan plan = planFactory.getNetflixPlan(user_choice);
        System.out.println("Monthly bill amount for the plan is: " + plan.getPrice());
        System.out.println("Overall bill amount for the plan is " + plan.getFinalAmount(n));
    }
}