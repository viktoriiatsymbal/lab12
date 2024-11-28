package ua.edu.ucu.apps;

import ua.edu.ucu.apps.task1.ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getMoney(1000);
        atm.getMoney(800);
    }
}