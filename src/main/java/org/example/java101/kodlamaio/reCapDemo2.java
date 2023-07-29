package org.example.java101.kodlamaio;

public class reCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6};

        double total = 0.0;
        double max = myList[0];
        for (double number : myList) {
            System.out.println(number);
            total += number;

            if (max <= number) {
                max = number;
            }
        }
        System.out.println("toplam: " + total);
        System.out.println("max değeri: " + max);
    }
}
