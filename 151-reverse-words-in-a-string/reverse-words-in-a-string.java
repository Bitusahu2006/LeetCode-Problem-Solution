
class Solution {
    public String reverseWords(String s) {
        // Answer store karne ke liye StringBuilder
        StringBuilder ans = new StringBuilder();

        // Last index se traversal start karenge
        int i = s.length() - 1;

        while (i >= 0) {

            // Trailing spaces ko remove/skip karo
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // Agar string khatam ho gayi, loop stop
            if (i < 0) {
                break;
            }

            // Word ke end ka index store karo
            int j = i;

            // Word ke start tak left move karo
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Word ko extract karke answer mein add karo
            ans.append(s.substring(j + 1, i + 1));

            // Agar pichhe spaces hain, unhe skip karo
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            // Agla word add karne se pehle space lagao
            if (j >= 0) {
                ans.append(' ');
            }

            // Agle word ki taraf move karo
            i = j;
        }

        // Final reversed sentence return karo
        return ans.toString();
    }
}
