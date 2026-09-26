class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            // uppercase -> lowercase
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            }

            else if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }

            else if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            }
        }

        String original = sb.toString();

        sb.reverse();

        return original.equals(sb.toString());
    }
}