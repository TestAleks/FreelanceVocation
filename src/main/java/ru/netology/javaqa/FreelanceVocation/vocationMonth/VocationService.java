package ru.netology.javaqa.FreelanceVocation.vocationMonth;
public class VocationService {
    public int calculation(int income, int expenses, int threshold) {
        int numberOfMonths = 0;
        int currentSum = 0;

        for (int i = 1; i <=12; i++) {
            if (currentSum < threshold) {
                currentSum = currentSum + income - expenses;

            } else {
                numberOfMonths = numberOfMonths + 1;
                currentSum = (currentSum - expenses) / 3;

            }
        }
        return numberOfMonths;
    }
}
