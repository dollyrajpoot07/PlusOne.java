// Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ). The digits are stored such that the most significant digit is the first element of the array.

// Examples : 

// Input : [1, 2, 4]
// Output : [1, 2, 5]
// Input : [9, 9, 9]
// Output : [1, 0, 0, 0]

import java.util.*;

class PlusOne {

    public static void plus_one(Vector<Integer> digits, int n) {

        Collections.reverse(digits);

        int carry = 0;
        for (int i = 0; i < n; i++) {

            if (i == 0)
                digits.set(i, digits.get(i) + 1 + carry);

            else if (carry != 0)
                digits.set(i, digits.get(i) + carry);

            carry = digits.get(i) / 10;

            if (carry != 0)
                digits.set(i, digits.get(i) % 10);
        }

        if (carry != 0)
            digits.set(digits.size() - 1, carry);

        Collections.reverse(digits);
    }

    public static void main(String[] args) {
        Vector<Integer> digits = new Vector<Integer>(Arrays.asList(9, 8, 9, 9));
        int n = digits.size();
        plus_one(digits, n);
        for (int i = 0; i < n; i++) {
            System.out.print(digits.get(i) + " ");
        }
    }
}
