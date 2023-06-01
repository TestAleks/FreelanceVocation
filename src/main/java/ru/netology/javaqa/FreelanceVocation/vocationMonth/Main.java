package ru.netology.javaqa.FreelanceVocation.vocationMonth;

public class Main {
    public static void main(String[] args) {
        VocationService calculation = new VocationService();

        int numberOfMonths = calculation.calculation(1000, 3000, 20000);
        System.out.println("Months Vocation = " + numberOfMonths);
    }
}
