package coreprogramming.methods.level3;

class NumberChecker {

    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] digitsArray(int n) {
        int[] d = new int[countDigits(n)];
        int i = d.length - 1;
        while (n > 0) {
            d[i--] = n % 10;
            n /= 10;
        }
        return d;
    }

    static boolean isDuck(int[] d) {
        for (int x : d) if (x != 0) return true;
        return false;
    }

    static boolean isArmstrong(int n) {
        int[] d = digitsArray(n);
        int pow = d.length, sum = 0;
        for (int x : d)
            sum += Math.pow(x, pow);
        return sum == n;
    }

    static void largestSecondLargest(int[] d) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max) { smax = max; max = x; }
            else if (x > smax && x != max) smax = x;
        }
        System.out.println("Largest: " + max + " Second Largest: " + smax);
    }

    static void smallestSecondSmallest(int[] d) {
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min) { smin = min; min = x; }
            else if (x < smin && x != min) smin = x;
        }
        System.out.println("Smallest: " + min + " Second Smallest: " + smin);
    }
}
