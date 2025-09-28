package org.example;

public class KATA_Calculator {
    public static void main(String[] args) {
        int result = new KATA_Calculator().add("1,2,3,4,5");
        System.out.println("Simple Input with comma separated sum= " + result);

        int result2 = new KATA_Calculator().addAnyAmountOfNums("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        System.out.println("Input with any amount of numbers= " + result2);

        int result3 = new KATA_Calculator().addAnyAmountOfNums((String[]) null);
        System.out.println("Input with any amount of numbers= " + result3);

        int result4 = new KATA_Calculator().addInputWithNewLineDelimiter("1\n2,3");
        System.out.println("Input with new line delimiter= " + result4);
    }

    public int add(String input) {
        // Case 1: simple input with comma separated
        int sum = 0;

        // Handle empty or null input. return 0 if input is empty
        if (input == null || input.isEmpty()) {
            return 0;
        }
        for (String number : input.split(",")) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public int addAnyAmountOfNums(String... input) {
        // Case 2: Input with any amount of numbers
        int sum = 0;

        // Handle empty or null input. return 0 if input is empty
        if (input == null || input.length == 0) {
            return 0;
        }
        for (String number : input) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

    public int addInputWithNewLineDelimiter(String input) {
        // Case 3: Input with new line delimiter
        int sum = 0;
        // Handle empty or null input. return 0 if input is empty
        if (input == null || input.isEmpty()) {
            return 0;
        }
        for (String number : input.split(",|\n")) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}