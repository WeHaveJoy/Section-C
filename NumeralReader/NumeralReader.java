package numbers;

import java.util.*;

public class NumeralReader {

    private static final String[] UNITS = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] THOUSANDS = {"", "thousand", "million", "billion", "trillion"};

    public static String readNumeral(String numeral) {
        String number = numeral.replaceAll("^0+", ""); // Remove leading zeros
        if (number.isEmpty()) {
            return "zero";
        }
        StringBuilder result = new StringBuilder();
        int groupCount = (number.length() + 2) / 3; // Calculate number of groups of three digits
        int pad = 3 - (number.length() % 3); // Determine how many leading zeros to pad
        number = "0".repeat(pad) + number; // Pad leading zeros
        for (int i = 0; i < groupCount; i++) {
            String group = number.substring(i * 3, (i + 1) * 3);
            int digit = Integer.parseInt(group);
            if (digit > 0) {
                result.append(readGroup(digit));
                result.append(THOUSANDS[groupCount - i - 1]);
                if (i < groupCount - 1) {
                    result.append(", ");
                }
            }
        }
        return result.toString();
    }

    private static String readGroup(int group) {
        StringBuilder result = new StringBuilder();
        int hundreds = group / 100;
        int tens = group % 100 / 10;
        int units = group % 10;
        if (hundreds > 0) {
            result.append(UNITS[hundreds]);
            result.append(" hundred ");
        }
        if (tens == 1) {
            result.append(TEENS[units]);
        } else {
            if (tens > 0) {
                result.append(TENS[tens]);
                if (units > 0) {
                    result.append(" ");
                }
            }
            if (units > 0 || group == 0) {
                result.append(UNITS[units]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String numeral = "123456789";
        String numberString = NumeralReader.readNumeral(numeral);
        System.out.println(numberString);
    }

}
