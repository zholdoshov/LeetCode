class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1;
        int carry = 0;

        digits[lastIndex] = digits[lastIndex] + 1;

        for (int i = lastIndex; i > -1; i--) {
            digits[i] = digits[i] + carry;

            if (digits[i] == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                carry = 0;
            }
        }

        if (carry == 1) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = carry;

            for (int j = 0; j < lastIndex; j++) {
                newDigits[j+1] = digits[j];
            }
            return newDigits;
        } else {
            return digits;
        }
    }
}