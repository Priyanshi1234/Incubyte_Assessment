package org.example;

public class KATA_Calculator {
    public static void main(String[] args) {
        // case 1
        // int result = new KATA_Calculator().add("1,2,3,4,5");
        // System.out.println("Simple Input with comma separated sum= " + result);

        // Case 2
        // int result2 = new KATA_Calculator().addAnyAmountOfNums("1", "2", "3", "4",
        // "5", "6", "7", "8", "9", "10");
        // System.out.println("Input with any amount of numbers= " + result2);

        // int result3 = new KATA_Calculator().addAnyAmountOfNums((String[]) null);
        // System.out.println("Input with any amount of numbers= " + result3);

        // Case 3
        // int result4 = new KATA_Calculator().addInputWithNewLineDelimiter("1\n2,3");
        // System.out.println("Input with new line delimiter= " + result4);

        // Case 4
        // int result5 = new
        // KATA_Calculator().addInputWithDifferentDelimiters("//;\n1;2");
        // System.out.println("Input with multiple delimiter= " + result5);

        // Case 5
        // try {
        // int result6 = new
        // KATA_Calculator().addInputWithNegativeNumbers("1,-2,3,-4,5");
        // System.out.println("Input with negative numbers= " + result6);
        // } catch (IllegalArgumentException e) {
        // System.out.println(e.getMessage());
        // }

        // Case 6: Final method with all combinations
        try {
            int result7 = new KATA_Calculator().addWithAllCombinations("1,4,5,6,7", "//;\n1;2", "3\n4,5", "6,-7,8");
            System.out.println("Input with all combinations= " + result7);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    // public int add(String input) {
    // // Case 1: simple input with comma separated
    // int sum = 0;

    // // Handle empty or null input. return 0 if input is empty
    // if (input == null || input.isEmpty()) {
    // return 0;
    // }
    // for (String number : input.split(",")) {
    // sum += Integer.parseInt(number);
    // }
    // return sum;
    // }

    // public int addAnyAmountOfNums(String... input) {
    // // Case 2: Input with any amount of numbers
    // int sum = 0;

    // // Handle empty or null input. return 0 if input is empty
    // if (input == null || input.length == 0) {
    // return 0;
    // }
    // for (String number : input) {
    // sum += Integer.parseInt(number);
    // }
    // return sum;
    // }

    // public int addInputWithNewLineDelimiter(String input) {
    // // Case 3: Input with new line delimiter
    // int sum = 0;
    // // Handle empty or null input. return 0 if input is empty
    // if (input == null || input.isEmpty()) {
    // return 0;
    // }
    // for (String number : input.split(",|\n")) {
    // sum += Integer.parseInt(number);
    // }
    // return sum;
    // }

    // public int addInputWithDifferentDelimiters(String input) {
    // // Case 4: Input with different delimiter
    // int sum = 0;
    // // Handle empty or null input. return 0 if input is empty
    // if (input == null || input.isEmpty()) {
    // return 0;
    // }
    // String delimiter = ",";
    // if (input.startsWith("//")) {
    // int delimiterEndIndex = input.indexOf("\n");
    // delimiter = input.substring(2, delimiterEndIndex);
    // input = input.substring(delimiterEndIndex + 1);
    // }
    // System.out.println("Delimiter is: " + delimiter);
    // System.out.println("Input is: " + input);

    // String regexDelimiter = "\\" + delimiter; // Escape special characters for
    // regex
    // delimiter = regexDelimiter + "|,|\n"; // Combine with default delimiters
    // for (String number : input.split(delimiter)) {
    // if (number.isEmpty())
    // continue; // Skip empty strings
    // sum += Integer.parseInt(number);
    // }
    // return sum;
    // }

    // public int addInputWithNegativeNumbers(String input) {
    // // Case 5: Input with negative numbers
    // int sum = 0;
    // StringBuilder negativeNumbers = new StringBuilder();

    // // Handle empty or null input. return 0 if input is empty
    // if (input == null || input.isEmpty()) {
    // return 0;
    // }
    // for (String number : input.split(",|\n")) {
    // int num = Integer.parseInt(number);
    // if (num < 0) {
    // if (negativeNumbers.length() > 0) {
    // negativeNumbers.append(", ");
    // }
    // negativeNumbers.append(num);
    // } else {
    // sum += num;
    // }
    // }
    // if (negativeNumbers.length() > 0) {
    // throw new IllegalArgumentException("Negative numbers are not allowed: " +
    // negativeNumbers);
    // }
    // return sum;
    // }

    public int addWithAllCombinations(String... input) {
        // Case 6: Input with all combinations
        int sum = 0;

        // Handle empty or null input. return 0 if input is empty
        if (input == null || input.length == 0) {
            return 0;
        }
        for (String str : input) {
            if (str == null || str.isEmpty()) {
                continue; // Skip empty strings
            }
            String delimiter = ",";
            if (str.startsWith("//")) {
                int delimiterEndIndex = str.indexOf("\n");
                delimiter = str.substring(2, delimiterEndIndex);
                str = str.substring(delimiterEndIndex + 1);
            }
            String regexDelimiter = "\\" + delimiter; // Escape special characters for regex
            delimiter = regexDelimiter + "|,|\n"; // Combine with default delimiters

            StringBuilder negativeNumbers = new StringBuilder();
            for (String number : str.split(delimiter)) {
                if (number.isEmpty())
                    continue; // Skip empty strings
                int num = Integer.parseInt(number);
                if (num < 0) {
                    if (negativeNumbers.length() > 0) {
                        negativeNumbers.append(", ");
                    }
                    negativeNumbers.append(num);
                } else {
                    sum += num;
                }
            }
            if (negativeNumbers.length() > 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed: " + negativeNumbers);
            }
        }
        return sum;
    }
}