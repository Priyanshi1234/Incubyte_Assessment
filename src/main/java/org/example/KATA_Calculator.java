package org.example;

public class KATA_Calculator {
    public static void main(String[] args) {
        int result = new KATA_Calculator().add("");
        System.out.println(result);
    }

    public int add(String input) {
        // Case 1: simple input with comma separated
        int sum = 0;

        // Handle empty input. return 0 if input is empty
        if (input.isEmpty()) {
            return 0;
        }
        for (String number : input.split(",")) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}