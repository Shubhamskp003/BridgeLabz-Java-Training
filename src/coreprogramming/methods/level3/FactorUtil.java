package coreprogramming.methods.level3;

class FactorUtil {

    static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }




}
