class Solution {
    public int[] plusOne(int[] digits) {

        // Right se left traverse
        int lastNum=digits.length - 1;
        for (int i = lastNum; i >= 0; i--) {

            // Agar digit 9 nahi hai
            if (digits[i] < 9) {
                digits[i]+=1;
                return digits;
            }

            // Agar digit 9 hai
            // 9 + 1 = 10
            digits[i] = 0;
        }

        // Agar yahan aaye,
        // iska matlab saare digits 9 the

        int[] result = new int[digits.length + 1];

        result[0] = 1;

        return result;
    }
}