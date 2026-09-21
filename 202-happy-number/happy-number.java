class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {

            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            int ans = 0;

            while (n != 0) {
                int digit = n % 10;
                ans = ans + digit * digit;
                n = n / 10;
            }

            n = ans;
        }

        return true;
    }
}