package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {
        String text = String.valueOf(Math.abs(number));
        StringBuilder sb = new StringBuilder(text);
        String reversed = String.valueOf(sb.reverse());
        if (text.equals(reversed)) {
         return true;
        } return false;
    }
    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        }
        int toplam = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }

        return toplam == number;
    }
    public static String numberToWords(int number){
        String invalid = "Invalid Value";
        if (number < 0){
            return invalid;
        } String text = String.valueOf(number);
        StringBuilder sb = new StringBuilder(text);

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            switch (c) {
                case '1': sb.append("One "); break;
                case '2': sb.append("Two "); break;
                case '3': sb.append("Three "); break;
                case '4': sb.append("Four "); break;
                case '5': sb.append("Five "); break;
                case '6': sb.append("Six "); break;
                case '7': sb.append("Seven "); break;
                case '8': sb.append("Eight "); break;
                case '9': sb.append("Nine "); break;
                case '0': sb.append("Zero "); break;
            }
        }
        return sb.toString();
    }
}
