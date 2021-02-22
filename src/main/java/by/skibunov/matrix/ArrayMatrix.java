package by.skibunov.matrix;

import by.skibunov.constant.Constant;

public class ArrayMatrix {

    public final int n = Constant.n;
    public final int m = Constant.m;
    public final double k = Constant.k;

    private double[][] matrix = new double[3][4];

    public ArrayMatrix() {
        matrix[0][0] = (2 + k);
        matrix[0][1] = 0.25;
        matrix[0][2] = 0.75;
        matrix[0][3] = 3 + k;

        matrix[1][0] = 0.25;
        matrix[1][1] = (1.5 + k);
        matrix[1][2] = 0.45;
        matrix[1][3] = 2.2 + k;

        matrix[2][0] = 0.75;
        matrix[2][1] = 0.45;
        matrix[2][2] = (3 + k);
        matrix[2][3] = 4.2 + k;
    }

    public double[][] getMatrix() {
        return matrix;
    }

}
