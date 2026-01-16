package core_programming.methods.level3;

class PalindromeUtil {

    static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++)
            r[i] = d[d.length - 1 - i];
        return r;
    }

    static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isPalindrome(int n) {
        int[] d = NumberChecker.digitsArray(n);
        return arraysEqual(d, reverse(d));
    }
}
