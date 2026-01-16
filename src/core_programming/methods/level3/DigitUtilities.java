package core_programming.methods.level3;

class DigitUtilities {

    static int sumDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    static boolean isHarshad(int n) {
        int[] d = NumberChecker.digitsArray(n);
        return n % sumDigits(d) == 0;
    }

    static int[][] digitFrequency(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int x : d) freq[x][1]++;
        return freq;
    }
}

