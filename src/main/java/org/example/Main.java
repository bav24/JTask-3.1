package org.example;

public class Main {
    public static void main(String[] args) {
        int costTicket = 13_676;
        int costMile = 20;
        int bonus;

        bonus = costTicket / costMile;
        System.out.println("Бонусы: " + bonus);
    }
}