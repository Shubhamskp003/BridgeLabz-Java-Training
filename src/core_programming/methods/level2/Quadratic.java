package core_programming.methods.level2;

import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            return new double[]{
                    (-b + Math.sqrt(delta)) / (2 * a),
                    (-b - Math.sqrt(delta)) / (2 * a)
            };

        } else if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }
        return new double[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c: ");
        double[] roots = findRoots(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        for (double r : roots) System.out.println("Root: " + r);
        sc.close();
    }
}
