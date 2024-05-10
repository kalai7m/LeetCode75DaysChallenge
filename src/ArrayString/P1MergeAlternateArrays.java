package ArrayString;
//https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
public class P1MergeAlternateArrays {
    static String mergeAlternately(String w1, String w2) {
        int i = 0, j = 0, k = 0;
        int n = w1.length();
        int m = w2.length();
        char[] res = new char[n + m];

        while (i < n || j < m) {
            if (i < n) {
                res[k++] = w1.charAt(i++);
            }

            if (j < m) {
                res[k++] = w2.charAt(j++);
            }
        }

        return new String(res);
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
